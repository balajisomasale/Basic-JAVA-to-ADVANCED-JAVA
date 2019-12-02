package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args)
	{
		
		
		
		ApplicationContext cont =new AnnotationConfigApplicationContext(AppConfig.class);
		
//		student st=(student)cont.getBean("object");
//		
//		
//		st.display();
//		
		
		
		
		  Employee s=(Employee)cont.getBean("employee");  
	        s.show();  
	}
	
	
}
