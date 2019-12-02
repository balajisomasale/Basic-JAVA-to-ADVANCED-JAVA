package com.cts.SPRINGwithSQL;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserDao extends CrudRepository<User,Integer>
{

	@Query("From User u where uname=?1")
	public User getUserByName(String name);

	
	
	
	
	
}
