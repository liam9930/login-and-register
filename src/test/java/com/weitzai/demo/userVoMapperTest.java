package com.weitzai.demo;
import com.weitzai.entity.UserVO;
import com.weitzai.mapper.UserVOMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class userVoMapperTest {
    @Autowired
    UserVOMapper userVOMapper;

    @Test
    public void findAllUserVo(){
        List<UserVO> list = userVOMapper.findAllUserVo ();
        list.forEach (user -> System.out.println (user));
    }
    @Test
    public void findUserVoByUsername(){
        UserVO userVo =userVOMapper.findUserVoByUsername ("bigcute");
        System.out.println (userVo);
    }



}
