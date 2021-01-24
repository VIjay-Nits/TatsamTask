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
		
	}



	@Override
	public List<MyEntity> getdata() {
		
		return list;
	}



}
