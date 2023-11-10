package com.ssafy.fit.model.service;

import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.fit.model.dao.MainDao;
import com.ssafy.fit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService{

	private MainDao mainDao;
	
	@Autowired
	public void setMainDao(MainDao mainDao) {
		this.mainDao = mainDao;
	}
	
	//영상목록 전체 조회
	@Override
	public List<Video> getList() {
		return mainDao.selectAll();
	}
	
	//조회순 정렬
	@Override
	public List<Video> getList(String desc) {
		return mainDao.selectAll(desc);
	}
	
	//부위별 정렬
	@Override
	public List<Video> getPartVideo(String part) {
		return mainDao.selectPart(part);
	}
	
	
	//영상 상세 조회
	@Override
	public Video getVideo(String title) {
		return mainDao.selectOne(title);
	}

	//검색한 비디오 전체 조회
	@Override
	public LinkedHashSet<Video> getVideoSearchList(String title) {
		return mainDao.selectVideoSearchAll(title);
	}

}


