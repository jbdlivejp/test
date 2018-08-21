package com.internousdev.ecsite3.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.UserListDAO;
import com.internousdev.ecsite3.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private UserListDAO userListDAO = new UserListDAO();
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}

		if(deleteFlg == null){
			String user_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();
			userList = userListDAO.getUserInfo(user_transaction_id, user_master_id);

		}else if(deleteFlg.equals("1")){
			delete();
		}

		String result = SUCCESS;
		return result;
	}

	public void delete() throws SQLException{

		String user_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = userListDAO.userListHistoryDelete(user_transaction_id, user_master_id);

		if(res > 0){
			userList = null;
			setMessage(" 商品情報を正しく削除しました。");

		}else if(res == 0){
			setMessage("商品情報の削除に失敗しました。");
		}

	}

	public String getDeleteFlg(){
		return this.deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> Session){
		this.session = Session;
	}


	public ArrayList<UserListDTO> getUserList(){
		return this.userList;
	}

	public void setUserList(ArrayList<UserListDTO> userList) {
		this.userList = userList;
	}

	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message = message;
	}
}