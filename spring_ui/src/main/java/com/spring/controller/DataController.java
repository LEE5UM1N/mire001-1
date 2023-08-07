package com.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.data.DataSet;

@Controller
@RequestMapping("/data")
public class DataController {
	
	@Autowired
	private DataSet dataSet;
	
	@RequestMapping(value="/send",method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> sendData(@RequestBody Map<String,Object> data){
		ResponseEntity<String> entity = null;
		
		int input = Integer.parseInt((String)data.get("output"));
		
		
		int temp = dataSet.getData("temp")+(int)((input-dataSet.getData("temp"))*0.1);
		dataSet.setData("temp", temp);
		
		entity=new ResponseEntity<String>(input+"",HttpStatus.OK);
		
		return entity;
	} 
	
	@RequestMapping(value="/receive",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> sendTemp(String key){
		ResponseEntity<String> entity = null;
		
		entity=new ResponseEntity<String>(dataSet.getData(key)+"",HttpStatus.OK); 
		
		return entity;
	}
}





