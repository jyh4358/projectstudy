package kr.co.softcampus.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.UserBean;

@Controller
public class MainController {

	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
}
