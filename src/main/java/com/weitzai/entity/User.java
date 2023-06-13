package com.weitzai.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class User {
    private Integer id;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private Integer gender;
    private Integer role;
    private LocalDateTime createtime;
}
