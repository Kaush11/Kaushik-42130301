package kk;
import java.util.Scanner;

class Player{
	String name;
	String team;
	int age;
	
	 Player(String name,String team,int age) {
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
class Bowler extends Player{
	int wickets;
	double average;
	
	Bowler(String name,String team,int age,int wickets,double average) {
		super(name,team,age);
		this.wickets=wickets;
		this.average=average;
	}
	
	void display2() {
		System.out.println("wickets : "+wickets);
		System.out.println( "average: "+average);		
	}
	
}


public class Cric {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//Player m=new Player();
		
		String name=in.next();
		String team=in.next();
		int age=in.nextInt();
		int wickets=in.nextInt();
		double average=in.nextDouble();
		
		
		Bowler m=new Bowler(name,team,age,wickets,average);
		
		
		m.display1();
	m.display2();
		
		
			

	}

}
