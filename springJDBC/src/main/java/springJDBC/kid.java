package springJDBC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="serv")
public class kid {

	@Id
	private int rollno;
	
	@ManyToMany
	private List<laptop> lap=new ArrayList<laptop>();
	

	public List<laptop> getLap() {
		return lap;
	}
	public void setLap(List<laptop> lap) {
		this.lap = lap;
	}
	private String name;
	private int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "kid [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
