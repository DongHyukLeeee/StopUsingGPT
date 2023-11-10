package com.ssafy.fit.model.dto;

import java.util.Date;

public class Board {
	private int id;
	private int videoReviewId;
	private String title;
	private String writer;
	private String content;
	private String regDate;
	private int viewCnt;
	private String youtubeId;

	public Board() {
	}

	public Board(String title, String writer, String content, String youtubeId ) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date().toString();
		this.youtubeId = youtubeId;
	}

	public Board(int videoReviewId, String title, String writer, String content, int viewCnt, String youtubeId) {
		super();
		this.videoReviewId = videoReviewId;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date().toString();
		this.viewCnt = viewCnt;
		this.youtubeId = youtubeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	public String getYoutubeId() {
		return youtubeId;
	}

	public void setYoutubeId(String youtubeId) {
		this.youtubeId = youtubeId;
	}
	

	public int getVideoReviewId() {
		return videoReviewId;
	}

	public void setVideoReviewId(int videoReviewId) {
		this.videoReviewId = videoReviewId;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", videoReviewId=" + videoReviewId + ", title=" + title + ", writer=" + writer
				+ ", content=" + content + ", regDate=" + regDate + ", viewCnt=" + viewCnt + ", youtubeId=" + youtubeId
				+ "]";
	}


}
