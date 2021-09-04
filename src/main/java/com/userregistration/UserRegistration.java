package com.userregistration;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	// Objects
	static Scanner scanner = new Scanner(System.in);

	public void userInput() {
		//variables for pattern
		String name = "[A-Z]{1}[a-z]{2,}"; // Name Condition
		String eMail = "^[a-z]+[0-9]*([.+-][a-zA-Z0-9]+){0,1}@[a-z0-9]+\\.[a-z]{2,3}(\\.[a-z]{2,3}){0,1}$"; // Email Condition
		String mobileNumber = "[+]{0,1}[9][1][ -]{0,1}[6-9][0-9]{9}"; //Mobile Number Condition
		String password = "^(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$"; // Password Condition
		
		System.out.println("\nEnter the First Name:");
		String fisrtName=scanner.nextLine();
		validate(fisrtName,name);

		System.out.println("\nEnter the Last Name:");
		String lastName=scanner.nextLine();
		validate(lastName,name);

		System.out.println("\nEnter the E-mail :");
		String mail=scanner.nextLine();
		validate(mail,eMail);
	
		System.out.println("\nEnter the Phone Number :");
		String phoneNumber=scanner.nextLine();
		validate(phoneNumber,mobileNumber);
	
		System.out.println("\nEnter the Password :");
		String pass=scanner.nextLine();
		validate(pass,password);
		
	}
	
	public void validate(String userInput, final String condition) {
		  boolean isValid = isDataValid(userInput,(String info) -> {
	                    return info.matches(condition);
	                });

	        System.out.println("the provided input is " + isValid);

	    }
	
	private boolean isDataValid(String data, Predicate<String> predicate) {
		return predicate.test(data);
	}
		
}