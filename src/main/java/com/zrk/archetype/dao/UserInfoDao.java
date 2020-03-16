package com.zrk.archetype.dao;

import com.zrk.archetype.model.UserDO;
import com.zrk.archetype.request.UserRequest;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/3/16
 */
public interface UserInfoDao {

    /**
     * 获取用户信息
     * @param request
     * @return
     */
    UserDO getUserInfo(@Param("request") UserRequest request);
}
