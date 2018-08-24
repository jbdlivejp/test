package com.internousdev.ecsite3.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemId;
	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

		if(!(itemId.equals(""))
			&& !(itemName.equals(""))
			&& !(itemPrice.equals(""))
			&& !(itemStock.equals(""))){
				session.put("itemId", itemId);
				session.put("itemName", itemName);
				session.put("itemPrice", itemPrice);
				session.put("itemStock", itemStock);



		}else{
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}
		return result;
	}



	public String getItemId() {
		return itemId;
	}



	public void setItemId(String itemId) {
		this.itemId = itemId;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getItemPrice() {
		return itemPrice;
	}



	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}



	public String getItemStock() {
		return itemStock;
	}



	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}



	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
}
