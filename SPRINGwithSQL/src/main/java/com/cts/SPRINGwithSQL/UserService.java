package com.cts.SPRINGwithSQL;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

	
	@Autowired
	private UserDao userdao;
	
	
	public User createUser(User user1)
	{
		
		
//User ur=new User();
		
//		ur.setUid(1);
//		ur.setUname("Balu");
//		
		
//User ur1=new User();
//		
//		ur1.setUid(2);
//		ur1.setUname("Balu");
		
		return userdao.save(user1);
	}
	 public Optional<User> getUser(int uid)
	  {
		  return userdao.findById(uid);
	  }
	
		public void deleteUser(int uid)
		{
			
			
	
			 userdao.deleteById(uid);
		}
		  public List<User> getAllUsers()
		  {
			  List<User> userList=new ArrayList<User>();
			  
			  
			   userdao.findAll().forEach(userList::add);
			   
			   return userList;
			
		  }
		  
		  public User getUserByname( String name)
		  {
			  return userdao.getUserByName(name);
		  }
		  
		  public void UpdateUser(int id,User user1)
		  {
			  if(userdao.existsById(id))
			  {
				  userdao.save(user1);
				  
				
			  }
			 // return userdao.save(user1);
			 
		  }
		  
	
}
