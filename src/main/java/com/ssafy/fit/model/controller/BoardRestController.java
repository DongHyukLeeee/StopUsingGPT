package com.ssafy.fit.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.fit.model.dto.Board;
import com.ssafy.fit.model.service.BoardService;
import com.ssafy.fit.model.service.UserService;
import com.ssafy.fit.model.service.VideoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/board-api")
@Api(tags ="리뷰 컨트롤러")
public class BoardRestController {
	
	@Autowired
	private BoardService service;

	@Autowired
	private VideoService mainservice;

	@Autowired
	private UserService userservice;

	
	// 리뷰 삭제-post
	@DeleteMapping("/main/{youtubeId}/{id}")
	@ApiOperation(value = "리뷰 삭제")
	public ResponseEntity<Void> delete(@PathVariable String youtubeId, int id){
		service.removeBoard(youtubeId, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	// 리뷰 수정 - post
	@PutMapping("/main/{youtubeId}/{id}")
	@ApiOperation(value = "리뷰 수정")
	public ResponseEntity<Void> update(String title, String content, @PathVariable String youtubeId, HttpServletRequest request){
		HttpSession session = request.getSession();
		String presentid = (String) session.getAttribute("presentid"); 
		service.modifyBoard(youtubeId, title, content, presentid);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// 리뷰 상세화면 - get
	@GetMapping("/board/{youtubeId}/{id}")
	@ApiOperation(value = "리뷰 조회")
	public ResponseEntity<Board> detail(@PathVariable String youtubeId, int id){
		Board board = service.getBoard(youtubeId, id);
		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}
	
	// 리뷰 등록 -post
	@PostMapping("/board/{youtubeId}")
	@ApiOperation(value = "리뷰 등록")
	public ResponseEntity<Void> write(@PathVariable String youtubeId, String title, String content, HttpServletRequest request){
		HttpSession session = request.getSession();
		String presentid = (String) session.getAttribute("presentid"); 
		service.writeBoard(youtubeId, title, content, presentid);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}


}
