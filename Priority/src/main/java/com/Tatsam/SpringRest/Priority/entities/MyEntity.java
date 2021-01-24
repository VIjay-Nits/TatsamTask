package com.Tatsam.SpringRest.Priority.entities;

public class MyEntity {

	private long id;
	private int priorityConnection;
	private int priorityRelationships;
	private int priorityCareer;
	private int priorityWealth;
	private int scaleyConnection;
	private int scaleRelationships;
	private int scaleCareer;
	private int scaleWealth;
	
	
	
	
	public MyEntity() {
		super();
		
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public int getPriorityConnection() {
		return priorityConnection;
	}




	public void setPriorityConnection(int priorityConnection) {
		this.priorityConnection = priorityConnection;
	}




	public int getPriorityRelationships() {
		return priorityRelationships;
	}




	public void setPriorityRelationships(int priorityRelationships) {
		this.priorityRelationships = priorityRelationships;
	}




	public int getPriorityCareer() {
		return priorityCareer;
	}




	public void setPriorityCareer(int priorityCareer) {
		this.priorityCareer = priorityCareer;
	}




	public int getPriorityWealth() {
		return priorityWealth;
	}




	public void setPriorityWealth(int priorityWealth) {
		this.priorityWealth = priorityWealth;
	}
	




	public int getScaleyConnection() {
		return scaleyConnection;
	}




	public void setScaleyConnection(int scaleyConnection) {
		this.scaleyConnection = scaleyConnection;
	}




	public int getScaleRelationships() {
		return scaleRelationships;
	}




	public void setScaleRelationships(int scaleRelationships) {
		this.scaleRelationships = scaleRelationships;
	}




	public int getScaleCareer() {
		return scaleCareer;
	}




	public void setScaleCareer(int scaleCareer) {
		this.scaleCareer = scaleCareer;
	}




	public int getScaleWealth() {
		return scaleWealth;
	}




	public void setScaleWealth(int scaleWealth) {
		this.scaleWealth = scaleWealth;
	}




	@Override
	public String toString() {
		return "MyEntity [id=" + id + ", priorityConnection=" + priorityConnection + ", priorityRelationships="
				+ priorityRelationships + ", priorityCareer=" + priorityCareer + ", priorityWealth=" + priorityWealth
				+ ", scaleyConnection=" + scaleyConnection + ", scaleRelationships=" + scaleRelationships
				+ ", scaleCareer=" + scaleCareer + ", scaleWealth=" + scaleWealth + "]";
	}




	public MyEntity(long id, int priorityConnection, int priorityRelationships, int priorityCareer, int priorityWealth,
			int scaleyConnection, int scaleRelationships, int scaleCareer, int scaleWealth) {
		super();
		this.id = id;//primary key here
		this.priorityConnection = priorityConnection;
		this.priorityRelationships = priorityRelationships;
		this.priorityCareer = priorityCareer;
		this.priorityWealth = priorityWealth;
		this.scaleyConnection = scaleyConnection;
		this.scaleRelationships = scaleRelationships;
		this.scaleCareer = scaleCareer;
		this.scaleWealth = scaleWealth;
	}




	





		
	
	
}
