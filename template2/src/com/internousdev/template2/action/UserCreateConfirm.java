package com.internousdev.template2.action;

import java.util.Map;

import org.apache.struts2.intercepter.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessioAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object>session;
	private String errorMessage;

	public String execute(){

		String result = SUCCESS;


		if(((loginUserId.equals(""))
			&& !(loginPassword.equals(""))
			&& 1(userName.equals("")){

			session.put("loginUserId",loginUserId);
			session.put("loginPassword",loginPassword);
			session.put("userName",userName);
		}else{
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}
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

	public void setUserName(String userName){
		this.userName = userName;
 	}

	public String getUserName(){
		return userName;
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