/* */
package Amazon_problems;
import java.util.*;
public class Linked_list_vowels_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        Node Head1 = null;
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data=='a'||temp.next.data=='A'||temp.next.data=='e'||temp.next.data=='E'||temp.next.data=='i' ||temp.next.data=='I' ||temp.next.data=='o' ||temp.next.data=='O' ||temp.next.data=='u' ||temp.next.data=='U'){
            Head1.next=temp.next;
            Head1=Head1.next;
            temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        temp.next = Head1;
        return head;
    }	
}
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}