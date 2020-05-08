import java.util.*;

import linked_list.Node;

public class Stack {
	char data;
	Node Head;
	
	
	static class Node{
		char data;
		Node next;
		Node(char d){
			data = d;
			next = null;
			
		}
	}
	public void push(char d){
		Node new_node = new Node(d);
		if(Head == null){
			Head = new_node;
			}
		else{
			new_node.next = Head;
			Head = new_node;
			
		}
	}
	    public void pop(){
	    	Node curr_node = Head;
	    	Head =  curr_node.next;
	    	}
	    
	    
	    
	    
	    
		public  void printlist(){
			Node curr_node = Head;
			System.out.print("stack :");
			while(curr_node!= null){
				System.out.print(curr_node.data+ " ");
				curr_node = curr_node.next;
		}
		
			
	}
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1 = new Stack();
		Scanner in = new Scanner(System.in);
		/*while (true){
			System.out.println("Please enter the number and -1 to end  ");
			char val = in.();
			if (val == "Q")
				break;
			else
				stack1.push(val);
			}
		stack1.printlist();
		stack1.pop();
		System.out.println(" ");
		stack1.printlist();*/
		  	

	}

}
