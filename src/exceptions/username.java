package exceptions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class username {
	
		// Java program to validate a username
		// using Regular Expression or ReGex
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Name");
	        String name = sc.next();
	        username ck = new username();
	        try {
	            ck.isValidUsername(name);
	        } catch (Exception e) {
	            System.out.println("Invalid Name " + e);
	        }
	}
		

			// Function to validate the username
		public static boolean isValidUsername(String name)throws InvalidNameExceptions{

				// Regex to check valid username.
				String regex = "^[A-Za-z]\\w{4,29}$";

				// Compile the ReGex
				Pattern p = Pattern.compile(regex);

				// If the username is empty
				// return false
				
			boolean found=false;
				Matcher m = p.matcher(name);
				{
				found=true;
				
				break;}
				}
				if(found) {
            System.out.println("Valid Name");
        } else {
            throw new InvalidNameExceptions("Not a valid name");
				
		}
		

}}
