package kr.co.softcampus.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softcampus.beans.UserBean;
import kr.co.softcampus.dao.UserDao;

@Service
public class UserSerivce {

	@Autowired
	private UserDao userDao;
	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;
	
	public boolean checkUserIdExist(String user_id) {
		String user_idCheck = userDao.checkUserIdExist(user_id);
		
		if(user_idCheck == null) {
			return true;
		}else
			return false;
	}
	public void addUserInfo(UserBean joinUserBean) {
		userDao.addUserInfo(joinUserBean);
	}
	
	public void getLoginUserInfo(UserBean tempLoginUserBean) {
		UserBean tempLoiginUserBean2 = userDao.getLoginUserInfo(tempLoginUserBean);
		
		if(tempLoiginUserBean2 != null) {
			loginUserBean.setUser_idx(tempLoiginUserBean2.getUser_idx());
			loginUserBean.setUser_name(tempLoiginUserBean2.getUser_name());
			loginUserBean.setUserLogin(true);
		}
		
	}
	public void modifyUserInfo(UserBean modifyUserBean) {
		modifyUserBean.setUser_idx(loginUserBean.getUser_idx());
		userDao.modifyUserInfo(modifyUserBean);
	}
}
