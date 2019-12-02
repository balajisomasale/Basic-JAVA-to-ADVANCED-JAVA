package springJDBC;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class laptop {

	
	@Id
	//@GeneratedValue
	private int lid;
	
	@Column(name="mylappyname")
	private String lname;
	
	
	@ManyToMany
	private List<kid> kid=new ArrayList<kid>();
	

	public List<kid> getKid() {
		return kid;
	}

	public void setKid(List<kid> kid) {
		this.kid = kid;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "laptop [lid=" + lid + ", lname=" + lname + ", kid=" + kid + "]";
	}


	
	
	
}
