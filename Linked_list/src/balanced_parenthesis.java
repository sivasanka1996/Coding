import java.util.*;
public class balanced_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the set of parenthesis :");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		check(s);
		

	}
	
	public static void check(String s){
		Stack s1 = new Stack();
		for(int i =0; i <s.length();i++){
			if(s1.Head.data=="{" || s1.Head.data =="[" || s1.Head.data =="("){
				if(s.charAt(i)== "}" || s.charAt(i) == "]" || s.charAt(i)==")"){
					if(s1.Head.data== "{" && s.charAt(i)=="}"){
						s1.pop() ;
					}
					else if(s1.Head.data=="[" && s.charAt(i)=="]"){
						s1.pop() ;
					}
					else if(s1.Head.data=="(") && s.charAt(i)==")"){
						s1.pop() ;
					}
					else{
						System.out.println("the given parenthesis is not balanced ");
						break;
						
					}
				}
				else{
					s1.push(s.charAt(i));
				}
				s1.printlist();
				
			}
			
		}
		if(s1.Head == null){
			System.out.println("Balanced String");
		}
		else{
			System.out.println("unbaslanced string");
		}
	}
}

