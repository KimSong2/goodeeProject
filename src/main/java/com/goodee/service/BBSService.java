package com.goodee.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.goodee.dao.BBSDAO;
import com.goodee.vo.BBSVO;
import com.goodee.vo.UserVO;

@Service
public class BBSService {
	private BBSDAO dao;

	public BBSService(BBSDAO dao) {
		
		this.dao = dao;
	}
	
	public int login(Model model, UserVO vo, HttpSession session) {
		System.out.println(dao.login(vo));
		System.out.println(dao.login(vo).getId());
		System.out.println(dao.login(vo).getUsername());
		System.out.println(vo.getUsername());
		session.setAttribute("login", dao.login(vo));
		return (dao.login(vo)!=null) ? 1 : 0;
	} 
	
	public void getList(Model model) { 
		model.addAttribute("list",dao.getList());
	}
	
	public void detailList(Model model, int id) {
		System.out.println(id);
		model.addAttribute("list", dao.detailList(id));
	}
	
//	public void insertList(UserVO user, BBSVO bbs) {
//		bbs.setOwner(dao.login(user).getUsername());
	public void insertList(BBSVO bbs, HttpSession session) {
		System.out.println("암ㅇㄻ령ㄴㄻㄴ");
//		session.setAttribute("login", dao.);
		UserVO vo = (UserVO)session.getAttribute("login");
		bbs.setOwner(vo.getUsername() );
		bbs.setOwnerId(vo.getId());
		
		dao.insertList(bbs);
		
	}
	
	
}
