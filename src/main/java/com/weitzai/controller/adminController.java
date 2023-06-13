package com.weitzai.controller;

import com.weitzai.entity.UserVO;
import com.weitzai.service.IUserService;
import com.weitzai.service.IUserVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class adminController {

    @Autowired
    IUserVoService userVoService;
    @Autowired
    IUserService userService;


    @GetMapping ("/index_admin.html")
    public ModelAndView list (ModelMap model){
        List<UserVO> list=userVoService.findAllUserVo ();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", list);
        modelAndView.setViewName("index_admin");

        return modelAndView;
    }



    @RequestMapping(path = "/del")
    public ModelAndView deleteUser(@RequestParam (name="userId") Integer userId){
        userService.deletById (userId);

        return new ModelAndView ("redirect:/index_admin.html");
    }

}
