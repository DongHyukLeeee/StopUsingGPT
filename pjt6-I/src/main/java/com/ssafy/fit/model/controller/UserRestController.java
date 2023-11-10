package com.ssafy.fit.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.fit.model.dto.User;
import com.ssafy.fit.model.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user-api")
@Api(tags ="유저관리 컨트롤러")
public class UserRestController{
	
	// 의존성 주입
	@Autowired
	private UserService service;

	
	//로그아웃
	private void logOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
	}


	//수정-post
	@PutMapping("/")
	@ApiOperation(value = "유저 정보 수정")
	public ResponseEntity<Void> update(User user, HttpServletRequest request){
		HttpSession session = request.getSession();
		String presentid = (String) session.getAttribute("presentid");
		if(user.getId().equals(presentid)) {
			service.UpdateUserService(user);			
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//회원탈퇴-post
	@DeleteMapping("/")
	@ApiOperation(value = "회원 탈퇴")
	public ResponseEntity<Void> delete(HttpServletRequest request){
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("presentid");
		service.deleteUserService(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// 로그인 기능 완료 - post
	@GetMapping("/")
	@ApiOperation(value = "로그인")
	public ResponseEntity<Boolean> login(String id, String password, HttpServletRequest request){
		User user = service.signInService(id, password);
		boolean answer = false;
		if(user.getId().equals(id)) {
			answer = true;		
			HttpSession session = request.getSession();
			session.setAttribute("presentid", id);
			System.out.println((String)session.getAttribute("presentid"));
		}
		return new ResponseEntity<Boolean>(answer, HttpStatus.OK);
	}

	
	@PostMapping("/")
	@ApiOperation(value = "회원가입")
	public ResponseEntity<Void> signup(User user){
		service.signUpService(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	

}
