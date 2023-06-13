package com.weitzai.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TodoVo {

    private Integer id;
    private String todo;
    private String username;
    private LocalDateTime createtime;
}
