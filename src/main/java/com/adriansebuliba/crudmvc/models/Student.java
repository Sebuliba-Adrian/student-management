package com.adriansebuliba.crudmvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	
	@Id
	private Integer Id;
	private String name;
	private String department;
	private String updatedBy;
	@DateTimeFormat(pattern="yyy-MM-dd")
	private String updatedOn;
	
	
	
	public Student() {
		super();
	}

	public Student(Integer id, String name, String department, String updatedBy, String updatedOn) {
		super();
		this.Id = id;
		this.name = name;
		this.department = department;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}	
}
