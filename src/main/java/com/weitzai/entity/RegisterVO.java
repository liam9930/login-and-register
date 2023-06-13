package com.weitzai.entity;

import lombok.Data;

@Data
public class RegisterVO {
    private String user_name;
    private String user_nickname;
    private String user_password;
    private Integer user_gender;
    private String user_email;


}
