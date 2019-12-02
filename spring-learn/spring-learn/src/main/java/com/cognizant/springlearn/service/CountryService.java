package com.cognizant.springlearn.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	
	@Autowired
	private CountryRepository countryrepository;
	
	
	
	
	@Transactional
	 public List<Country> getAllCountries()
	 {
		 List<Country> list =new ArrayList<Country>();
		 countryrepository.findAll().forEach(list::add);
		 return list;
	 }
	
	 @Transactional
	 public Country findCountryByCode(String countryCode) throws CountryNotFoundException
	 {
		 Optional<Country> result = countryrepository.findById(countryCode);
		 if (result.isPresent())
		 {
			 Country country = result.get();
			 return country;
		 }
		 else throw new CountryNotFoundException(); 
			 
		
	 }
	 
	 @Transactional
	 public Country addCountry(Country country)
	 {
		return countryrepository.save(country);
	 }
	 
	 @Transactional
	 public Country updateCountry(String code,Country country)
	 {
		 Optional<Country> result = countryrepository.findById(code);
		 if (result.isPresent())
		 {
	countryrepository.save(country);
	
		 }
		 
	 return null;
	 }
	 
	 
	 
	 @Transactional
	 public Country deleteCountry(String code)
	 {
		
		 Optional<Country> result = countryrepository.findById(code);
		 
		 if(result.isPresent())
		 {
			 Country country =result.get();
		
			countryrepository.delete(country);
			 return country;
		 }
	
		 return null;
	 }	 
	 
	 @Transactional
	 public List<Country> searchCountry(String c)
	 {
	 return (List<Country>) countryrepository.searchCountry(c);
	 }	
}
