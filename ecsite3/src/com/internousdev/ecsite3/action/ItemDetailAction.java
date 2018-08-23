package com.internousdev.ecsite3.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.ItemDetailDAO;
import com.internousdev.ecsite3.dto.ItemDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailAction extends ActionSupport implements SessionAware{

	private int itemId;
	private List<ItemDetailDTO> itemDetailDTOList = new ArrayList<ItemDetailDTO>();

	private Map<String, Object> session;

	public String execute(){

		String result = ERROR;

		ItemDetailDAO itemDetailDAO = new ItemDetailDAO();
		ItemDetailDTO itemDetailDTO = new ItemDetailDTO();

		itemDetailDTO = itemDetailDAO.getItemDetail(itemId);

		session.put("id",itemDetailDTO.getId());
		session.put("item_name",itemDetailDTO.getItemName());
		session.put("item_price",itemDetailDTO.getItemPrice());
		session.put("item_stock",itemDetailDTO.getItemStock());
		session.put("insert_date",itemDetailDTO.getInsert_date());

		List<Integer> itemCountList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		session.put("itemCountList", itemCountList);

		Iterator<ItemDetailDTO> iterator = itemDetailDTOList.iterator();
		if(!(iterator.hasNext())) {
			itemCountList = null;
		}
		if(!itemDetailDTOList.isEmpty() || itemCountList==null) {
			session.put("itemInfoDtoList", itemDetailDTOList);
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
	public List<ItemDetailDTO> getItemDetailDTOList() {
		return itemDetailDTOList;
	}
	public void setItemDetailDTOList(List<ItemDetailDTO> itemDetailDTOList) {
		this.itemDetailDTOList = itemDetailDTOList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
