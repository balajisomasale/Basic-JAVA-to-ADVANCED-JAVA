package sessions;

public class User {

	public User(String name, boolean preference, String emailAddress) {
		super();
		Name = name;
		Preference = preference;
		this.emailAddress = emailAddress;
	}
	public String Name;
	public boolean Preference;
	public String emailAddress;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean isPreference() {
		return Preference;
	}
	public void setPreference(boolean preference) {
		Preference = preference;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
	
	
	
}
