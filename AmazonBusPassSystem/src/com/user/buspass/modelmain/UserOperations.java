package com.user.buspass.modelmain;

import java.util.Scanner;

import com.user.route.modelmain.*;

//user operations class
public class UserOperations {
	
	//display user operations
	public void DisplayUserMenu(String username){
		int userInput=1;
		
		System.out.println("Please select one option from below");
		System.out.println("1:View routes");
		System.out.println("2:Request new route");
		System.out.println("3:Update user details");
		System.out.println("4:Bus pass request");
		System.out.println("5:Feedback");
		System.out.println("6:Exit");
		
		while(userInput!=0){
			//select any one option
			//1. case 1 : ViewRoute()
			//2. case 2 : RequestNewRoute()
			//3. case 3 : UpdateUserDetails()
			//4. case 4 : BusPassRequest()
			//5. case 5 : Feedback()
			//6. case 6 : Exit

			try{
				//take input from Admin to select the option
				System.out.print("please enter your selection:");
				Scanner s= new Scanner(System.in);
				userInput= s.nextInt();
				if (userInput<=0 || userInput>6){
					throw new Exception();
				}
			}
		
			catch(Exception a){
				System.out.println("please enter a valid input");
			}
		
			switch(userInput){
				case 1:
					ViewRoute();
					break;
				
				case 2:
					RequestNewRoute();
					break;
				
				case 3:
					UpdateUserDetails();
					break;
				
				case 4:
					BusPassRequest();
					break;
				
				case 5:
					Feedback();
					break;
				
				case 6:
					userInput=0;
					break;
			}
		}
	}
	
	//view all the routes
	public void ViewRoute(){
		IRoute r= new route();
		r.displayRoute();
	}
	
	//request for new route
	public void RequestNewRoute(){
		Scanner s= new Scanner(System.in);
		
		System.out.println("Please enter the start point:");
		String startPoint = new String();
		startPoint= s.next();
		
		System.out.println("Please enter the end point:");
		String endPoint = new String();
		endPoint= s.next();
		
		System.out.println("Your route request is received");
		//database : add data to route request table
	}
	
	//update user details
	public void UpdateUserDetails(){
		int option = 1;
		
		Scanner s= new Scanner(System.in);
		int phoneNumber ;
		String email = new String();
		String password = new String();
		//database : extract these values from user table and store in phonenumber,email,password
		
		System.out.println("Please select option to update details");
		
		System.out.println("1:password");
		System.out.println("2.Email");
		System.out.println("3.Phone number");
		
		while(option!=0){
			try{
				//take input from Admin to select the option
				System.out.print("please enter your selection:");
				option= s.nextInt();
				if (option<=0 || option>4){
					throw new Exception();
				}
			}
			catch(Exception a){
				System.out.println("please enter a valid input");
			}
			switch(option){
				case 1:
					System.out.println("Please enter the new password:");
					password= s.next();
					
					System.out.println("Password updated");
					
				case 2:
					System.out.println("Please enter the new email ID:");
					email= s.next();
					
					System.out.println("Email updated");
					
				case 3:
					System.out.println("Please enter the new phone number:");
					phoneNumber= s.nextInt();
					
					System.out.println("Phone number updated");
					
					//give options for password/phone/email/exit
					//update the data in userdetails table
			}
		}
		// database :  store phonenumber,email,password in database
	}
	
	//bus pass request
	public void BusPassRequest(){
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the start point:");
		String startPoint = new String();
		startPoint= s.next();
		
		System.out.println("Please enter the end point:");
		String endPoint = new String();
		endPoint= s.next();
		
		System.out.println("your bus pass request is received");
		//take the input from user for start and destination and send the data to bus pass request table
	}
	
	//feedback 
	public void Feedback(){
		String feedback = new String();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the feed back:");
		feedback=s.next();
		
		System.out.println("Thanks for the feedback");
		//database : take the input from user for feedback and send the data to feedback table
	}

}
