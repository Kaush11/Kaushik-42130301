package kk;
import java.util.Scanner;

class Emp{
	int id;
	String name;
	String pos;
	int salary;
	
	Emp(int id,String name,String pos,int salary){
		this.id=id;
		this.name=name;
		this.pos=pos;
		this.salary=salary;
		
	}
	
	public void disp() {
		System.out.println(" Employee id :"+id);
		System.out.println(" Employee name :"+name);
		System.out.println(" Employee position :"+pos);
		System.out.println(" Employee salary :"+salary);
	}
	
	public void calculate() {
		int annual=salary *12;
		System.out.println("Employee annual salary :"+annual);
	}
}

public class employee {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int id=in.nextInt();
		String name=in.next();
		String pos=in.next();
		int salary=in.nextInt();
		
		Emp e=new Emp(id,name,pos,salary);
		
		e.disp();
		e.calculate();
		
		

	}

}
