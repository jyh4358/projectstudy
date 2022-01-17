package kr.co.softcampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.softcampus.service.TopMenuService;

@Controller
@RequestMapping("/board")
public class BoardContoller {
	

	

	@GetMapping("/main")
	public String main() {
		return "board/main";
	}
	
	@GetMapping("/read")
	public String read() {
		return "board/read";
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	
	@GetMapping("/modify")
	public String modify() {
		return "board/modify";
	}
}
