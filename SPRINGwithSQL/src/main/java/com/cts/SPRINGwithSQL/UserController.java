package com.cts.SPRINGwithSQL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UserController {

	 @Autowired
	    private UserService userService;

	  @PostMapping
	    public User allUsers(@RequestBody User user1) {

	        return userService.createUser(user1);
	    }
	  
	  
	  @GetMapping("/{uid}")
	  public Optional<User> getUser(@PathVariable int uid)
	  {
		  return userService.getUser(uid);
	  }
	
	  
	  @DeleteMapping("/{uid}")
	  public void deleteUsers(@PathVariable int uid)
	  {
		   userService.deleteUser(uid);
	  }
	  
	  
	  @GetMapping("/all")
	  public List<User> getAllUsers()
	  {
		 return  userService.getAllUsers();
	  }
	  
	  
	  @GetMapping("/userbyname/{name}")
	  public User getUserByname(@PathVariable String name)
	  {
		  return userService.getUserByname(name);
	  }
	  
	  @PutMapping("/{id}")
	  public void UpdateUser(@PathVariable int id,@RequestBody User user1)
	  {
		 userService.UpdateUser(id,user1);
	  }
	  
	
}
