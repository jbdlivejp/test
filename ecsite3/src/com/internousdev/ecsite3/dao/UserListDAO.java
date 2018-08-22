package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite3.dto.UserListDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class UserListDAO {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		public ArrayList<UserListDTO>getUserInfo()throws SQLException{
			ArrayList<UserListDTO> userListDTO = new ArrayList<UserListDTO>();
			String sql ="SELECT id, login_id, login_pass, user_name, insert_date FROM login_user_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				UserListDTO dto = new UserListDTO();
				dto.setId(resultSet.getString("id"));
				dto.setLoginUserId(resultSet.getString("login_id"));
				dto.setLoginUserPassword(resultSet.getString("login_pass"));
				dto.setUserName(resultSet.getString("user_name"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				userListDTO.add(dto);

			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return userListDTO;
	}

	public int userListHistoryDelete()throws SQLException{

		String sql ="DELETE FROM login_user_transaction";
		PreparedStatement preparedStatement;
		int result = 0;

		try{
			preparedStatement = connection.prepareStatement(sql);
			result = preparedStatement.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}

}
