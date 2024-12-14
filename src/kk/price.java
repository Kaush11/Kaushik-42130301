package kk;
import java.util.Scanner;

class Expe{
	int income;
	int expected;
	
	public void vals() {
		this.income=income;
		this.expected=expected;
		
	}
	
	public void disp() {
		int rem=income - expected;
		System.out.print("the raminaing amount is :"+rem);
		
	}
}


public class price {

	public static void main(String[] args) {
		
		Scanner in=new Scanner (System.in);
		Expe m=new Expe();
		while(true)
		{
		try {
			//while True{
		
		m.income=in.nextInt();
		m.expected=in.nextInt();
		
		m.disp();
		break;
					
		}
		//while(false) {
		catch (Exception e)
		{
			System.out.print("Invalid Input");
			break;
		}
		}
	}
}