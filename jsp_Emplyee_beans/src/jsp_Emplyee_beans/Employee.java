package jsp_Emplyee_beans;

import java.util.Date;

public class Employee {

	
	
	
	public long Id;
	public String Name;
	public String Gender;
	public Date Date;
	public String fulltime;
	public String department;
	
	public int Salary;
	
	public long getId() {
		return Id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public void setId(long id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public String getGender() {
		return Gender;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getFulltime() {
		return fulltime;
	}
	public void setFulltime(String fulltime) {
		this.fulltime = fulltime;
	}
	
	public Employee(long id, String name, String gender, java.util.Date date, String fulltime, String department,
			 int salary) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Date = date;
		this.fulltime = fulltime;
		this.department = department;
	
		Salary = salary;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}

	
}
