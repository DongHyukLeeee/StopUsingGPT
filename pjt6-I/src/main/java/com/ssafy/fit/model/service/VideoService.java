package com.ssafy.fit.model.service;

import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.fit.model.dto.Video;

@Service
public interface VideoService {

	// 게시글 전체 조회
	List<Video> getList();

	// 게시글 상세 조회
	Video getVideo(String title);
	
	// 부위별 동영상의 정보 조회 & 조회순 정렬
	List<Video> getPartVideo(String part);

	// 전체 동영상의 정보 조회 & 조회순 정렬
	List<Video> getList(String desc);
	
	// 검색 동영상 조회
	LinkedHashSet<Video> getVideoSearchList(String title);
}
