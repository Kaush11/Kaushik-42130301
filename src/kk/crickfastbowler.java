package kk;
import java.util.Scanner;

class Players{
	String name;
	String team;
	int age;
	
	 Players(String name,String team,int age) {
		this.name=name;
		this.team=team;
		this.age=age;
	}
	void display1() {
		System.out.println("name : "+name);
		System.out.println( "age: "+age);
		System.out.println("team : "+team);
	}
	
}
class Bowlers extends Players{
	int wickets;
	double average;
	
	Bowlers(String name,String team,int age,int wickets,double average){
		super(name,team,age);
		this.wickets=wickets;
		this.average=average;
		
	}
	void display2() {
		System.out.println("wickets : "+wickets);
		System.out.println( "average : "+average);
		//System.out.println("team : "+team);
	}
		
}

class Fastbowler extends Bowlers{
	int speed;
	
	
	Fastbowler(String name,String team,int age,int wickets,double average,int speed){
		
		super(name,team,age,wickets,average);
		this.speed=speed;
		
	}
	void display3() {
		System.out.println("speed : "+speed);
		//System.out.println( "average : "+average);
		//System.out.println("team : "+team);
	}
	
}

public class crickfastbowler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       
       String name=in.next();
		String team=in.next();
		int age=in.nextInt();
		int wickets=in.nextInt();
		double average=in.nextDouble();
		int speed=in.nextInt();
		
		Fastbowler m=new Fastbowler(name,team,age,wickets,average,speed);
		
		m.display1();
		m.display2();
		m.display3();
		
		//in.close();
		
	}

}
