package com.zee.zee5_app.repositoryImpl;

import java.util.ArrayList;
import java.util.Optional;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
	
	
	// here we are dealing with register type and we r expecting to get only homogeneous inputs like only related to register
	// this array list must hold only register type objects thats why we provide <Register>
	private ArrayList<Register> arrayList = new ArrayList<>();
	// if we want heterogeneous object types then we need to remove this <Register> part
	// here we r using DC, when u will use DC for ArrayList
	// then by default it will hold 10 elements of type Register.
	
	//private static int count=-1;
	
	
	// singleton design	
	private UserRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static UserRepository repository;
	
	public static UserRepository getInstance() {
		if(repository==null) {
			repository = new UserRepositoryImpl();
		}
		return repository;
	}

	
	
	
	@Override
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		boolean result = this.arrayList.add(register);
		
		if(result) {
			return "success";
		}
		return "fail";
	}

	@Override
	public String updateUser(String id, Register register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// here we need to traverse the array and hence we use arraylist
	public Optional<Register> getUserById(String id) {
		for (Register register : arrayList) {
			if(register.getId().equals(id)) {
				// comes to this line only when we surely have an object
				return  Optional.of(register);
			}
		}
		return Optional.empty();
		// if register2 is holding null it will act like an empty
		// if register2 is holding object it will act like of
		
	}

	@Override
	public Register[] getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

















