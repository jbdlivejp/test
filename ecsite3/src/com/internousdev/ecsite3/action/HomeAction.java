package com.internousdev.ecsite3.action;

import java.util.Map;

public class HomeAction {
	public Map<String, Object>session;

	public String execute(){
		String result= "login";
		if(session.containsKey("id")){
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			BuyItemDTO bbuyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getitemPrice());
				result=SUCCESS;
		}
		return result;

	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

	publicMap<String,Object>getSession(){
		return this.session;
	}

}
