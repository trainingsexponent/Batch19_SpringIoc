package com.constructorBasedcollectionBased;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Shopkeeper {
	
	private int sid;
	
	private String shopName;
	
	private List<String> list;
	
	private Set<String> set;
	
    private Map<Integer, String> map;

	public Shopkeeper(int sid, String shopName, List<String> list, Set<String> set, Map<Integer, String> map) {
		super();
		this.sid = sid;
		this.shopName = shopName;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public int getSid() {
		return sid;
	}
	
	public String getShopName() {
		return shopName;
	}

	public List<String> getList() {
		return list;
	}

	public Set<String> getSet() {
		return set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	@Override
	public String toString() {
		return "Shopkeeper [sid=" + sid + ", shopName=" + shopName + ", list=" + list + ", set=" + set + ", map=" + map
				+ "]";
	}
    
    
}
