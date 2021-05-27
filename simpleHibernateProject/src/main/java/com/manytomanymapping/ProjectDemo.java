package com.manytomanymapping;

import java.util.List;

import javax.persistence.ManyToMany;

public class ProjectDemo {
	
	private int id;
	private String projectName;
	
	@ManyToMany
    private List<Employee> employee;
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	

}
