package com.ssafy.fit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.fit.model.dao.BoardDao;
import com.ssafy.fit.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{

	private BoardDao boardDao;
	
	@Autowired
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	//게시글 전체 조회
	@Override
	public List<Board> getList(String youtubeId) {
		return boardDao.selectAll(youtubeId);
	}

	//게시글 등록
	@Transactional
	@Override
	public void writeBoard(String youtubeId, String title, String content, String presentid) {
		boardDao.insertBoard(youtubeId, title, content, presentid);
	}
	
	//게시글 상세 조회
	@Override
	public Board getBoard(String youtubeId, int id) {
		return boardDao.selectOne(youtubeId, id);
	}

	//게시글 수정
	@Transactional
	@Override
	public void modifyBoard(String youtubeId, String title, String content, String presentid) {
		boardDao.updateBoard(youtubeId, title, content, presentid);
	}

	//게시글 삭제
	@Transactional
	@Override
	public void removeBoard(String youtubeId, int id) {
		boardDao.deleteBoard(youtubeId, id);
	}

}
