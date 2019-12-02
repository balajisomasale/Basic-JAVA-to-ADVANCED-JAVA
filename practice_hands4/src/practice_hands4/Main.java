package practice_hands4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
static void anagram(String a1,String a2)
{
String at1=a1.replaceAll("\\s","");
String at2=a2.replaceAll("\\s", "");

boolean status=true;
if(at1.length()!=at2.length())
{
status = false;	

}

else {
	
	
	char[] arr=at1.toLowerCase().toCharArray();
	char[] arr1=at2.toLowerCase().toCharArray();
	Arrays.sort(arr);
	Arrays.sort(arr1);
	status=Arrays.equals(arr,arr1);
	
}

if(status)
{
System.out.println("Given Strings are anagrams");


}
else {
	
	System.out.println("Given strings are not anagrams");
	
	
}


}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a1=sc.nextLine();
String a2=sc.nextLine();
anagram(a1,a2);

}
	
	
	
	
}
