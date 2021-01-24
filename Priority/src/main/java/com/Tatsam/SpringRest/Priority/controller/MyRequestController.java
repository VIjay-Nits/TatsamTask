package com.Tatsam.SpringRest.Priority.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<MyEntity> getData(){
		
		return this.myServiceobj.getdata();
		
	}

}
