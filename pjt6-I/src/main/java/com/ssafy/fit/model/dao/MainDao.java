package com.ssafy.fit.model.dao;

import java.util.LinkedHashSet;
import java.util.List;

import com.ssafy.fit.model.dto.Video;

// DB 느낌 나게 작성
public interface MainDao {

	// 영상목록 전체 조회
	List<Video> selectAll();

	// 전체 영상에 대한 조회순으로 정렬
	List<Video> selectAll(String desc);
	
	// 부위별 영상에 대해서 조회순으로 정렬
	List<Video> selectPart(String part);
	
	// 영상 상세 조회
	Video selectOne(String fitPartName);

	// 조회수 증가
	void updateViewCnt(String title);

	// 검색한 비디오 전체 조회
	LinkedHashSet<Video> selectVideoSearchAll(String title);
	
}
