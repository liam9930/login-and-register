package com.weitzai.service;

import com.weitzai.entity.User;

import java.util.List;

public interface IUserService {
    void add(User user);

    List<User> findAllUser();

    int deletById(int id);

    User findUserByUsername(String user_name);
}
