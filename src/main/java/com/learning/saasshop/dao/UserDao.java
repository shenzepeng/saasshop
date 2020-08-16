package com.learning.saasshop.dao;

import com.learning.saasshop.mapper.UserMapper;
import com.learning.saasshop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public Integer addUser(User user){
        return userMapper.insert(user);
    }
    public Integer updateUser(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public List<User> login(String phoneNumber,Long pid){
        Example example=new Example(User.class);
        example.createCriteria()
                .andEqualTo("phoneNumber",phoneNumber)
                .andEqualTo("pid",pid);
        return userMapper.selectByExample(example);
    }

}
