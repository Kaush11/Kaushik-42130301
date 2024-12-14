package kk;
import java.util.Scanner;
class Mobile{
	String owner;
	String brand;
	String color;
	int pixel;
	
	
	public void owner() {
		this.owner =owner;
	}
	public void brand() {
		this.brand =brand;
	}
	public void color() {
		this.color =color;
	}
	public void pixel() {
		this.pixel =pixel;
	}
public void  disp() {
		
		System.out.print(owner+" owns "+brand+" and color is "+color+" with "+pixel);
	}
	
}


public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Mobile m=new Mobile ();
		m.owner=in.nextLine();
		m.brand=in.nextLine();
		m.color=in.nextLine();
		m.pixel=in.nextInt();
		
		
	
		m.disp();
		

	}

}
