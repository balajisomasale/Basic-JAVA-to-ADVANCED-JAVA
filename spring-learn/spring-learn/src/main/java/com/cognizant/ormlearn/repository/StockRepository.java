package com.cognizant.ormlearn.repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock,Integer>{
	
	
//	@Query("from Stock s where s.code='FB' and month(s.date)=9 and year(s.date)=2019")
//    public  List<Stock> findDetails();

	
List<Stock> findByCodeStartingWithAndCloseGreaterThan(String code,BigDecimal close);

List<Stock> findByCodeAndDateBetween(String code,Date date,Date date2);

List<Stock> findTop3ByOrderByVolumeDesc();

//
//@Query(value="select * from stock ORDER BY st_volume DESC LIMIT 3",nativeQuery=true)
//public List<Stock> findTop3ByCodeOrderByCloseAsc(); 


List<Stock> findTop3ByCodeOrderByCloseAsc(String code);

}
