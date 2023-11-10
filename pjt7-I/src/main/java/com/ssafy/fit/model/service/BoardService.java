package com.ssafy.fit.model.service;

import java.util.List;

import com.ssafy.fit.model.dto.Board;


public interface BoardService {
	//리뷰

	// 게시글 전체 조회
	List<Board> getList(String youtubeId);
	
	// 게시글 등록
	void writeBoard(String youtubeId, String title, String content, String presentid);
	
	// 게시글 상세 조회
	Board getBoard(String youtubeId, int id);
	
	// 게시글 수정
	void modifyBoard(String youtubeId, String title, String content, String presentid);
	
	// 게시글 삭제
	void removeBoard(String youtubeId, int id);
}
