package kr.co.softcampus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softcampus.beans.BoardInfoBean;
import kr.co.softcampus.beans.UserBean;
import kr.co.softcampus.dao.TopMenuDao;

@Service
public class TopMenuService {

	@Autowired
	private TopMenuDao menuDao;
	
	public List<BoardInfoBean> getTopMenuList(){
		return menuDao.getTopMenuList();
	}
	

}
