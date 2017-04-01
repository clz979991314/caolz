package com.one.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.dao.UserDao;
import com.one.entity.User;
import com.one.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	 @Autowired
	 private UserDao userDao;
	
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

}
