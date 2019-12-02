package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
@CrossOrigin("http://localhost:4200")
public class CountryController 
{
	
	
	@Autowired
	private CountryService countryservice;
@GetMapping("/country")
public   Country getCountryIndia(){
//	
//	 
//	AppicationContext context =SpringApplication.run(OrmLearnApplication.class, args);
//	countryService = context.getBean(CountryService.class);
//	
//	
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	Country country = (Country) context.getBean("in", Country.class);
	
	System.out.println("Country List"+country);
	return country;
}

@GetMapping("/countries")
public  ArrayList<Country> CountrygetAllCountries(){
	
	return (ArrayList<Country>) countryservice.getAllCountries();
}

@GetMapping("/countries/{code}")
//@ResponseStatus(value=HttpStatus.CREATED,reason="HTTP Status code 200")
public Country getCountry(@PathVariable String code) throws CountryNotFoundException
{
	
	return countryservice.findCountryByCode(code);

}

@PostMapping(value="/countries")
public  Country addCountry(@RequestBody Country country) 
{
	
	return countryservice.addCountry(country);

}

@DeleteMapping(value="/countries/{code}")
public Country deleteCountry(@PathVariable String code ){
return countryservice.deleteCountry(code);

}

@PutMapping(value="/countries/{code}")
public Country updateCountry(@PathVariable String code,@RequestBody Country country)
{
	return countryservice.updateCountry(code, country);

}


@GetMapping(value="/countries/search")
public List<Country> searchCountry(@RequestParam("key") String c)
{
return (List<Country>) countryservice.searchCountry(c);
}	




public CountryController(){}


}