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

		public ArrayList<UserListDTO>getUserInfo(String user_transaction_id, String user_master_id)throws SQLException{
			ArrayList<UserListDTO> userListDTO = new ArrayList<UserListDTO>();
			String sql ="SELECT id, login_id, login_pass, user_name, insert_date FROM login_user_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1,user_transaction_id);
			preparedStatement.setString(2,user_master_id);

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

	public int userListHistoryDelete(String user_transaction_id, String user_master_id)throws SQLException{

		String sql ="DELETE FROM login_user_transaction WHERE user_transaction_id =? AND user_master_id = ?";
		PreparedStatement preparedStatement;
		int result = 0;

		try{
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1,user_transaction_id);
			preparedStatement.setString(2,user_master_id);
			result = preparedStatement.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}

}
