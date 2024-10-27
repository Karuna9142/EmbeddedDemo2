package com.demo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher 
{
	@Id
  private int id;
  private String name;
  private double salary;
  
  @Embedded
  private Address add;

public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}

public Teacher(int id, String name, String address, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.add = add;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double Salary) {
	this.salary = salary;
}

public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}
  
  

  
}
