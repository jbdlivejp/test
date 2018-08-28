package com.internousdev.ecsite3.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.ItemListDAO;
import com.internousdev.ecsite3.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private ItemListDAO itemListDAO = new ItemListDAO();
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}

		if(deleteFlg == null){

			itemList = itemListDAO.getItemInfo();
			session.put("itemList", itemList);

			for(int i=0; i < itemList.size(); i++){
				System.out.println(session.get("itemList"));
			}

		}else if(deleteFlg.equals("1")){
			delete();
		}

		String result = SUCCESS;
		return result;
	}

	public void delete() throws SQLException{

		int res = itemListDAO.itemHistoryDelete();

		if(res > 0){
			itemList = null;
			setMessage(" 商品情報を正しく削除しました。");

		}else if(res == 0){
			setMessage("商品情報の削除に失敗しました。");
		}

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ItemListDAO getItemListDAO() {
		return itemListDAO;
	}

	public void setItemListDAO(ItemListDAO itemListDAO) {
		this.itemListDAO = itemListDAO;
	}

	public ArrayList<ItemListDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ItemListDTO> itemList) {
		this.itemList = itemList;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}