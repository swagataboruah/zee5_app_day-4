package com.zee.zee5_app;

import java.util.Iterator;

import java.util.Optional;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.dto.*;
import com.zee.zee5_app.Exception.InvalidIdLengthException;
import com.zee.zee5_app.Exception.InvalidNameException;

import com.zee.zee5_app.repository.UserRepository;
import com.zee.zee5_app.repository.SubscriptionRepository;
import com.zee.zee5_app.repository.*;


import com.zee.zee5_app.service.MovieService;
import com.zee.zee5_app.service.SeriesService;
import com.zee.zee5_app.service.SubscriptionService;
import com.zee.zee5_app.service.UserService;

import com.zee.zee5_app.serviceImpl.MovieServiceImpl;
import com.zee.zee5_app.serviceImpl.SeriesServiceImpl;
import com.zee.zee5_app.serviceImpl.SubscriptionServiceImpl;
import com.zee.zee5_app.serviceImpl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Register register = new Register();
		//Register : class name
		// register : reference which will refer your object
		// new : is used to create the object 
		// Register() : constructor ===> DC ==> IDC
		// hello 
				
		
		
		//EXCEPTION FOR REGISTER - FIRSTNAME
		try {
			register.setFirstName("abhi");
			register.setLastName("chivate");
		}		
		catch (InvalidNameException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//EXCEPTION FOR REGISTER - EMAIL		
		register.setEmail("abhi@gmail.com");
		
		//EXCEPTION FOR REGISTER - PASSWORD
		register.setPassword("abhi1234");
		
		//EXCEPTION FOR REGISTER - ID	
		try {
			register.setId("ab00001");
		} catch (InvalidIdLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(register);
		// whenever you will print the reference then it 
		// will call toString() method.
		
		System.out.println(register.toString());
	
		System.out.println(register.getEmail());
		
		// can u create the login object?
		// then can u print the login detials?
		
		
		
		
		UserService service = UserServiceImpl.getInstance();
		SubscriptionService service1 = SubscriptionServiceImpl.getInstance();
		MovieService service2 = MovieServiceImpl.getInstance();
		SeriesService service3 = SeriesServiceImpl.getInstance();
		
		
		
		
		
		for(int i=1;i<=20;i++) {
		
			Register register2 = new Register();
			try {
				register2.setId("ab0000"+i);
				register2.setFirstName("abhi"+i);
				register2.setLastName("chivate"+i);
			} 
			catch (InvalidIdLengthException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (InvalidNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			catch (Throwable e) {
				// TODO: handle exception
			}	
			
			// if here we put --> catch (object e) then throwable and it's hierarchy will lose its importance
			// Thats why java allows exception till throwable and not till object 
			
			register2.setPassword("abhi");
			String result = service.addUser(register2);
			System.out.println(result);
		}
		
	
				
		Optional<Register> optional = service.getUserById("ab00001");
		
		if(optional.isPresent()) {
			
			System.out.println("getUserById"+optional.get());
		}
		else {
			System.out.println("id not found/available");
		}
		
	
		
	}
	
	
	
	
	for(int i=1;i<=20;i++) {
		
		Subscription subscription = new Subscription();
		try {
			subscription.setId("ab0000"+i);
			
		} 
		catch (InvalidIdLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		catch (Throwable e) {
			// TODO: handle exception
		}	
		
		subscription.setSubType("annual");
		subscription.setDateofSub("1234");		
		subscription.setSubStatus("yes");
		subscription.setSubPackCountry("india");
		subscription.setSubPayMode("credit");
		subscription.setAutoRenew("yes");
		subscription.setExpiryDate("12345");
		
		String result1 = service.addSubs(subscription);
		System.out.println(result1);
	}
	
	
	Optional<Subscription> optional = service.getSubsById("ab00001");
	
	if(optional.isPresent()) {
		
		System.out.println("getSubsById"+optional.get());
	}
	else {
		System.out.println("id not found/available");
	}
	
	
    for(int i=1;i<=20;i++) {
		
		Movie movie = new Movie();
		//id and name
		try {
			movie.setId("ab0000"+i);
			
		} 
		catch (InvalidIdLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		catch (Throwable e) {
			// TODO: handle exception
		}	
		
		
		movie.setCat("comedy");
		movie.setlang("english");		
		String result2 = service.add(movie);
		System.out.println(result2);
	}
	
	

	
    for(int i=1;i<=20;i++) {
		
		Movie movie = new Series();
		//id and name
		try {
			movie.setId("ab0000"+i);
			
		} 
		catch (InvalidIdLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		catch (Throwable e) {
			// TODO: handle exception
		}	
		
		
		series.setCat("comedy");
		series.setlang("english");		
		String result3 = service.add(series);
		System.out.println(result3);
	}
	
	
	

}