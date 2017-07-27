package com.bwie.service;

import com.bwie.entity.User;
import java.util.List;

/**
 * Created by MrWang on 2017/7/24.
 */
public interface UserService {
    //登录
    public User login(User user);

    //注册
    public void save(User user);

    //查询
    public List<User> findAll();

    //根据id删除
    public void deleteById(User user);

    //修改前要查询的单条数据
    public User selectUserById(User user);

    //根据id修改
    public void updateById(User user);

    //验证用户名是否存在
    public User userExist(User user);

}
