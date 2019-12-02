package com.cognizant.springlearn.bean;

import java.util.Arrays;
import java.util.Date;

public class Employee {

	public int id;
	private String name;
	private double salary;
	private boolean permanent;
	private Date dateOfBirth;
	private Department Department;
	private Skill[] Skill;
	
	
	

	public Employee(int id, String name, double salary, boolean permanent, Date dateOfBirth,
			com.cognizant.springlearn.bean.Department department, com.cognizant.springlearn.bean.Skill[] skill) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
		this.dateOfBirth = dateOfBirth;
		Department = department;
		Skill = skill;
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




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public boolean isPermanent() {
		return permanent;
	}




	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}




	public Date getDateOfBirth() {
		return dateOfBirth;
	}




	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}




	public Department getDepartment() {
		return Department;
	}




	public void setDepartment(Department department) {
		Department = department;
	}







	public Skill[] getSkill() {
		return Skill;
	}




	public void setSkill(Skill[] skill) {
		Skill = skill;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + ", Department=" + Department + ", Skill=" + Arrays.toString(Skill)
				+ "]";
	}




	public Employee() {
		
		
		
	}
	
	
	
	
	
	
	
	
}
