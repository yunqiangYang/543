package com.yyq.demo.dao;

import com.github.pagehelper.PageInfo;
import com.yyq.demo.domain.User;

public interface UserService {
    PageInfo<User> page();
}
