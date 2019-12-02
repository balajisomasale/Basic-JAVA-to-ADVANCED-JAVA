import java.util.Scanner;

class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  


public class Main{
     
   public static void main(String[] args){  
      int age;
      String name;
  	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter the Player name"); 
	
	name=sc.nextLine();
  	System.out.println("Enter your age"); 
	
	age=sc.nextInt();

	
	   
	   try{  
      
		   
		   
		if(age<18)
		{
			
			throw new InvalidAgeException("sd");
			
		}
		System.out.println("Player name : "+name); 
		
		
	  	System.out.println("Player age : "+age); 
      }
	 catch(InvalidAgeException m){
		 
		 
		 System.out.println("Custom Exception occured: "+m);}  
  
   } 
}
}
