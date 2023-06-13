package com.weitzai.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class UserVO {

    private Integer id;
    private String username;
    private String nickname;
    private String email;
    private String gender;
    private String roleName;
    private LocalDateTime createTime;

}
