package com.internousdev.ecsite3.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.ItemDetailDAO;
import com.internousdev.ecsite3.dto.ItemDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailAction extends ActionSupport implements SessionAware{

	private int itemId;
	/*private List<ItemDetailDTO> itemDetailDTOList = new ArrayList<ItemDetailDTO>();*/

	private Map<String, Object> session;

	public String execute(){

		String result = ERROR;

		ItemDetailDAO itemDetailDAO = new ItemDetailDAO();
		ItemDetailDTO itemDetailDTO = new ItemDetailDTO();

		itemDetailDTO = itemDetailDAO.getItemDetail(itemId);
		System.out.println(itemId);

		session.put("id",itemDetailDTO.getId());
		session.put("item_name",itemDetailDTO.getItemName());
		session.put("item_price",itemDetailDTO.getItemPrice());
		session.put("item_stock",itemDetailDTO.getItemStock());
		session.put("insert_date",itemDetailDTO.getInsert_date());
		session.put("update_date",itemDetailDTO.getUpdate_date());


		if(!(itemDetailDTO == null)) {
			result = SUCCESS;
		}
		return result;
	}




	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/*public List<ItemDetailDTO> getItemDetailDTOList() {
		return itemDetailDTOList;
	}
	public void setItemDetailDTOList(List<ItemDetailDTO> itemDetailDTOList) {
		this.itemDetailDTOList = itemDetailDTOList;
	}*/
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}