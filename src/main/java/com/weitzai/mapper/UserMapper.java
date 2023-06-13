package com.weitzai.mapper;

import com.weitzai.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> findAllUser();

    User findUserByUsername(String username);

    int add(User user);
    int deletById(int id);


}
