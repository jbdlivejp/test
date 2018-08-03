package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template2.util.DBConnector;
import com.internousdev.template2.util.DateUtil;

public class UserCreateCompleteDAO {
	private DateUtil dateUtil = new DateUtil();

	private String sql ="INSERT INTO login_user_transaction(login_id, login_ pass, user_name, insert_date)VALUES(?,?,?,?)";

	public void createUser(String loginUserId,String loginUerPassword,String userName)throws SQLException{
		DBConnector dbconnector = new DBConnector();
		Connection connection =dbConnector.getConnection();

		try{
			PreparedStatement preparedStatement = conneciton.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, dateUtil.getDate());

			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}

}
