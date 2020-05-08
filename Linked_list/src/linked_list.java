import java.util.*;
public class linked_list {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list list = new linked_list();
		Scanner in = new Scanner(System.in);
		while (true){
			System.out.println("Please enter the number and -1 to end  ");
			int val = in.nextInt();
			if (val == -1)
				break;
			else
				add(list,val);
			}
		  	printlist(list);
		  	delete(list,10);
		  	printlist(list);
		}
	
	Node Head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			 data = d;
			 next = null;
		}
	}
		
		public static void add (linked_list list,int d){
			Node new_node = new Node(d);
			if(list.Head == null){
				list.Head = new_node;
				}
			else{
				Node last = list.Head;
				while(last.next!=null){
					last = last.next;
				}
				last.next = new_node;
				
			}
		}
		public static void printlist(linked_list list){
			Node curr_node = list.Head;
			System.out.print("Linked list :");
			while(curr_node.next != null){
				System.out.print(curr_node.data+ " ");
				curr_node = curr_node.next;
			}
			System.out.println(curr_node.data );
			
		}
		public static void delete(linked_list list, int data){
			Node curr_node = list.Head;
			if (curr_node.data == data)
				list.Head = curr_node.next;
			else{
			while(curr_node.next != null){
				if (curr_node.next.data == data){
					curr_node.next = curr_node.next.next;
					continue;
				}
					curr_node = curr_node.next; 
			}	
			}
		}
		



}





SinglyLinkedListNode n1 = head1;
SinglyLinkedListNode n2 = head2;
SinglyLinkedListNode head ;
SinglyLinkedListNode cur= head;
while(n1.next != null || n2.next != null){
    if(n1.data >= n2.data){
        cur.next = n2;
        n2 = n2.next;
        cur = cur.next;
    }
    else{
        cur.next = n1;
        n1 = n1.next;
        cur = cur.next;
    }
}
if(n1.next == null){
    while(n2.next != null){
        cur.next = n2;
        n2 = n2.next;
        cur = cur.next;
    }
}
else if (n2.next == null){
    while(n1 != null){
        cur.next = n1;
        n1 = n1.next;
        cur = cur.next;
    }
}
else{
    return head;
}
return head;
