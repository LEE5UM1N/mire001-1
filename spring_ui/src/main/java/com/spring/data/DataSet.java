package com.spring.data;

import java.util.HashMap;
import java.util.Map;

public class DataSet {
	
	private Map<String,Integer> data = new HashMap<String,Integer>();
	
	{
		data.put("temp", 40);
	}
	
	public int getData(String key) {
		return data.get(key);
	}
	
	public void setData(String key, int value) {
		data.put(key, value);
	}
}
