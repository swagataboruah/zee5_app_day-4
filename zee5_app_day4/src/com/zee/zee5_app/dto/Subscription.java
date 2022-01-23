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

public class Subscription {
	
	public Subscription(String SubType, int DateofSub, String SubStatus, String SubPackCountry, String SubPayMode, String AutoRenew, int ExpiryDate)
			throws InvalidIdLengthException, InvalidNameException {
		super();
		this.SubType = SubType;
		this.DateofSub = DateofSub;
		this.AutoRenew = AutoRenew;
		this.SubId = SubId;
		this.SubPackCountry = SubPackCountry;
		this.SubPayMode = SubPayMode;
		this.ExpiryDate = ExpiryDate;
		
	}
	
	

	private String SubType;
	private int DateofSub;
	private String SubStatus;
	private String SubPackCountry;
	private String SubPayMode;
	private String AutoRenew;
	private int ExpiryDate;	
	@Setter(value = AccessLevel.NONE)
	private String SubId;
	
	
	public void Subscription() {
		System.out.println("This is EDC for subscription");
	}

	
	
	// EXCEPTION FOR SUBSCRIPTION - SUB ID 
	public void setId(String id) throws InvalidIdLengthException {
		if(id.length()<6) {
				
				throw new InvalidIdLengthException
				("id length is lessthan or eq to 6"); 
	 
			}
			this.SubId = id;
		}

	// ADD OTHER POSSIBLE EXCEPTIONS


	
	
		
	
	
	}

