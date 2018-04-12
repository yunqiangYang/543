package com.yyq.demo.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yyq.demo.domain.User;
import com.yyq.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> page(){
        PageHelper.startPage(1,10);
        List<User> users = userMapper.selectAll();
        return new PageInfo<>(users);
    }

}
