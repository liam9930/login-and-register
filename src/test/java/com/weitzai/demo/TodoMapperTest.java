package com.weitzai.demo;

import com.weitzai.entity.Todo;
import com.weitzai.mapper.TodoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class TodoMapperTest {
    @Autowired
    TodoMapper todoMapper;

    @Test
    public void findAllTodo(){
        List<Todo> list = todoMapper.findAllTodo ();

        list.forEach (i -> System.out.println (i));
    }
    @Test
    public void findUserById(){
        Todo todo =todoMapper.findTodoById (5);
        System.out.println (todo);
    }

    @Test
    public void addTest(){
        Todo todo = new Todo();
        todo.setUser_id (4);
        todo.setCreatetime (LocalDateTime.now ());
        todo.setTodo ("曬棉被");
//        System.out.println (todo);

        todoMapper.add (todo);

    }

    @Test
    public void deleteTest(){

        System.out.println (todoMapper.deletByTodoId (8));

    }


}
