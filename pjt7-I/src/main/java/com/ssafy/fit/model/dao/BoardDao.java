package com.ssafy.fit.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssafy.fit.model.dto.Board;


// DB 느낌 나게 작성
public interface BoardDao {

	// 게시글 전체 조회
	List<Board> selectAll(String youtubeId);
	
	// 게시글 등록
	void insertBoard(String youtubeId, String title, String content, String presentid);
	

	// 게시글 상세 조회
	Board selectOne(@Param("youtubeId") String youtubeId,@Param("id") int id);

	// 게시글 수정
	void updateBoard(String youtubeId, String title, String content, String presentid);

	// 게시글 삭제
	void deleteBoard(@Param("youtubeId") String youtubeId,@Param("id") int id);

	// 조회수 증가
	void updateViewCnt(@Param("youtubeId") String youtubeId,@Param("id") int id);

}
