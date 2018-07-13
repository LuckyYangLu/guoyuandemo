package com.guoyuan.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.guoyuan.springboot.dao.UserDao;
import com.guoyuan.springboot.entities.User;
import com.guoyuan.springboot.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=true)
	public User login(String userName) {
		User userInfo = userDao.loginAuthorization(userName);
		return userInfo;
	}

}
