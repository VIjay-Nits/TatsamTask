package com.Tatsam.SpringRest.Priority.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tatsam.SpringRest.Priority.entities.MyEntity;

public interface MyDaoData extends JpaRepository<MyEntity, Long> {

}
