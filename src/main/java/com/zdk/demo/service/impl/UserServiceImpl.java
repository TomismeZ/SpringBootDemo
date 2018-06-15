package com.zdk.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdk.demo.bean.User;
import com.zdk.demo.mapper.UserMapper;
import com.zdk.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userMapper.getUserList();
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

	@Override
	public int update(Integer id, User user) {
		// TODO Auto-generated method stub
		return userMapper.update(id, user);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}

}
