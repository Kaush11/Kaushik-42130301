package kk;
import java.util.*;

public class skip_a_character {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s="21EFXTG34";
		String a=" ";
		
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='E' || s.charAt(i)=='F' || s.charAt(i)=='G')
			{
				continue;
			}
			a=a+s.charAt(i);
		}
		
		System.out.print(a);
	}

}
