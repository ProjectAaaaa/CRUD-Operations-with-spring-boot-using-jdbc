package com.mahesh.crudjdbc.CRUDJDBC.dao;

import com.mahesh.crudjdbc.CRUDJDBC.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserInfoDAO implements UserInfoAccess{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(UserInfo userInfo) {
        return jdbcTemplate.update("INSERT INTO emp_data (name,age,email,city) VALUES (?,?,?,?)",
                new Object[]{
                        userInfo.getName(),
                        userInfo.getAge(),
                        userInfo.getEmail(),
                        userInfo.getCity()});
    }

    @Override
    public int update(UserInfo userInfo, int id) {
        return jdbcTemplate.update("UPDATE emp_data SET name=? , age=? , email=? , city=? WHERE id=? ",
                new Object[] {
                        userInfo.getName(),
                        userInfo.getAge(),
                        userInfo.getEmail(),
                        userInfo.getCity(),
                        id} );
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM emp_data WHERE id=?",id);
    }

    @Override
    public List<UserInfo> getUsersInfo() {
        return jdbcTemplate.query("SELECT * FROM emp_data" , new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
    }

    @Override
    public UserInfo getUserInfoById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM emp_data WHERE id=?" , new BeanPropertyRowMapper<UserInfo>(UserInfo.class) , id);
    }
}
