package com.zee.zee5_app.dto;
import lombok.Data;

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


public class Movie {
	
	public Movie(String name, int DateOfRel, String Cat, String lang, String Id)
			throws InvalidIdLengthException, InvalidNameException {
	super();
	this.Cat = Cat;
	this.DateOfRel = DateOfRel;
	this.Id = Id;
	this.Name = name;
	
	}
	
	@Setter(value = AccessLevel.NONE)
	private String Name;
	@Setter(value = AccessLevel.NONE)
	private String Id;
	private String Cat;
	private String lang;
	private int DateOfRel;

	
	public void Movie() {
		System.out.println("This is EDC for movie");
	}
	
	
	
	// EXCEPTION FOR MOVIE - ID
	public void setId(String id) throws InvalidIdLengthException {
		if(id.length()<6) {
				
				throw new InvalidIdLengthException
				("id length is lessthan or eq to 6"); 
	 
			}
			this.Id = id;
		}
	//EXCEPTION FOR NAME
		public void setName(String Name) throws InvalidNameException {
			
			if(Name==null || Name=="" || Name.length()<2) {
				throw new InvalidNameException("name is not valid");
			}
			this.Name = Name;
		}

	// ADD OTHER EXCEPTIONS
}
