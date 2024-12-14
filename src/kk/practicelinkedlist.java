package kk;

import java.util.Collections;
import java.util.LinkedList;

class Nodes{
	int data;
	Nodes next;
	
	Nodes(int data){
		this.data=data;
		this.next=null;
	}
}

class Linkeds{
	Nodes head;
	
	public void addfirst(int data) {
		Nodes n=new Nodes(data);
		n.next=head;
		head=n;
	}
	
	
	
	public void addlast(int data) {
		Nodes n=new Nodes(data);
		
		if (head==null) {
			head=n;
			return;
		}
		Nodes temp=head;
		while(temp.next !=null) {
			temp=temp.next;
			
		}
		temp.next=n;
	}
	
	public void addinposition(int data,int pos) {
		if (pos==0) {
			addfirst(data);
			return;
		}
		Nodes n=new Nodes(data);
		Nodes temps=head;
		
		for (int i=0;i<pos-1;i++)
		{
			if (temps==null) {
				addlast(data);
				return;
			}
		}temps=temps.next;
		
	    n.next = temps.next;
	    temps.next = n;
		
		
	}
	
	
	public void deletefirst() {
		if (head==null) {
			System.out.print("empty");
			return;
		}
		
		head=head.next;
	//	System.out.print(head);
		
	}
	
	public void deletelast() {
		if (head==null) {
			System.out.print("Null");
			return;
		}
		
		Nodes m=head;
		Nodes n=head.next;
		
		while(n.next !=null) {
			n=n.next;
			m=m.next;
		}
		m.next=null;
	}
	
	public void disp() {
		Nodes temps=head;
		while(temps !=null) {
			System.out.print(temps.data+" ");
			temps=temps.next;
		}
		
	}
}



public class practicelinkedlist {

	public static void main(String[] args) {
		
		Linkeds l=new Linkeds();
		l.addlast(10);
		l.addlast(20);
		l.addlast(30);
		l.addlast(40);
		l.addlast(50);
		
		l.disp();
		l.addinposition(70,3);
		l.disp();
		
		
		//   Simplifying the linked list into collections which would reduce the the above methods 
		//   all the class and the properties can be eliminated and we can directly start from the public void main
		//   we can simply call the linked list by:
		//   LinkedList<String> l=new LinkedList<>();
		//   there are in built functions like add,insert,delete ,size and etc
		//   example:  l.addFirst()
		
		
		
		//   to display the list:
		//		for (int i=0;i<l.size();i++)
		//		{
		//			System.out.println(l.get(i));
		//		}
		//		System.out.println("Null");
		
		
		
		//  to reverse the list we do:
		
		//	Collections.reverse(l);
		//	for (int i=0;i<l.size();i++)
		//	{
		//	System.out.println(l.get(i));
		//	}
		
		
		
		
		
		
		
		
		

	}

}