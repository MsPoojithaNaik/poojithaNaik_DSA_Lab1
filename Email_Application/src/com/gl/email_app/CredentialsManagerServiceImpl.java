package com.gl.email_app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CredentialsManagerServiceImpl
implements ICredentialsService{

	@Override
	public String generateEmailAddress(String firstName, String lastName, int departmentCode) {
		StringBuilder emailAddressBuilder = new StringBuilder();
		emailAddressBuilder.append(firstName.toLowerCase());
		emailAddressBuilder.append(".");
		emailAddressBuilder.append(lastName.toLowerCase());
		emailAddressBuilder.append("@");
		
		String departmentName ="";
		switch(departmentCode){
		case 1: departmentName= "technical";
			    break;
		case 2: departmentName="admin";
			    break;
		case 3:departmentName="hr";
		       break;
		case 4:departmentName="legal";  
		       break;
		default:System.out.println("Enter the valid Code");
		
		}
		emailAddressBuilder.append(departmentName);
		emailAddressBuilder.append(".");
		emailAddressBuilder.append("gl.com");
		
		return emailAddressBuilder.toString();
	}

	@Override
	public String generatePassword() {
		String capitalLeters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCaseLetters = "abcdefghijklmnopqrstuvwxyz";		
		String numbers = "0123456789";
		String specialCharacters = "~@#$%^&*()-=+<>?'][}{";
		
		
		StringBuilder passwordBuilder = new StringBuilder();
        String randomString ="";
		
		for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(smallCaseLetters.length());
	
			char randomCharValue1 = smallCaseLetters.charAt(randomValue);
			randomString += randomCharValue1;
		}		
		
				
		for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(numbers.length());

			char randomCharValue2 = numbers.charAt(randomValue);
			randomString += randomCharValue2;
		}			
		
	
		for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(specialCharacters.length());

			char randomCharValue3 = specialCharacters.charAt(randomValue);
			randomString += randomCharValue3;
		}		
		
        for (int index = 1; index <=2; index ++) {
			
			java.util.Random randomObj 
				= new java.util.Random();
			
			int randomValue = randomObj.nextInt(capitalLeters.length()); 

			char randomCharValue4 = capitalLeters.charAt(randomValue);
			randomString += randomCharValue4;
		}
      
        List<char[]> characters = Arrays.asList(randomString.toCharArray());
        Collections.shuffle(characters);
        passwordBuilder.append(characters);
		return passwordBuilder.toString();
	}
	
	@Override
	public void displayGeneratedCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstname()
		+ ", your generated credentials are as follows");

        System.out.println("Email        --->  " + employee.getEmailAddress());
        System.out.println("Password     --->  " + employee.getPassword());		
		
	}

	

}
