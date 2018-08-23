package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.internousdev.ecsite3.dto.ItemDetailDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class ItemDetailDAO {

		private DBConnector dbConnector = new DBConnector();
		private Connection connection = dbConnector.getConnection();
		private ItemDetailDTO itemDetailDTO = new ItemDetailDTO();

		public List<ItemDetailDTO> getItemDetailList(){

		String sql = "SELECT id, item_name, item_price ,item_stock ,insert_date FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				itemDetailDTO.setId(resultSet.getString("id"));
				itemDetailDTO.setItemName(resultSet.getString("item_name"));
				itemDetailDTO.setItemPrice(resultSet.getString("item_price"));
				itemDetailDTO.setItemStock(resultSet.getString("item_stock"));
				itemDetailDTO.setInsert_date(resultSet.getString("insert_date"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return itemDetailDTOList;
	}
	public ItemDetailDTO getItemDetailDTO(){
		return itemDetailDTO;
	}

}
