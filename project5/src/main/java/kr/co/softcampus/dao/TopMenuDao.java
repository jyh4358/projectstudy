package kr.co.softcampus.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softcampus.beans.BoardInfoBean;
import kr.co.softcampus.mapper.TopMenuMapper;

@Repository
public class TopMenuDao {

	@Autowired
	private TopMenuMapper menuMapper;
	
	public List<BoardInfoBean> getTopMenuList(){
		return menuMapper.getTopMenuList();
	}
	
}
