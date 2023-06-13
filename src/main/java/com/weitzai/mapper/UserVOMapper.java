package com.weitzai.mapper;

import com.weitzai.entity.UserVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserVOMapper {

    List<UserVO> findAllUserVo();

    UserVO findUserVoByUsername(String username);


}
