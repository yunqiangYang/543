package com.yyq.demo.dao;

import com.github.pagehelper.PageInfo;
import com.yyq.demo.MybatisMapperApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisMapperApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void page() {
        PageInfo page = userService.page();
        System.out.println("");
    }
}