package kr.co.softcampus.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import kr.co.softcampus.beans.UserBean;

public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserBean userBean = (UserBean)target;
		
		String userBeanName = errors.getObjectName();
		
		if(userBeanName.equals("joinUserBean") ||userBeanName.equals("modifyUserBean")) {
			if(userBean.getUser_pw().equals(userBean.getUser_pw2()) == false) {
				errors.rejectValue("user_pw", "NotEquals");
				errors.rejectValue("user_pw2", "NotEquals");
			}
		}
		if(userBeanName.equals("joinUserBean")) {
			if(userBean.isUserIdExist() == false) {
				errors.rejectValue("user_id", "DontCheckUserIdExist");
			}
		}
	}
	
	

}
