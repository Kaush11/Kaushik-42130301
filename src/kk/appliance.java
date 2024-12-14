package kk;
import java.util.Scanner;

class App{
	String brand;
	String model;
	
	App(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void disp1() {
		System.out.println("Brand is :"+brand);
		System.out.println("Model is :"+model);
	}
}

class Washingmachine extends App{
	int load;
	int spinspeed;
	
	Washingmachine (String brand,String model,int load,int spinspeed){
		super (brand,model);
		this.load=load;
		this.spinspeed=spinspeed;
	}
	
	public void disp2() {
		System.out.println("Washing machine Load capacity is :"+load);
		System.out.println("Washing machine Spinspeed is :"+spinspeed);
	}
	public void energy1() {
		int ene1=load * spinspeed;
		System.out.println("Enery consumed by washing machine is :"+ene1);
		
	}
}

class Refrigerator extends App{
	
	int capacity;
	int energyrating;
	
	Refrigerator(String name,String model,int capacity,int energyrating){
		super (name,model);
		this.capacity=capacity;
		this.energyrating=energyrating;
		
	}
	public void disp3() {
		System.out.println("Refrigerator  capacity is :"+capacity);
		System.out.println("Refrigerator energy rating is :"+energyrating);
	}
	public void energy2() {
		int ene2=capacity *energyrating;
		System.out.println("Enery consumed by Refrigerator is :"+ene2);
		
	}
}

public class appliance {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	System.out.println("name is:");
	String brand=in.next();
	
	System.out.println("model is:");
	String model=in.next();
	
	System.out.println("load is:");
	int load=in.nextInt();
	
	System.out.println("spinspeed is:");
	int spinspeed=in.nextInt();
	
	System.out.println("capacity is:");
	int capacity=in.nextInt();
	
	System.out.println("energy rating is:");
	int energyrating=in.nextInt();
	
	Refrigerator r=new Refrigerator(brand,model,capacity,energyrating);
	
	r.disp3();
	r.energy2();
	
	Washingmachine w=new Washingmachine(brand,model,load,spinspeed);
	
	w.disp2();
	w.energy1();
	
	}

}
