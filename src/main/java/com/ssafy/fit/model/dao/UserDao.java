package com.ssafy.fit.model.dao;

import com.ssafy.fit.model.dto.User;

//메서드 작성
public interface UserDao {
	
	//회원가입
	void signUp(User user);
	//로그인
	User signIn(String id, String pw);
	//회원 정보 수정
	void UpdateUser(User user);
	//회원탈퇴
	void deleteUser(String id);

}