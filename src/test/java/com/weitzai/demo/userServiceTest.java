package com.weitzai.demo;

import com.weitzai.entity.User;
import com.weitzai.mapper.UserMapper;
import com.weitzai.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class userServiceTest {
    @Autowired
    IUserService userService;

    @Test
    public void findAllUser(){
        List<User> list = userService.findAllUser ();
        list.forEach (user -> System.out.println (user));
    }
    @Test
    public void findUserByUsername(){
        User user =userService.findUserByUsername ("bigcute");
        System.out.println (user);
    }

    @Test
    public void addTest(){
        User user = new User();
        user.setUsername ("super");
        user.setEmail ("super@gmail.com");
        user.setGender (1);
        user.setPassword ("a12");
        user.setNickname ("superman");
        user.setCreatetime (LocalDateTime.now ());
        System.out.println (user);

        userService.add (user);


    }

    @Test
    public void deleteTest(){
        User user = userService.findUserByUsername ("Wolverine");
        System.out.println (user);
        userService.deletById (user.getId ());

    }


}
