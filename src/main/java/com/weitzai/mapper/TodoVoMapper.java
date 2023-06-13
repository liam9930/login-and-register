package com.weitzai.mapper;

import com.weitzai.entity.TodoVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoVoMapper {

    List<TodoVo> findAllTodoVo();

    List<TodoVo> findTodoVoByUsername(String username);


}
