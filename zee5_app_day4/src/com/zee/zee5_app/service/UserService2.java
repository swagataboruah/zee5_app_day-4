package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.repository.UserRepository;
// service objects are used to just call the services inside the main method
//can we do this using 1 object?
// TO fix they provided a solution called singleton Design pattern
// one ==> to get only one object for the specific type.


public class UserService2 {

	private UserRepository repository = UserRepository.getInstance();
	// service is consuming the repository
	
	private UserService() {
		// TODO Auto-generated constructor stub
	}
	// if we want ot create that single object then we have to create it
	// inside the same class
	// and we have to share ref with others
	// to do the same we have to declare a method.
	private static UserService  service = null;
	// this would be a static 
	// only one copy.
	
	public static UserService getInstance() {
		// it  becomes object independant?
		// static will make it independant on the object for execution.
		
		// static method will access only static ref
		if(service==null)
		service = new UserService();
		return service;
		
	}
	
	public String addUser(Register register) {
		// do we need to consume the addUser method from repo.
		return this.repository.addUser(register);
	}
	
	public Register getUserById(String id) {
		return repository.getUserById(id);
	}
	public Register[] getUsers() {
		return repository.getUsers();
	}
}












/*package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.repository.UserRepository; // userservice class is consuming the userrepository class

public class UserService2 {

	// Service should consume the Repository so create a object/instance of class UserRepository as repository
	// private UserRepository repository = new UserRepository();
	
	 
	// Used to call static method using class name
	private UserRepository repository = UserRepository.getInstance();
	
	
	
	// Singlton --> this is a private constructor
	// Then what is scope of private constructor? Only accessible to class
	// So if we want to create single object then we have to create it inside the clas
	// and we have to share reference with others
	// To do the same we have to declare a method
	private UserService() {
		// TODO Auto-generated constructor stub
	}
		
	private static UserService service = null; // private used so that no one else can access this static obj
		
	public static UserService getInstance() {
			// is this object (getInstance) dependent? 
			// We can't create object of this class as we have given constructor as private
			// So next option was to create object like we did before using singleton but in that case the methods are dependent on that each object for their existence
			// So now we need to remove this problem of dependency on object by adding "static" near getInstance becoz of static it become object independent
			// Without static getInstance is object obj dependent
			// Static will make it independent on object execution
			// Static method will access only static reference
			
			// UserService service = null; --->  This referencs hold the below command
			// This is a local reference which is created during execution of getInstance, this can be destroyed later
			// new UserService(); // We created object that us independent
		
			if(service==null)
				service = new UserService();
			return service; // This gives only 1 object 
		
		}
	
	
	
	
	   // NOW CONSUMING METHODS for REGISTER from UserRepository
	   // consuming the addUser method from UserRepository so that repository and service communicates with each other
	    public String addUser(Register register) {
	    	return this.repository.addUser(register);
	    }


	    // consuming the getUserById method from UserRepo so that repository communicates with service
        public Register getUserById(String id) {
        	return this.repository.getUserById(id);
        }
        
        // consuming deleteUser from UserRepo
        public String delUser(String id, Register register1){
        	return this.repository.delUser(id, register1);
        }
        // consuming uodateUser from UserRepo
        public String updateUser(String id, Register register) {
        	return this.updateUser(id, register);
        }
        
        
         
        
        
        
        
}*/
