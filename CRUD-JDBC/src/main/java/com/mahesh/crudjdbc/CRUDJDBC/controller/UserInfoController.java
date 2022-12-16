package com.mahesh.crudjdbc.CRUDJDBC.controller;

import com.mahesh.crudjdbc.CRUDJDBC.dao.UserInfoDAO;
import com.mahesh.crudjdbc.CRUDJDBC.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoDAO userinfodao;

    @GetMapping("/users")
    public List<UserInfo> getUsersInfo(){
        return userinfodao.getUsersInfo();
    }

    @GetMapping("/users/{id}")
    public UserInfo getUserInfo(@PathVariable int id){
        return userinfodao.getUserInfoById(id);
    }

    @PostMapping("/users")
    public String addUserInfo(@RequestBody UserInfo userInfo){
        return userinfodao.save(userInfo)+" row Added!!";
    }

    @PutMapping("/users/{id}")
    public String updateUserInfo(@PathVariable int id , @RequestBody UserInfo userInfo){
        return userinfodao.update(userInfo,id)+" row updated";
    }

    @DeleteMapping("/users/{id}")
    public String removeUserData(@PathVariable int id){
        return userinfodao.delete(id)+" row deleted";
    }


}
