package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite3.dto.ItemListDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class ItemListDAO {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		public ArrayList<ItemListDTO>getItemInfo()throws SQLException{
			ArrayList<ItemListDTO> itemListDTO = new ArrayList<ItemListDTO>();
			String sql ="SELECT id, item_id, item_name, item_price, item_stock, insert_date, update_date FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);


			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setId(resultSet.getString("id"));
				dto.setId(resultSet.getString("item_id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				dto.setInsert_date(resultSet.getString("update_date"));
				itemListDTO.add(dto);

			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return itemListDTO;
	}

	public int itemHistoryDelete()throws SQLException{

		String sql ="DELETE FROM item_info_transaction";
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
