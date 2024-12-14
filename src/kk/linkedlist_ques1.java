package kk;
import java.util.*;

public class linkedlist_ques1 {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> l=new LinkedList<>();
		System.out.println("enter the number of elements in the list");
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		System.out.println("the range of the number is from 1 to 50");
		System.out.println("enter the elements in the list");
		
		for (int i=0;i<n;i++)
		{
			int n1=in.nextInt();
			if (n1 >1 && n1<50)
			{
				l.add(n1);
				System.out.println("the number is added");
			}
			else
			{
				System.out.println("the number does not fall in the range");
				i--;
			}
			
		}
		
		System.out.println("the obtained list is:");
	

		int b=25;
	
	for (int i=0;i<l.size();i++)
	{
		int a = l.get(i);
		if (a>b)
		{
			//System.out.println(l.get(i));
			l.remove(i);
			i--;
			
			
		}
	}

	
	System.out.println("the ements in the list after eliminatig the elements greater than 25");
	
	for (int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i)+" ");
	}
	
	
	
	
	}

}
