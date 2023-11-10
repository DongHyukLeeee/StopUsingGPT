package com.ssafy.fit.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.fit.model.dto.User;

public interface UserService {
	
	//회원가입
	void signUpService(User user);
	
	//로그인
	User signInService(String id, String password);
	
	//회원탈퇴
	void deleteUserService(String id);
	
	//정보수정
	void UpdateUserService(User user);
	

}
