package com.zrk.archetype.service.impl;

import com.zrk.archetype.dao.UserInfoDao;
import com.zrk.archetype.model.UserDTO;
import com.zrk.archetype.model.web.ResultStatus;
import com.zrk.archetype.request.UserRequest;
import com.zrk.archetype.service.UserService;
import com.zrk.archetype.service.converter.UserConverter;
import com.zrk.archetype.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/3/16
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserInfoDao userInfoDao;

    @Resource
    private UserConverter userConverter;

    @Override
    public ResultStatus getUserInfo(Long userId) {
        UserRequest userRequest = new UserRequest();
        userRequest.setUserId(userId);
        UserDTO userDTO = userConverter.converterDOToDTO(userInfoDao.getUserInfo(userRequest));
        UserVo userVo = new UserVo();
        userVo.setUserId(userDTO.getUserId());
        userVo.setUserName(userDTO.getUserName());
        ResultStatus resultStatus = new ResultStatus();
        resultStatus.setData(userVo);
        return resultStatus;
    }
}
