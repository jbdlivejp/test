package com.internousdev.ecsite3.action;

import com.internousdev.ecsite3.dao.ItemDetailDAO;
import com.internousdev.ecsite3.dto.ItemDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailAction extends ActionSupport{

	private ItemDetailDAO itemDetailDAO = new ItemDetailDAO();
	private ItemDetailDTO itemDetailDTO = new ItemDetailDTO();

	public String execute(){

	String result = ERROR;

//	itemDetailDTO = itemDetailDAO.getItemDetailInfo();
//	session.put("loginUser", itemDetailDTO);
//
//	if(((ItemDetailDTO)session.get("loginUser")).getLoginFlg()){
//		result = SUCCESS;
//
//		session.put("login_user_id",loginDTO.getLoginId());
//		session.put("id",itemDetailDTO.getId());
//		session.put("item_name",itemDetailDTO.getItemName());
//		session.put("item_price",itemDetailDTO.getItemPrice());
//		session.put("item_stock",itemDetailDTO.getItemStock());
//		session.put("insert_date",itemDetailDTO.getInsert_date());

		return result;

	}

}
