package com.weitzai.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Todo {
    private Integer id;
    private String todo;
    private Integer user_id;
    private LocalDateTime createtime;
}
