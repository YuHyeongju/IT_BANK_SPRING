package com.itbank.model;

import java.sql.Date;

import org.springframework.stereotype.Service;


/* 
 		NAME   VARCHAER2(20)
 		HEIGHT NUMBER
 		BRITH  DATE
 */


public class PersonVO {
	private String name;
	private double height;
	private Date birth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
