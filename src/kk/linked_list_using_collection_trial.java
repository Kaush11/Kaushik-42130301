package kk;
import java.util.*;

public class linked_list_using_collection_trial {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<>();
		
		l.addFirst("kaush");
		l.addFirst("is");
		l.addFirst("sleepy");
		
		for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
		System.out.println("Null");
		
		Collections.reverse(l);
		
		for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
	//	int indi=l.indexOf(2);
	//	System.out.println(indi);
		
		
		
		

	}

}
