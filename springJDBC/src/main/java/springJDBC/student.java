package springJDBC;

import javax.persistence.Embeddable;

@Embeddable
public class student {

	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	private String FirstName;
	private String LastName;
	/**
	 * 
	 */
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
