package com.weitzai.service.impl;

import com.weitzai.entity.User;
import com.weitzai.mapper.UserMapper;
import com.weitzai.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void add(User user){
        userMapper.add (user);
    }

    @Override
    public int deletById(int id) {
        return userMapper.deletById (id);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser ();
    }



    @Override
    public User findUserByUsername(String user_name) {
        return userMapper.findUserByUsername (user_name);
    }

}
