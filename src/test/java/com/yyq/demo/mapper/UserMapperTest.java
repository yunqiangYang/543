package com.yyq.demo.mapper;

import com.yyq.demo.MybatisMapperApplication;
import com.yyq.demo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisMapperApplication.class)
public class UserMapperTest {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() throws Exception{
        List<User> users = userMapper.selectAll();
        System.out.println("");
    }

    @Test
    public void create() throws Exception{
        User user = new User();
        user.setUsername("12345");
        user.setPassword("3453543");
        user.setAge(12);
        userMapper.insertSelective(user);
        System.out.println("");
    }

    @Test
    public void createList(){
        List<User> list = new ArrayList<>();

        for(int i=0;i<20;i++){
            User user = new User();
            user.setUsername("zz"+i);
            user.setPassword(""+11111111*i);
            user.setAge(i);
            list.add(user);
            userMapper.insertSelective(user);
        }
        //userMapper.insertList(list);

    }



}