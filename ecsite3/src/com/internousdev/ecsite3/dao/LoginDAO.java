package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite3.dto.LoginDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class LoginDAO {

		private DBConnector dbConnector = new DBConnector();
		private Connection connection = dbConnector.getConnection();
		private LoginDTO loginDTO = new LoginDTO();

		public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword, String adminFlg){

		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ? AND admin_flg = ? ";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2,loginPassword);
			preparedStatement.setString(3,adminFlg);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));
				loginDTO.setAdminFlg(resultSet.getString("admin_flg"));

				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
				if(resultSet.getString("admin_flg").equals( "1")){
					loginDTO.setAdminFlg("1");
				}else{
					loginDTO.setAdminFlg("0");
				}

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}
}