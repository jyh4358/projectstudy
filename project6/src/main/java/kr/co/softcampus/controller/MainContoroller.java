package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoroller {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
