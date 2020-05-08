package com.user.route.modelmain;

import java.util.*;

//route class
public class route implements IRoute {
	
	//Displays all the Route details
	public void displayRoute(){
		//database : display all the routes from route table
		
	}
	
	//To add new route
	public void addRoute(){
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter the starting point");
		String start= new String();
		start = scn.next();
		
		System.out.println("Enter the end point");
		String end= new String();
		end = scn.next();
		
		System.out.println("Enter the stops");
		List<String> stops = new ArrayList<String>();
		
		for(int i=0;i<4;i++){
			System.out.println("If u want to exit press q or enter the stop name:");
			String stop = scn.next();
			while(stop !="q"){
				stops.add(stop);
			}
		//database : add the information to route table
		//details to be added(start,end,LinkedList stops)
		}
	}
	
	//To delete the route based on particular route ID
	public void deleteRoute(){
		displayRoute();
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Please enter the Route ID u want to Delete");
		int routeID = scn.nextInt();
		//database : delete the data from route table with particular route ID
	}
}
