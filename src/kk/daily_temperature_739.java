package kk;
import java.util.*;

public class daily_temperature_739 {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> t=new LinkedList<>();
		
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("enter the number of elements in the list");
		int n=in.nextInt();
		
		
		System.out.println("enter the temperatures in the list");
		
		for (int i=0;i<n;i++)
		{									
			int n1=in.nextInt();
			
			{
				t.add(n1);
				System.out.println("the number is added");
		}
		}
			int indi=0;
			
		for (int k=0;k<t.size()-1;k++)
		{
			
			if (t.get(k)<t.get(k+1))
				{
					indi=1;
					System.out.println(indi);
				}
				else
				{
					for (int j=k+2;j<t.size();j++)
					{
						if (t.get(k)<t.get(j))
						{
							indi=j-k;
							System.out.println(indi);
							k++;
						}
					}
				}
			//System.out.println(indi);
			
			
		
		}
	}
}
		
		
		
		
		
		
		
		

	


