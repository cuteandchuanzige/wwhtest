package com.bwie.service.impl;

import com.bwie.entity.User;
import com.bwie.mapper.UserMapper;
import com.bwie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MrWang on 2017/7/24.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);

    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void deleteById(User user) {
        userMapper.deleteById(user);

    }

    @Override
    public User selectUserById(User user) {
        return userMapper.selectUserById(user);
    }

    @Override
    public void updateById(User user) {
        userMapper.updateById(user);

    }

    @Override
    public User userExist(User user) {
        return userMapper.userExist(user);
    }
}
