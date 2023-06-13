package com.weitzai.demo;

import com.weitzai.entity.User;
import com.weitzai.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class userMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void findAllUser(){
        List<User> list = userMapper.findAllUser ();
        list.forEach (user -> System.out.println (user));
    }
    @Test
    public void findUserByUsername(){
        User user =userMapper.findUserByUsername ("bigcute");
        System.out.println (user);
    }

    @Test
    public void addTest(){
        User user = new User();
        user.setUsername ("Wolverine");
        user.setEmail ("Wolverine@gmail.com");
        user.setGender (1);
        user.setPassword ("a123456");
        user.setNickname ("金剛狼");
        user.setCreatetime (LocalDateTime.now ());
        System.out.println (user);

        userMapper.add (user);


    }

    @Test
    public void deleteTest(){

        User user = userMapper.findUserByUsername ("Wolverine");
        System.out.println (user);
        userMapper.deletById (user.getId ());

    }


}
