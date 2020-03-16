package com.zrk.archetype.service;

import com.zrk.archetype.model.web.ResultStatus;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/3/16
 */
public interface UserService {

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    ResultStatus getUserInfo(Long userId);
}
