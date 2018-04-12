package com.wzy.dubbo.demo.impl;

import com.wzy.bean.UserInfo;
import com.wzy.dubbo.demo.UserService;
import com.wzy.service.IUserInfoService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService{

    @Resource
    private IUserInfoService iUserInfoService;

    @Override
    public List<UserInfo> getAll() {
        return iUserInfoService.getAll();
    }
}
