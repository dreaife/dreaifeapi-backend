package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupico.dreaifeapicommon.model.entity.UserInterfaceInfo;

/**
* @author 87726
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-08-14 22:10:39
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     */
    boolean invokeCount(long interfaceInfoId,long userId);
}
