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
public  String toString()
{
	 String s1=String.format("%-15s %-15s %-15s", name, country, skill);
	 System.out.println(s1);
return s1;
}




}
class PlayerBO
{
	//ArrayList<Object>al;
	
	
	
	public PlayerBO() {
		super();
	}



	void displayAllPlayerDetails(ArrayList playerList)
	{
		playerList.toString();
	}

}
public class Main {

	public static void main(String args[]){  
		
	     
		Scanner sc=new Scanner(System.in);
		     int x;
		     String q,w,e;
		     //System.out.println("Enter size");  
		     
		   
		     
		     System.out.println("Enter the number of players");
		     x=sc.nextInt();
		     sc.nextLine();
		     ArrayList<Object> list=new ArrayList<Object>();  
		    for(int i=0;i<x;i++)
		    {
		     System.out.println("Enter the player name");
		     q=sc.nextLine();
		    
		     System.out.println("Enter the country name");
		     w=sc.nextLine();
		    
		     System.out.println("Enter the skill");
		     e=sc.nextLine();
		    
		     Player obj=new Player(q,w,e);
		     list.add(obj);
		   
		     
		     
		   
		    }
		   // System.out.println(list);
		   System.out.println("Player Details");
		   PlayerBO obj1=new PlayerBO();
		   obj1.displayAllPlayerDetails(list);
		  
	}  
}
