package com.mahesh.crudjdbc.CRUDJDBC.dao;

import com.mahesh.crudjdbc.CRUDJDBC.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserInfoAccess {
    int save(UserInfo userInfo);
    int update(UserInfo userInfo , int id);
    int delete(int id);
    List<UserInfo> getUsersInfo();
    UserInfo getUserInfoById(int id);
}
