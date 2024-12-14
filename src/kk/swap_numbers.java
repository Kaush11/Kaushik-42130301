package kk;
import java.util.*;

public class swap_numbers {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> l=new LinkedList<>();
		
		l.addLast(7);
		l.addLast(8);
		l.addLast(2);
		l.addLast(4);
		l.addLast(1);
		//l.addLast(8);
		
		int temp=0;
		
		for (int i=0;i<l.size()-1;i+=2)
		{
				 temp=l.get(i+1);
				l.set(i+1,l.get(i));
				l.set(i,temp);
				
			
		}
		System.out.println(l);
		
		

	}

}
