package com.cafe24.mysite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.mysite.service.MainService;
import com.cafe24.mysite.vo.MainVo;

//@Auth(role=Auth.Role.ADMIN)

@RequestMapping("/admin")
@Controller
public class AdminController {

	@Autowired	
	private MainService mainService;
	
	@RequestMapping({"", "/main"})
	public String main() {
		return "/admin/main";
	}
	
	@RequestMapping(value="/main/update", method = RequestMethod.POST)
	public String main_update(@ModelAttribute MainVo mainVo) {
		System.out.println(mainVo);
		mainService.updateInfo(mainVo);
		return "redirect:/admin/main";
	}
	
	
	
	@RequestMapping("/user")
	public String user() {
		return "/admin/user";
	}
	
	@RequestMapping("/board")
	public String board() {
		return "/admin/board";
	}
	
	@RequestMapping("/guestbook")
	public String guestbook() {
		return "/admin/guestbook";
	}
	
	
	
}
