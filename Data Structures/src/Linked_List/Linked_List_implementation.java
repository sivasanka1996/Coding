package Linked_List;

public class Linked_List_implementation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Node Head;
	static class Node{
		int data;
		Node Next;
		Node(int i){
			data = i;
			Next = null;
		}
	}
	
	public void add_at_first(Linked_List_implementation List,int d){
		Node new_node = new Node(d);
		new_node.Next = List.Head;
		List.Head = new_node;
	}
	public void add(Linked_List_implementation List,int d){
		Node new_node = new Node(d);
		if(List.Head == null){
			List.Head = new_node;	
		}
		else{
			Node temp=List.Head;
			while(temp.Next!=null){
				temp = temp.Next;	
			}
			temp.Next=new_node;
		}
	}
	
	public void add_at_k_position(Linked_List_implementation List,int d,int k){
		Node new_node = new Node(d);
		if(List.Head == null){
			List.Head = new_node;	
		}
		else{
			Node temp=List.Head;
			for(int i=1;i<k;i++){
				temp = temp.Next;	
			}
			new_node.Next=temp.Next;
			temp.Next=new_node;
		}
		
	}
	


}







