package com.exe.cozy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

//	@RequestMapping("/index")
//	@ResponseBody
//	public String hello() {
//		return "���� ������";
//	}
	
	
	@RequestMapping("/")
	public String home() {
		return "index-2";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "log-in";
	}
	


}
