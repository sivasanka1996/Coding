

import java.util.Scanner;

import Stack.Node;

public class queue {
	int data;
	Node Head;
	Node Tail;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
			
		}
	}
	public void enque(int d){
		Node new_node = new Node(d);
		if(Head == null){
			Head = new_node;
			Tail = new_node;
			}
		else{
			Tail.next=new_node;
			Tail=new_node ;
		}
	}
	
	public void deque(){
		Node curr_node = Head;
		Head = curr_node.next;
	}
	
	
	public  void printlist(){
			Node curr_node = Head;
			System.out.print("stack :");
			while(curr_node != null){
				System.out.print(curr_node.data+ " ");
				curr_node = curr_node.next;
			}
			
			
		}
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue queue1 = new queue();
		Scanner in = new Scanner(System.in);
		while (true){
			System.out.println("Please enter the number and -1 to end  ");
			int val = in.nextInt();
			if (val == -1)
				break;
			else
				queue1.enque(val);
			}
		queue1.printlist();
		queue1.deque();
		queue1.printlist();
		  	

	}

}
