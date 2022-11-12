package com.setterBasedCollectionExample;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Amazon {
	
	private int aid;
	
	private int additional;
	
	private String shopName;
	
	private List<String> cloths;
	
	private Set<String> mobile;
	
	private Map<Integer, String> map;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<String> getCloths() {
		return cloths;
	}

	public void setCloths(List<String> cloths) {
		this.cloths = cloths;
	}

	public Set<String> getMobile() {
		return mobile;
	}

	public void setMobile(Set<String> mobile) {
		this.mobile = mobile;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Amazon [aid=" + aid + ", shopName=" + shopName + ", cloths=" + cloths + ", mobile=" + mobile + ", map="
				+ map + "]";
	}
	
	

}
