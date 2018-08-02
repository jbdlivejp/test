package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template2.dto.BuyItemDTO;
import com.internousdev.template2.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){

		DBConnector dbconnector = new DBConnector();
		Connection conneciton= dbConnector.getConnection();
		BuyItemDTO buyItemDTO = new BuyItemDTO();
		String sql= "SELECT id, item_name, item_priceFROMitem_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				buyItemDTO.setId(resultSet.getString("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyItemDTO;
	}

}
