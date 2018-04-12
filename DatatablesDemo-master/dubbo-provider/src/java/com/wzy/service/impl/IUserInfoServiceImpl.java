package com.wzy.service.impl;

import com.wzy.bean.UserInfo;
import com.wzy.dao.IUserInfoDao;
import com.wzy.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("iUserInfoService")
public class IUserInfoServiceImpl implements IUserInfoService {

    @Resource
    private IUserInfoDao iUserInfoDao;

    @Override
    public List<UserInfo> getAll() {
        return iUserInfoDao.getAll();
    }
}
