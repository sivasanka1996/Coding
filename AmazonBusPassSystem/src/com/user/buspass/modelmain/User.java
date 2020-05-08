package com.user.buspass.modelmain;

import java.util.Scanner;

//user class
public class User implements IMember {
	
	//login for user
	public void login(){
		
		int input =1;
		
		while(input!=0){
			
			//1. case 1 : New 
			//2. case 2 : Existing  
			//3. case 3	: Exit
			System.out.println("Please select one option from below");
			
			System.out.println("1:New User");
			System.out.println("2:Existing User");
			System.out.println("3:User");
			
			try{
				//take input from user to select the option
				System.out.print("please enter your selection:");
				Scanner s= new Scanner(System.in);
				input= s.nextInt();
				if (input<=0 || input>3){
					throw new Exception();
				}
			}
			
			catch(Exception a){
				System.out.println("please enter a valid input");
			}
			
			
			switch(input){
			
			case 1:
				newUser();
				break;
				
			case 2:
				existingUser();
				
			case 3:
				input = 0;
				break;
			}
		}
	}
	
	//new user login
	public void newUser(){
		
		Scanner n= new Scanner(System.in);
		
		System.out.println("Please enter the username:");
		String username=n.next();
		
		for(int i=0;i<3;i++){
			if(validate(username)){
				
					System.out.println("Please enter the password:");
					String password =n.next();
					//add data to table
					break;
			}
		}
	}
	
	
	
	//exisiting user login 
	public void existingUser(){
		Scanner n= new Scanner(System.in);
		
		System.out.println("Please enter the username:");
		String username=n.next();
		
		System.out.println("Please enter the password:");
		String password=n.next();
		
		for(int i=0;i<3;i++){
			if(validate(username,password)){
				userOperations(username);
				break;
			}
		}
	}
	
	public void operation(){
		String username=new String(" ");
		
		userOperations(username);
	}
	
	public void userOperations(String username){
		UserOperations u = new UserOperations();
		u.DisplayUserMenu(username);
	}
	
	//new user validation
	public boolean validate(String username){
		//database : verify whether the username is uniqur from table and return ture or false
		return true;
	}
	
	//existing user validation
	public boolean validate(String username,String password){
		//database : verify whether the username,password are present in table and return ture or false
		return true;
	}

}



