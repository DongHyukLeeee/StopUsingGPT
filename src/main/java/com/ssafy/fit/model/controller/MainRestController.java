package com.ssafy.fit.model.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.fit.model.dto.Board;
import com.ssafy.fit.model.dto.Video;
import com.ssafy.fit.model.service.BoardService;
import com.ssafy.fit.model.service.VideoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/main-api")
@Api(tags ="동영상 컨트롤러")
public class MainRestController{
	@Autowired
	private VideoService mainservice;
	
	@Autowired
	private BoardService boardservice;

	// 영상 상세화면으로(리뷰 목록화면)-get
	@GetMapping("/detail/{youtubeId}")
	@ApiOperation(value = "영상 상세 조회", notes="영상상세화면과 리뷰 같이 출력되기 때문에 리뷰를 불러옴. 따라서 현재에는 리뷰가 없으면 스프링 부트에서 안 보일 수 있음" )
	public ResponseEntity<?> mainDetail(@PathVariable String youtubeId){
		List<Board> list = boardservice.getList(youtubeId);
		
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}


	// 메인 화면(조회수별, 부위별 영상)-get
	@GetMapping("/part/{fitPartName}")
	@ApiOperation(value = "영상 파트별 조회")
	public ResponseEntity<?> mainList(@PathVariable String fitPartName){
		List<Video> list = mainservice.getPartVideo(fitPartName);
		return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
	}
	
}