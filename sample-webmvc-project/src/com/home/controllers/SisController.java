package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getmakeup() {
		return "Here.. take your makeup";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getbook() {
		return "Here.. take your books";
	}
}
