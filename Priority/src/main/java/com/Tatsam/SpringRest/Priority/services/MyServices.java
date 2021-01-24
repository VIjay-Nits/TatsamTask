package com.Tatsam.SpringRest.Priority.services;

import com.Tatsam.SpringRest.Priority.entities.MyEntity;

import java.util.List;




public interface MyServices {
	
	public List<MyEntity> getAllData();

	public MyEntity getSingalData(Long id);

	public MyEntity addData(MyEntity mydata);
	
	

}
