package kr.co.softcampus.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softcampus.beans.BoardInfoBean;
import kr.co.softcampus.mapper.TopMenuMapper;

@Repository
public class TopMenuDao {

	@Autowired
	TopMenuMapper topMenuMapper;
	
	public List<BoardInfoBean> getTopMenuList(){
		return topMenuMapper.getTopMenuList();
	}
}