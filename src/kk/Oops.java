package kk;
class Pen{

String name;
String type;

public void display() {
	System.out.println(this.name);
	System.out.println(this.type);
	
}
Pen(String a,String b){
	this.name=a;
	this.type=b;
	
}
Pen(){
	
}
}


public class Oops{
	public static void main(String [] args ) {
		
		Pen p1=new Pen("trimax","gel");
	//	p1.name="trimax";
	//	p1.type="gel";
		
	//	Pen p2=new Pen();
	//	p1.name="natraj";
	//	p2.type="ball";
		
		p1.display();
	//	p2.display();
		
	}
}

