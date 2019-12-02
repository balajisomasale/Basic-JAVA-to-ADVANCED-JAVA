	package com.cognizant.springlearn;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
	
	SpringApplication.run(SpringLearnApplication.class, args);
	

	
	System.out.println("Main Class");
	//displayCountry();
	//displayCountries();
		
//		displayDate();

		


}
	
	
//	
//
//public static void displayCountry()
//{
//	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//	Country country = (Country) context.getBean("country", Country.class);
//	Country anotherCountry = context.getBean("country", Country.class);
//	
//	
//	LOGGER.debug("Country : {}", country.toString());
//	
//	
//
//}


public static void displayCountries()
{

	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	ArrayList<Country> al= new ArrayList<Country>();
	
	al =  (ArrayList<Country>) context.getBean("countryList");
	for(Country i:al)
	{
		
		LOGGER.debug("Countries List : {}", i.toString());
		
	}

}
//	 public  static void  displayDate()
//		{
//		  LOGGER.info("START");
//			ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
//		
//	
//	
//			
//			 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
//			 
//			 try {
//				Date date1=format.parse("31/12/2018");
//			    LOGGER.debug(date1.toString());
//				System.out.println(date1);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			    LOGGER.info("END");
//	
//		}
//		
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	}
