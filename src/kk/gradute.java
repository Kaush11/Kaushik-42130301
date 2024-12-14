package kk;
import java.util.Scanner;
class Student{
	String name;
	int id;
	String dep;
	String thes;
	
	public void val(String name,int id,String dep,String thes) {
		this.name=name;
		this.id=id;
		this.dep=dep;
		this.thes=thes;
	}
	public void disp() {
		System.out.println("name : "+name);
		System.out.println( "id: "+id);
		System.out.println("department : "+dep);
		System.out.println("thesis : "+thes);
	
	}
}

public class gradute {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		Student m=new Student();
		m.name=in.next();
		m.id=in.nextInt();
		m.dep=in.next();
		m.thes=in.next();
		
		
		
		m.disp();
	//	m2.disp();
		
		
		
		

	}

}
