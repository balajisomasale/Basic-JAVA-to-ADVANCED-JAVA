import java.util.Scanner;

class InvalidAgeRangeException extends Exception 
{
	
	InvalidAgeRangeException()
	{
		super();
		
	}

}


public class Main {

	public static void main(String[] args)
	{
		
		  int age;
	      String name;
	  	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the player name"); 
		
		name=sc.nextLine();
	  	System.out.println("Enter the player age"); 
		
		age=sc.nextInt();

		
		   
		   try{  
	      
			   
			   
			if(age<18)
			{
				
				throw new InvalidAgeRangeException();
				
			}
			System.out.println("Player name : "+name); 
			
			
		  	System.out.println("Player age : "+age); 
	      }
		 catch(InvalidAgeRangeException m){
			 
			 
			 System.out.println("CustomException: "+m);}  
	  
	   } 
	
		
	}
	
	

