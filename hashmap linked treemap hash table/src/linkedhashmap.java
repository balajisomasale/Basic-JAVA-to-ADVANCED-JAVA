import java.util.*; 
  
public class linkedhashmap
{ 
    public static void main(String[] args) 
    { 
  
        // Creating an empty LinkedHashMap 
        LinkedHashMap<String, Integer> lh =  
        new LinkedHashMap<String, Integer>(); 
  Scanner sc=new Scanner(System.in);
        // Mapping int values to string keys 
        lh.put(sc.next(),sc.nextInt()); 
        lh.put("4", 15); 
        lh.put("Geeks", 20); 
        lh.put("Welcomes", 25); 
        lh.put("You", 30); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + lh); 
  
        // Getting the value of "Geeks" 
        System.out.println("The Value is: " + lh.get("Geeks")); 
  
        // Getting the value of "You" 
        System.out.println("The Value is: " + lh.get("You")); 
        sc.close();
    } 
} 