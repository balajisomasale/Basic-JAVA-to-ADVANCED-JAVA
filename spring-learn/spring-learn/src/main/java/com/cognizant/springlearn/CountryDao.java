package com.cognizant.springlearn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;




@Repository
public class CountryDao {

	private static List<Country> li=new ArrayList<Country>();
	
	public CountryDao()
	{
		
		li.add(new Country("IN","India"));
		li.add(new Country("US","United States"));
		li.add(new Country("JP","Japan"));
		li.add(new Country("DE","Germany"));
		
		
		
	}
	public List<Country> getItems()
	{
		return li;
	}
	
	public Country addCountry(Country country) {
		
		li.add(country);
		return country;
		}
	
	

	public Country deleteCountry(String code) {
		
		for(Country c:li)
		{
			if(c.getCode().equalsIgnoreCase(code))
			{
				li.remove(c);
				
				return c;
			
			}
			
		}
		
		return null;
	}
	
	
	public Country updateCountry(String code, Country country) {
		for(Country c:li)
		{
			if(c.getCode().equalsIgnoreCase(code))
			{
				int index=li.indexOf(c);
				Country.set(index,country);

				li.remove(c);
				li.add(country);
				

				
				return country;
			
			}
			
		}
		
		return null;
		
		
		
	}

	
}
