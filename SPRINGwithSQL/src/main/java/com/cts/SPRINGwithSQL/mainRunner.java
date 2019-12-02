//package com.cts.SPRINGwithSQL;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//
//
//@Component
//public class mainRunner implements CommandLineRunner {
//
//
//	@Autowired
//	private static UserService userservice;
//	
//	@Override
//	@Transactional
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//User ur=new User();
//		
//		ur.setUid(1);
//		ur.setUname("Balu");
//		
//		
//		userservice.createUser(ur);
//		
//	}
//	
//}
