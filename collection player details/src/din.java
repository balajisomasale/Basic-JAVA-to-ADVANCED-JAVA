import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Player
{
private String name,country,skill;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getSkill() {
	return skill;
}

public void setSkill(String skill) {
	this.skill = skill;
}

public Player(String name, String country, String skill) {
	super();
	this.name = name;
	this.country = country;
	this.skill = skill;
}	
public class din {

	
	
	public static void main(String args[]){  
		
	     
		Scanner sc=new Scanner(System.in);
		     int x;
		     //System.out.println("Enter size");  
		     x=sc.nextInt();
		     
		    String q,w,e;
		   ArrayList<Integer> list=new ArrayList<Integer>();  
		   for(int i=0;i<x;i++)
		   {
			   		System.out.println("Enter player");
			   		q=sc.nextLine();
			   		System.out.println("Enter player");
			   		w=sc.nextLine();
			   		System.out.println("Enter player");
			   		e=sc.nextLine();
			   		
			   		Player obj=new Player(q,w,e);
			   		list.add()
			   		
			   		
		   }
}
}