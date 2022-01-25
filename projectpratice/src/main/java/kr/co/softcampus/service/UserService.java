package kr.co.softcampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softcampus.beans.UserBean;
import kr.co.softcampus.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean CheckUserId(String user_id) {
		
		String checkUserId = userDao.CheckUserId(user_id);
		
		if(checkUserId == null) {
			return true;
		}else {
			return false;
		}	
	}
	
	public void addUserInfo(UserBean joinUserBean) {
		userDao.addUserInfo(joinUserBean);
	}
}
