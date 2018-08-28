package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite3.dto.ItemDetailDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class ItemDetailDAO {



	public ItemDetailDTO getItemDetail(int itemId) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		ItemDetailDTO itemDetailDTO = new ItemDetailDTO();

		String sql = "SELECT * FROM item_info_transaction where item_id=?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, itemId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){

				itemDetailDTO.setId(resultSet.getString("id"));
				itemDetailDTO.setItemId(resultSet.getInt("item_id"));
				itemDetailDTO.setItemName(resultSet.getString("item_name"));
				itemDetailDTO.setItemPrice(resultSet.getString("item_price"));
				itemDetailDTO.setItemStock(resultSet.getString("item_stock"));
				itemDetailDTO.setInsert_date(resultSet.getString("insert_date"));
				itemDetailDTO.setUpdate_date(resultSet.getString("update_date"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itemDetailDTO;
	}


}
