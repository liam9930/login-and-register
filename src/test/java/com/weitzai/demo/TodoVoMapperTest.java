package com.weitzai.demo;

import com.weitzai.entity.TodoVo;
import com.weitzai.mapper.TodoVoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TodoVoMapperTest {
    @Autowired
    TodoVoMapper todoVoMapper;

    @Test
    public void findAllTodoVo(){
        List<TodoVo> list = todoVoMapper.findAllTodoVo ();
        list.forEach (todo -> System.out.println (todo));
    }
    @Test
    public void findUserByUsername(){
        List<TodoVo> list = todoVoMapper.findTodoVoByUsername ("bigcute");
        list.forEach (todo -> System.out.println (todo));
    }
//
//    @Test
//    public void addTest(){
//        User user = new User();
//        user.setUsername ("Wolverine");
//        user.setEmail ("Wolverine@gmail.com");
//        user.setGender (1);
//        user.setPassword ("a123456");
//        user.setNickname ("金剛狼");
//        user.setCreatetime (LocalDateTime.now ());
//        System.out.println (user);
//
//        userMapper.add (user);
//
//
//    }
//
//    @Test
//    public void deleteTest(){
//
//        User user = userMapper.findUserByUsername ("Wolverine");
//        System.out.println (user);
//        userMapper.deletById (user.getId ());
//
//    }


}
