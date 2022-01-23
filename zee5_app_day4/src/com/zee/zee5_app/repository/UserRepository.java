package com.zee.zee5_app.repository;

import java.util.Optional;

import com.zee.zee5_app.dto.Register;

public interface UserRepository {
	
	public String addUser(Register register);
	public String updateUser(String id, Register register);
	public Optional<Register> getUserById(String id);
	public Register[] getAllUsers();
	public String deleteUserById(String id);

}

// we can't create/declare the objects
// we can declare only references
// when we will refer the objects whose class is implementing the interface 
// then that object will behave like an interface i.e. 
// we can get only access for the interface ovrriden methods.
