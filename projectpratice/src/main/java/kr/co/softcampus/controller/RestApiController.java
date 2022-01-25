package kr.co.softcampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softcampus.service.UserService;

@RestController
public class RestApiController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/checkUserId/{user_id}")
	public String checkUserId(@PathVariable String user_id) {
		
		boolean chk = userService.CheckUserId(user_id);
		System.out.println(chk);
		return chk + "";
	}
}
