package com.Tatsam.SpringRest.Priority.services;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tatsam.SpringRest.Priority.dao.MyDaoData;
import com.Tatsam.SpringRest.Priority.entities.MyEntity;
@Service
public class MyServiceImpl implements MyServices{

	//List<MyEntity> list;
	@Autowired
	private MyDaoData myDaoObj;
	
	public MyServiceImpl() {
		
		
		
//		list=new ArrayList<>();
//		list.add(new MyEntity(10L,1,1,1,1,1,1,1,1));
//		list.add(new MyEntity(20L,1,1,1,1,1,1,1,1));
		
	}


	// return all data present in the database
	@Override
	public List<MyEntity> getAllData() {
		return myDaoObj.findAll();
	}


	// return data associated with given id
	@Override
	public MyEntity getSingalData(Long id) {
	
		return myDaoObj.getOne(id);
	}


	//add new data to databse
	@Override
	public MyEntity addData(MyEntity mydata) {
		myDaoObj.save(mydata);
		return mydata;
	}

	//delete data associated with given id
	@Override
	public void deleteData(Long id) {
		myDaoObj.delete(myDaoObj.getOne(id));
			
	}



}
