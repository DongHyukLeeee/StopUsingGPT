package com.ssafy.fit.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.fit.model.dto.Video;
import com.ssafy.fit.model.service.BoardService;
import com.ssafy.fit.model.service.BoardServiceImpl;
import com.ssafy.fit.model.service.VideoService;
import com.ssafy.fit.model.service.VideoServiceImpl;


//@WebServlet("/videoSearch")
public class VideoSearchController extends HttpServlet {

//	private VideoService mainservice = VideoServiceImpl.getInstance();
//	private BoardService service = BoardServiceImpl.getInstance();
//
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		if (req.getMethod().equals("POST")) {
//			req.setCharacterEncoding("UTF-8");
//		}
//
//		String act = req.getParameter("act");
//
//		switch (act) {
//		case "videosearchlist": // 검색결과 화면으로 
//			doVideoSearch(req, resp);
//			break;
//		default:
//			break;
//		}
//	}
//
//	//get
//	private void doVideoSearch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// 여기에 검색 결과 담아서 보내기
//		String videoTitle = req.getParameter("videoTitle");
//		req.setAttribute("list", mainservice.getVideoSearchList(videoTitle));
//		req.getRequestDispatcher("/main/main.jsp").forward(req, resp);
//	}

}