package com.weitzai.controller;

import com.weitzai.entity.User;
import com.weitzai.service.IUserService;
import com.weitzai.service.IUserVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RestController
public class loginController {

    @Autowired
    IUserService userService;

    @Autowired
    IUserVoService userVoService;


    @GetMapping("/login")
    public ModelAndView showLoginForm(){
        return new ModelAndView ("login.html");
    }

    @PostMapping ("/dologin")
    public ModelAndView loginSuccess(String username,String password, ModelMap model, HttpSession session) {
        User user1 = userService.findUserByUsername (username);
        System.out.println (user1);

        if (user1 != null) { //如果使用者名稱存在
            if (user1.getPassword ().equals (password)) {

                System.out.println (user1);

                session.setAttribute ("username", username);

                if(user1.getRole ()==1){
                    return new ModelAndView("redirect:/index_admin.html") ;
                }
                return new ModelAndView ("redirect:/index.html");
            } else {
                model.put ("data", "密碼不正確");
                return new ModelAndView ("login");
            }

        } else { //使用者名稱不存在，直接返回到登入頁面
            model.put ("data", "該使用者不存在，請先註冊");
            return new ModelAndView ("login");
        }


    }

    @GetMapping ("/index.html")
    public ModelAndView successLogin (ModelMap model,HttpSession session){


        return userVoService.showLoginUserDetail (model,session);
    }


    @RequestMapping ("/toLogout")
    public ModelAndView tologout (HttpSession session){
        session.removeAttribute ("username");
        return new ModelAndView ("login");

    }


}
