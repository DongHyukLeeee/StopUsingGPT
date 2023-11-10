package com.ssafy.fit.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.fit.model.dao.UserDao;
import com.ssafy.fit.model.dto.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//회원가입
	@Transactional
	@Override
	public void signUpService(User user) {
		userDao.signUp(user);
		
	}
	
	//로그인
	@Override
	public User signInService(String id, String pw) {
		return userDao.signIn(id, pw);
		
	}
	
	//회원탈퇴
	@Transactional
	@Override
	public void deleteUserService(String id) {
		userDao.deleteUser(id);
		
	}
	
	//회원정보수정
	@Transactional
	@Override
	public void UpdateUserService(User user) {
		userDao.UpdateUser(user);
		
	}

}
