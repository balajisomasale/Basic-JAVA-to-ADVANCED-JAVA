package com.cognizant.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.account;

@RestController
public class AccountController {
	@GetMapping("/accounts/{number}")
	public account getAccounts(@PathVariable String number)
	
	{
		List<account> li =new ArrayList<account>();
		account acc =new account("1243","savings",1245);
		li.add(acc);
		account acc1 =new account("5555","savings",1245);
		li.add(acc1);
		return acc1;
	}
}
