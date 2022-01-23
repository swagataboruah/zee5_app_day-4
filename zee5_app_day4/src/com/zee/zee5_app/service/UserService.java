package com.zee.zee5_app.service;

import java.util.Optional;
import com.zee.zee5_app.dto.Register;


public interface UserService {

	public String addUser(Register register);
	public String updateUser(String id, Register register);
	public Optional<Register> getUserById(String id);
	public Register[] getAllUsers();
	public String deleteUserById(String id);
}