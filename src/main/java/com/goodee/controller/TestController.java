package com.goodee.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.goodee.service.BBSService;
import com.goodee.vo.BBSVO;
import com.goodee.vo.UserVO;

@Controller
public class TestController {

	private BBSService service;

	public TestController(BBSService service) {
		this.service = service;
	}

	@GetMapping("/login")
	public String login(Model model) {
		
		return "login";
	}
	
	@GetMapping("/board")
	public String board(Model model, UserVO vo, HttpSession session) { //로그인. 
//		service.login(model, vo);
//		model.getAttribute("login");
//		System.out.println(vo.getUsername());

//		if (model.containsAttribute("login")) {
//			return "login";
//			
//		} else {
//			service.getList(model);
//			return "board";
//		}
		
		
//		session.setAttribute("login", vo);
//		service.login(vo);
	
//		session.setAttribute("userid", vo.getUserid());
//		session.setAttribute("password", vo.getPassword());
		
		
		
		if(service.login(model, vo, session)==1) {
			System.out.println(vo.getUsername());
			System.out.println(vo.getUserid());
			System.out.println(vo.getPassword());
//			session.setAttribute("login", vo);
			service.getList(model);
			return "board";
		} else {
			
			return "login";
		}
	}
	
	@GetMapping("/id/{id}")
	public String detail(Model model, @PathVariable("id") int id) {
		System.out.println("컨트롤러"+id);	
		service.detailList(model, id);
			
		return "detail";
	}
	
	@GetMapping("/write")
	public String write() {
		//service.insertList();
			
		return "write";
	}
	
	@GetMapping("/insert")
//	public String insert(BBSVO bbs, UserVO user) {
//		service.insertList(user, bbs);
//		return "board";
//	}
	public String insert(BBSVO bbs, HttpSession session, Model model) {
		System.out.println("서비스");
		
		
		
		service.insertList(bbs, session);
		service.getList(model);
		System.out.println("컨트롤러럴러");
		return "board";
	}
}
