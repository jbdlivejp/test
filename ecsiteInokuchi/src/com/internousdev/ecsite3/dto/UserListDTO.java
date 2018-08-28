package com.internousdev.ecsite3.dto;

public class UserListDTO {

	private String id;

	private String loginUserId;

	private String loginUserPassword;

	private String userName;

	private String insert_date;

	public String getId() {
		return id;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginUserPassword() {
		return loginUserPassword;
	}

	public void setLoginUserPassword(String loginUserPassword) {
		this.loginUserPassword = loginUserPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public void setId(String id) {
		this.id = id;
	}


}
