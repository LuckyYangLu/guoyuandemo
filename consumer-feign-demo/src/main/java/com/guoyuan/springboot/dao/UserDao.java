package com.guoyuan.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.guoyuan.springboot.entities.User;

@Mapper
public interface UserDao {

	public User loginAuthorization(String userName);
}
