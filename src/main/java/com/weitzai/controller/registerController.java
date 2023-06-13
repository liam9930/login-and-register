package com.weitzai.controller;

import com.weitzai.entity.RegisterVO;
import com.weitzai.entity.User;
import com.weitzai.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class registerController {

    @Autowired
    IUserService userService;
    @GetMapping("/register.html")
    public ModelAndView toRegister() {
        return new ModelAndView ("register");
    }

    @PostMapping("/toRegisterSuccess")
    public ModelAndView toRegisterSuccess(ModelMap model, RegisterVO registerVO) {

        log.debug ("得到登陸表單: {}",registerVO);

        try {
            System.out.println (registerVO);
            User addUser=new User ();
            addUser.setUsername (registerVO.getUser_name ());
            addUser.setPassword (registerVO.getUser_password ());
            addUser.setGender (registerVO.getUser_gender());
            addUser.setNickname (registerVO.getUser_nickname ());
            addUser.setRole (2);
            addUser.setEmail (registerVO.getUser_email ());
            addUser.setCreatetime (LocalDateTime.now ());
            System.out.println (addUser);
            userService.add (addUser);

            model.addAttribute("data","註冊成功，請登入");
            return new ModelAndView ("login");

        } catch (Exception e) {
            log.debug ("註冊失敗",e);
            model.addAttribute("data","註冊失敗,重新註冊");
            return new ModelAndView("redirect:/register.html");
        }
    }

}
