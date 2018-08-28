package com.internousdev.ecsite3.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private int itemId;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	public Map<String, Object> session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException{

		itemCreateCompleteDAO.createItem(session.get("itemId").toString(),
			session.get("itemName").toString(),
			session.get("itemStock").toString(),
			session.get("itemPrice").toString());


		String result = SUCCESS;

		return result;
	}




	public int getItemId() {
		return itemId;
	}




	public void setItemId(int itemId) {
		this.itemId = itemId;
	}




	public String getItemName() {
		return itemName;
	}




	public void setItemName(String itemName) {
		this.itemName = itemName;
	}




	public int getItemPrice() {
		return itemPrice;
	}




	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}




	public int getItemStock() {
		return itemStock;
	}




	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}




	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}