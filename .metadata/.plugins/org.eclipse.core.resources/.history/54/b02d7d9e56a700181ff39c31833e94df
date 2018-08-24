package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite3.util.DBConnector;
import com.internousdev.ecsite3.util.DateUtil;


public class ItemCreateCompleteDAO {

	private DBConnector dbConnector= new DBConnector();

	private Connection connection =dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO item_info_transaction(item_id, item_name, item_price, item_stock, insert_date, update_date)VALUES(?,?,?,?,?,?)";

	public void createItem(String itemId, String itemName, String itemPrice, String itemStock)throws SQLException{


		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,itemId);
			preparedStatement.setString(2,itemName);
			preparedStatement.setString(3,itemPrice);
			preparedStatement.setString(4,itemStock);
			preparedStatement.setString(5,dateUtil.getDate());
			preparedStatement.setString(6,dateUtil.getDate());

			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
