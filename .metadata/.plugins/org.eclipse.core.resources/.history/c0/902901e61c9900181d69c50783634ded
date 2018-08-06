package com.internousdev.template2.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.template2.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessioAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object>session;


	public String execute()throws SQLException{

		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("uerName").toString());

		String result = SUCCESS;

		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
 	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
 	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

	public void setErrorMessgae(String errorMessage){
		this.errorMessage = errorMessage;
 	}

	public String getErrorMessage(){
		return errorMessage;
	}

}
