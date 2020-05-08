import java.util.*;
public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the input:");
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		validateFirst(s);
		

	}

	
	public static void validate(){
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		matches(s);
	
	}
	public static boolean validateName(String s){
		if(s.matches("[a-z0-9_-]{3,15}")){
			return true;
			
		}
		else{
			return false;
		}
	}
	
	public static boolean validatePass(String s){
		if(s.matches(".*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*")){
			return true;
			
		}
		else{
			return false;
		}
	}
	
	public static boolean validateFirst(String s){
		if(s.matches("[A-Za-z]{3,12}")){
			System.out.println("True");
			return true;
			
		}
		else{
			System.out.println("Flase");
			return false;
		}
	}
	
	public static boolean validateLast(String s){
		if(s.matches("[A-Za-z]{3,12}")){
			System.out.println("True");
			return true;
			
		}
		else{
			System.out.println("Flase");
			return false;
		}
	}
	public static boolean validatePhone(String s){
		if(s.matches("^[789][0-9]{9}")){
			System.out.println("True");
			return true;
			
		}
		else{
			System.out.println("Flase");
			return false;
		}
	}
	
	public static boolean ValidateEmail(String s){
		if(s.matches("^[a-zA-Z0-9._]+{15}@gmail.com")){
			System.out.println("True");
			return true;
			
		}
		else{
			System.out.println("Flase");
			return false;
		}
	}
	
	
	
	
	
	
	
	//user name -   ^[a-z0-9_-]{3,15}
	/*Password-     .*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*
	  At least 8 chars
	Contains at least one digit
	Contains at least one lower alpha char and one upper alpha char
	Contains at least one char within a set of special chars (@#%$^ etc.)
	Does not contain space, tab, etc.*/
	
	
	public static void matches(String s){
		
		if(s.matches(".*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*")){
			System.out.println("True");
			
		}
		else{
			System.out.println("false");
		}
	}
}