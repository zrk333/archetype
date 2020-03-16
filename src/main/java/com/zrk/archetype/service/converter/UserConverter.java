package com.zrk.archetype.service.converter;

import com.zrk.archetype.model.UserDO;
import com.zrk.archetype.model.UserDTO;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/3/16
 */
public interface UserConverter {

    /**
     * DOToDTO
     * @param userInfo
     * @return
     */
    UserDTO converterDOToDTO(UserDO userInfo);
}
