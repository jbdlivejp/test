package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.ecsite3.util.DBConnector;

public class LoginDAO {
	private DBConnector dbConnector =newDBConnector();
	private Connection connection =dbConnector.getConnection();
	private LoginDTO loginDTO = new loginDTO();

	public LoginDTO getLofinUserInfo(String loginUserId, String loginPassword){
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

				if(1(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}catch(Exception e){
				e.printStackTrace(s);
			}
			return loginDTO;

		}

		public LoginDTO getLoginDTO(){
			return loginDTO;
		}
	}

}
