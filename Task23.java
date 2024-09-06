package LogicBuilding;

import java.util.HashSet;
import java.util.Set;

class Node{
	int data;
	Node next;
	
	Node(int new_data)
	{
		this.data=new_data;
		this.next=null;
	}
	
}

public class Task23 {

	public static Boolean findCycle(Node head) {
		
		Set<Node> set = new HashSet<>();
		while(head!=null) {
			if(set.contains(head))
				return true;
			set.add(head);
			head=head.next;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		
		System.out.println(head.data);	//head is 10	
		
		head.next.next=head;
		
		System.out.println(head.data);	//head is 10
		
		if(findCycle(head))
			System.out.println("Loop is forming");
		else
			System.out.println("No loop found");
	}
	
	
}
