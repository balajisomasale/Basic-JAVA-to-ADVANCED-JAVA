
import java.util.*;  

public class Main {
	public static void main(String args[]){  
		 //Creating HashSet and adding elements  
		     
		Scanner sc=new Scanner(System.in);
		     int x;
		     //System.out.println("Enter size");  
		     x=sc.nextInt();
		     
		    
		   ArrayList<Integer> list=new ArrayList<Integer>();//Creating   
		   int sum=0;float avg,to;
		   
		   
		   for(int i=0;i<x;i++)
		   {
			   list.add(sc.nextInt());
			  
		   }
		   for(int i:list)
		   {
			 //  list.add(i);
			   sum=sum+i;
			    
			
		   }
		   System.out.println(sum);
		   to=sum;
		   avg=(to/x);
	
		   System.out.printf("%.2f",avg); 
		   
		   
		   
		  
		       //  System.out.println(sum);  
		     
	}  
		    
}
