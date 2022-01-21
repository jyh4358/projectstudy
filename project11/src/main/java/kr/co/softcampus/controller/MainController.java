package kr.co.softcampus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.BoardInfoBean;
import kr.co.softcampus.beans.ContentBean;
import kr.co.softcampus.service.IndexService;
import kr.co.softcampus.service.TopMenuService;

@Controller
public class MainController {

	@Autowired
	private IndexService indexService;
	
	@Autowired
	private TopMenuService topMenuService;
	
	@GetMapping("/index")
	public String index(Model model) {
		ArrayList<List<ContentBean>> list = new ArrayList<List<ContentBean>>();
		
		for (int i = 1; i <= 4; i++) {
			List<ContentBean> list1 = indexService.getMainList(i);
			list.add(list1);
		}

		model.addAttribute("list", list);
		
		List<BoardInfoBean> board_list = topMenuService.getTopMenuList();
		model.addAttribute("board_list", board_list);

		return "index";
	}

}
