package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupico.dreaifeapicommon.model.entity.InterfaceInfo;

/**
* @author 87726
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-07-30 21:54:42
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
