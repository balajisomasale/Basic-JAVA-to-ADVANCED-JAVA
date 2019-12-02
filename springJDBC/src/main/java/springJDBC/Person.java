package springJDBC;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.RowId;

@Entity
public class Person 
{
     
     
     @Id
     private int id;
    private student stu;
   
    
    
    
	private int salary;
     public int getId() {
           return id;
     }
     public void setId(int id) {
           this.id = id;
     }
     public student getStu() {
 		return stu;
 	}
 	public void setStu(student stu) {
 		this.stu = stu;
 	}
     public int getSalary() {
           return salary;
     }
     public void setSalary(int salary) {
           this.salary = salary;
     }
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param salary
	 */
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
     
     
}