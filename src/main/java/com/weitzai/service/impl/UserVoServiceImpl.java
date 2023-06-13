package com.weitzai.service.impl;

import com.weitzai.entity.UserVO;
import com.weitzai.mapper.UserVOMapper;
import com.weitzai.service.IUserVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserVoServiceImpl implements IUserVoService {

    @Autowired
    UserVOMapper userVoMapper;
    @Override
    public List<UserVO> findAllUserVo(){
        return userVoMapper.findAllUserVo ();
    }
    @Override
    public UserVO findUserVoByUsername(String username){
        return userVoMapper.findUserVoByUsername (username);
    };


    @Override
    public ModelAndView showLoginUserDetail(ModelMap model, HttpSession session) {
        //查詢前端訪問的使用者名稱是否存在

        UserVO userVO =userVoMapper.findUserVoByUsername ((String) session.getAttribute ("username"));

        System.out.println (userVO);
        model.put ("user_id",userVO.getId ());
        model.put ("user_name", userVO.getUsername ());
        model.put ("user_nickname", userVO.getNickname ());
        model.put ("user_gender", userVO.getGender ());
        model.put ("user_email",userVO.getEmail ());
        model.put ("role_name",userVO.getRoleName ());
        return new ModelAndView ("index",model);

    }
}
