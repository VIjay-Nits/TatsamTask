package com.Tatsam.SpringRest.Priority.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Tatsam.SpringRest.Priority.entities.MyEntity;
@Service
public class MyServiceImpl implements MyServices{

	List<MyEntity> list;
	
	
	
	public MyServiceImpl() {
		list=new ArrayList<>();
		list.add(new MyEntity(10L,1,1,1,1,1,1,1,1));
		list.add(new MyEntity(20L,1,1,1,1,1,1,1,1));
		
	}


	// return all data present in the database
	@Override
	public List<MyEntity> getAllData() {
		return list;
	}


	// return data associated with given id
	@Override
	public MyEntity getSingalData(Long id) {
	
		for(MyEntity entity: list ) 
			if(entity.getId()==id)return entity;
		return null; 
	}


	//add new data to databse
	@Override
	public MyEntity addData(MyEntity mydata) {
		list.add(mydata);
		return mydata;
	}



}
