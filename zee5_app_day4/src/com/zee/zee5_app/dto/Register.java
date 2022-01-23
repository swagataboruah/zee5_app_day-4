package com.zee.zee5_app.dto;

import java.util.Objects;

import com.zee.zee5_app.Exception.InvalidEmailException;
import com.zee.zee5_app.Exception.InvalidIdLengthException;
import com.zee.zee5_app.Exception.InvalidNameException;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//@EqualsAndHashCode
//@NoArgsConstructor
//AllArgsConstructor
public class Register {
	
	
	//Note: In "main" we should not put throws as in this situation "main" becomes the caller. If main also thwos exception then it will throw to the JVM
	// JVM then stops the execution and code doesn't run further
	// USE TRY CATCH ONLY IN MAIN
	// FROM SERVICE LAYER ONWARDS USE TRY CATCH OR THROWS 
	public Register(String id, String firstName, String lastName, String email, String password)
			throws InvalidIdLengthException, InvalidNameException, InvalidEmailException {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.email = email;
		this.password = password;
	}
	
	
	
	
	
	
	@Setter(value = AccessLevel.NONE)
	private String id;
	// it should have min length of 6.
	// we have to write a code to validate the length and 
	// then assign the value.
	@Setter(value = AccessLevel.NONE)
	private String firstName;
	@Setter(value = AccessLevel.NONE)
	private String lastName;
	@Setter(value = AccessLevel.NONE)
	private String email;
	private String password;
	
	
	
	
	
	
	public Register() {
		// EDC
		// any kind of customization during the initialization of object
		// then its better to introduce EDC or PC or both as per the need.
		
		System.out.println("hello ");
	}

	
	
	
	
	// setFristName throws exception to the one who called it ie. to the main method
	// Now if main also has throws method then it will send to JVM which will hold all other commands which is not desirable
	// Thats y we should not put throws in main 
	
	
	
	//EXCEPTION FOR FIRSTNAME
	public void setFirstName(String firstName) throws InvalidNameException {
		
		if(firstName==null || firstName=="" || firstName.length()<2) {
			throw new InvalidNameException("firstname is not valid");
		}
		this.firstName = firstName;
	}
	
	//EXCEPTION FOR LAST NAME
	public void setLastName(String lastName) throws InvalidNameException {
		if(lastName==null || lastName=="" || lastName.length()<2) {
			throw new InvalidNameException("firstname is not valid");		
		}
		this.lastName = lastName;
	}
	
	//EXCEPTION FOR ID
	public void setId(String id) throws InvalidIdLengthException {
		// throws : it will provide the list of exceptions may be raised
		// it will hold the list of checked exceptions.
		
		
		if(id.length()<6) {
			// here exception is created by JV but user defined exception object must be raised 
			// by us
			throw new InvalidIdLengthException
			("id length is lessthan or eq to 6"); 
			// throw : it will throw the exception --> 
		}
		this.id = id;
	}

	//EXCEPTION FOR EMAIL 
	public void setemail(String email) throws InvalidEmailException {
				
		if(email==null || email=="" || email.length()<2) {
			throw new InvalidEmailException 
			("The email should be entered correctly"); 
			// throw : it will throw the exception --> 
		}
		this.email = email;
	}
	
	
	// ABOUT HASHCODE AND EQUALS METHOD OF OBJECT CLASS
	// right click -> source -> generate -> hashcode & equals

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, id, lastName, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(password, other.password);
	}

	// instead of this we can also use 
	// @EqualsAndHashcode from lombok;
	// Why we prefer to use lombok library instead of this overriden methods
	// this is because if there is any change ie. addition/deletion in code then lombok wil ltake care but if we use overriden code then we need to do it manually everytime
	

	



	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	// setter : is used to set the value for a particular field.
	// getter : to get/return the value of a specific field

}
