package com.chenll.dao;

import com.chenll.mybatis.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();
}
