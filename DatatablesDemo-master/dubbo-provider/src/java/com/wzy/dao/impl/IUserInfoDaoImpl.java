package com.wzy.dao.impl;

import com.wzy.bean.UserInfo;
import com.wzy.dao.IUserInfoDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("iUserInfoDao")
public class IUserInfoDaoImpl  extends BaseDao implements IUserInfoDao{


    public List<UserInfo> getAll() {
        // TODO Auto-generated method stub
        List<UserInfo> list = null;
        try {
            list = getSqlSession().selectList("IUserInfoDao.getAll");
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
