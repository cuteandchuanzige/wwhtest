package com.bwie.mapper;

import com.bwie.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by MrWang on 2017/7/24.
 */
@Mapper
@Component
public interface UserMapper {

    //登录
    @Select("select username,password from user where username = #{username} and password = #{password} ")
    public User login(User user);

    //注册
    @Insert("insert into user (username,password,age,sex) values (#{username},#{password},#{age},#{sex})")
    public void save(User user);

    //查询
    @Select("select * from user")
    public List<User> findAll();

    //根据id删除
    @Delete("delete from user where id = #{id}")
    public void deleteById(User user);

    //修改前要查询的单条数据
    @Select("select * from user where id = #{id}")
    public User selectUserById(User user);

    //根据id修改
    @Update("update user set username = #{username},password = #{password},age = #{age},sex = #{sex} where id = #{id}")
    public void updateById(User user);

    //验证用户名是否存在
    @Select("select username from user where username = #{username}")
    public User userExist(User user);



}
