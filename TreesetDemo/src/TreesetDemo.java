	
	import java.util.*;

	import java.util.Comparator;

	import java.util.TreeSet;

	class MyComparator implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			  Integer s1=(Integer)(obj1);
			    Integer s2=(Integer)(obj2);
			return s1.compareTo(s2);
		}
		
		
		
	}
	
	public class TreesetDemo {
	 public static void main(String args[]){  
	 //Creating HashSet and adding elements  
	        TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
	    Integer s1=new Integer(100);
	    Integer s2=new Integer(200);
		    
	    ts.add(s1);    
        ts.add(s2);    
        ts.add(300);   
        ts.add(23);  
        ts.add(565);  
          System.out.println(ts);  
	        
	    }  
	}  

