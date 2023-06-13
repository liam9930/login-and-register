package com.weitzai.mapper;

import com.weitzai.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoMapper {

    List<Todo> findAllTodo();


    Todo findTodoById(int id);


    int add(Todo todo);

    int deletByTodoId(int id);



}
