package com.Tatsam.SpringRest.Priority.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Tatsam.SpringRest.Priority.entities.MyEntity;
import com.Tatsam.SpringRest.Priority.services.MyServices;

@RestController
public class MyRequestController {
	
	//controller class accept and respond to server request
	
	@Autowired
	private MyServices myServiceobj;

	
	//for getting data from database 
	@GetMapping("/data")
	public List<MyEntity> getAllData(){
		
		return this.myServiceobj.getAllData();
		
	}
	
	
	//return singal data for some specific id
	@GetMapping("/data/{id}")
	public MyEntity getSingleData(@PathVariable String id) {
		
		
		return this.myServiceobj.getSingalData(Long.parseLong(id));
		
	}
	
	//for addind new data 
	@PostMapping(path="/data",consumes="application/json")
	public MyEntity addData(@RequestBody MyEntity mydata) {
		return this.myServiceobj.addData(mydata);
	}
	

}
