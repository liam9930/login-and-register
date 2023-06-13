package com.weitzai.service;

import com.weitzai.entity.UserVO;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface IUserVoService {

  List<UserVO> findAllUserVo();

  UserVO findUserVoByUsername(String username);

  ModelAndView showLoginUserDetail(ModelMap model, HttpSession session);

}
