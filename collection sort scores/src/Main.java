import java.util.ArrayList;
import java.util.Collections;
import java.util.*;  

public class Main {
	public static void main(String args[]){  
	
		     
		Scanner sc=new Scanner(System.in);
		     int x;
		     //System.out.println("Enter size");  
		     x=sc.nextInt();
		     
		    
		   ArrayList<Integer> list=new ArrayList<Integer>();  
		   for(int i=0;i<x;i++)
		   {
		   list.add(sc.nextInt());
		   }
		  // System.out.println(list); 
		   Collections.sort(list);
		     for(int i:list)
		     {
		    
		    	 System.out.println(i);
		    	 
		     }
		   
		   
		   // System.out.println(list);
		   
		   
		   
		  
	}  
		    
}
