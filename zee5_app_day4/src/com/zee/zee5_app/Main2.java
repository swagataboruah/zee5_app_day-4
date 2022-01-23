package com.zee.zee5_app;
// TO SEE WHAT HAPPENS WHEN WE DONT OVERIDE EQUALS AND HADCODE .... AND WHAT HAPPENS IF WE DO OVERRIDE

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.Exception.InvalidIdLengthException;
import com.zee.zee5_app.Exception.InvalidNameException;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			// this is object 1 
			Register register = new Register("ab00001", "abhinandan", "chivate", "abhi@gmail.com", "123456");
			
			System.out.println(register);
			System.out.println(register.toString());
			System.out.println("hash code "+register.hashCode());
			
			// this is object 2
			Register register2 = new Register("ab00001", "abhinandan", "chivate", "abhi@gmail.com", "123456");
			System.out.println(register2);
			System.out.println(register2.toString());
			System.out.println(register2.hashCode());
			System.out.println(register);
			System.out.println(register.toString());
			System.out.println("hash code "+register2.hashCode());
			System.out.println("equals method call"+register.equals(register2));
			
		} catch (InvalidIdLengthException | InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

// IF WE DONT OVERIDE --> go to register and comment the overridden equals and hashcode --> also comment the lombok methods EqualsAndHashcode
// here object 1 and 2 have same contents but we will still get different hashcode values for both 
// and equals method will come as false
// now since its commented --> it referes to the equals method from object class
// here only references are checked ir checking if both register 1 and 2 are referring to same object or not

// IF WE OVERRIDE --> ie. remove the comments 
// then hashcode will come as same and quals will output true
// this is because we overidden the equals and hashcode
// here each field of obj 1 is checked with each field of obj 2 and thats y it comes a true for equals and hash

// If we just comment hashcode and leave the overriden equals then also hascode will come as different 
// but we know that if two objects are equal by equals method then hashcode should be same

// THEREFORE, it is proved that equals and hashcode both should be overriden

