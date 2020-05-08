import java.util.Scanner;


public class getmin {
	
	public static void push_1(String s){
		Stack s1 = new Stack();
		for(int i=0; i<s.length()-1;i++){
			s1.push(s.charAt(i));
		}
		s1.printlist();
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the set of parenthesis :");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		push_1(s);

	}

}
