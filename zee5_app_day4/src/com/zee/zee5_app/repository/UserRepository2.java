package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Register;
// repo. objects are used to call only repo methods 
// can we do this using 1 object?
public class UserRepository2 {
	
	private Register[] registers = new Register[10];
	private static int count=-1;
	private UserRepository() {
		// TODO Auto-generated constructor stub
	}
	
	// to return all the user details 
	
	public Register[] getUsers() {
		return registers;
	}
	
	// delete user is an assignemnt for u
	// 20 user on 5th ind 
	// from 5th index
	public String deleteUser(String id) {
		return null;
	}
	// update user is an assignment for u.
	
	public String udateUser(String id , Register register) {
		return null;
	}
	// this method should return the User Details based on the id
	
	public Register getUserById(String id) {
		
		// do we need to traverse the array?
		
		for (Register register : registers) {
			if(register!=null && register.getId().equals(id) ) {
				return register;
			}
		}
		
		return null;
		
	}
	
	// add a new user
	public String addUser(Register register) {
		
		//registers.length ====> it will give us the availability
		
		if(count==registers.length-1) {
			// array is full or we should go for dynamically growing the 
			// size of array.
			Register temp[] = new Register[registers.length*2];
			
			// do we need to copy the contents from old to new? Yes
			
			System.arraycopy(registers, 0, temp, 0, registers.length);
			registers= temp;
			registers[++count] = register;
			
			
			return "success";
			
		}
		registers[++count] = register;
		return "success";
		// 
		
				
		
	}
	private static UserRepository userRepository;
	public static UserRepository getInstance() {
		
		if(userRepository==null)
			userRepository = new UserRepository();
		return userRepository;
		
	}

}











/* package com.zee.zee5_app.repository;
  

import com.zee.zee5_app.dto.Register; // userrepository class is consuming an array of type Register 

public class UserRepository2 {

	// Repository should consume an array of type Register of size 10
	private Register[] registers = new Register[10];
	private UserRepository() {
		
	}
	
	
	// NOW ADDING METHODS OF REGISTER to this UserRepositoryclass
	
	// To ADD NEW USER to array --> accepts arguments register of type Register
	// This method needs to consumed by the service
	
	      /*private static int count=-1;
	        public String addUser(Register register) {
		    if(count==registers.length) {
			    return "array is full";
		    }
		    registers[++count] = register;
		    return "success"; 		
	      }*
	private static int count=-1;
	public String addUser(Register register) {
		if(count==registers.length-1) {
			Register temp[] = new Register[registers.length*2];
			// cuz we need to copy contents to new 
			System.arraycopy(register, 0, temp, 0, registers.length);
			registers = temp;
			registers[++count] = register; 
			return "success";
		}
		registers[++count] = register;
		return "success";
	}
	
	
	// RETURN ALL USER DETAILS
	public Register[] getUsers() {
			return registers;
		}
	
	// RETURN USER DETAILS BASED ON ID
    public Register getUserById(String id) {
		for (Register register : registers) {
			if(register!=null && register.getId().equals(Id) ) {
				return register;
			}
		}
		return null;		
	}
    
    // DELETE USER USING ID
    public String delUser(String id, Register register1) {
    	Register temp[] = new Register[registers.length-1];
		for(Register register : egisters) {
			if(register1 != id) {
				System.arraycopy(register, 0, temp, 0, registers.length-1);
			}
		
		}
	}
    
    
    // UPDATE USER 
    public String updateUser(String id, Register register) {
		int count1 = 0;
		for(Register register : registers) {
			if(register!=null && register.getId().equals(id)) {
				registers[count1] = register;
				return("updated");
			}
		}
		count1++;
	}
	
	
	
	private static UserRepository userRepository;
	public static UserRepository getInstance() {
		if(userRepository==null)
			userRepository = new UserRepository();
		return userRepository; 
	}
} */
