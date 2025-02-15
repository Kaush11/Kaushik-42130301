package sys;
import java.util.*;

class Admin{
	LinkedHashMap<String, Double> items = new LinkedHashMap<>();
	LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
	
	Scanner in=new Scanner (System.in);
	Admin()
	{
	
	items.put("Felix Felicies",10000.00);
	items.put("Drangon hearts ",100.00);
	items.put("Unicorn feather",50000.00);
	items.put("Poppy bottoms",2000.00);
	items.put("Fire bolt 3000",70000.00);
	items.put("Griffindor Scarf",500.00);
	items.put("Dragon egg",100000.00);
	items.put("Owl",20000.00);
	items.put("Elder wand",500000.00);
	}
	
	
	public void add() {
		System.out.println("Enter the Item you want to add from list :");
		String adding=in.nextLine();
		if (items.containsKey(adding))
		{
			System.out.println("Enter the Quantity :");
			int qua=in.nextInt();
			in.nextLine();
			cart.put(adding,qua);
			System.out.println(adding+" has BEEN added into the cart");
			
		}
		else
		{
			System.out.println(adding+" does NOT exist in the list");
		}
		
	}
	    public void remove() {
	    	
	    	System.out.println("Enter the item you want to remove from cart");
	    	String rem=in.nextLine();
	    	
	    	cart.remove(rem);
	    	System.out.println(rem+" Has been removed from the cart");
	    }
	    
	    public void sicart() {
	    	
	    	if (cart.isEmpty())
	    	{
	    		System.out.println("Your cart is empty");
	    	}
	    	else {
	    	      double total = 0;
	        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
	            String item = entry.getKey();
	            int quantity = entry.getValue();

	           
	            if (items.containsKey(item)) {
	                double price = items.get(item) * quantity;
	                total += price;
	                System.out.println(item+" - "+ quantity+" - "+ price);
	            } else {
	                System.out.println(" Error: " + item + " is not available in the store.");
	            }
	        }
	        System.out.printf("Total Bill: %.2f%n", total);
	    }
	    	
		
}
	    
	    public void disp() {
			System.out.println("\nAvailable Books:");
		    System.out.println("----------------------------");
		    
		    for (Map.Entry<String, Double> entry : items.entrySet()) {
		        String ite = entry.getKey();
		        double price = entry.getValue();
		        System.out.println(ite +" - "+ price);
		}
		    
	}
}
public class bill {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Hogwarts Billing simulator");
		Admin a=new Admin();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String cust=in.nextLine();
		
		System.out.println("Enter your phone number: ");
		long number=in.nextLong();
		
		boolean ch=true;
		while (ch) {
		
		System.out.println("1.ADD ITEMS TO CART ");
		System.out.println("2.REMOVE ITEMS FROM CART");
		System.out.println("3.SHOW ITEMS IN THE CART ");
		System.out.println("4.SHOW ALL ITEMS");
		System.out.println("5.EXIT ");
		
		System.out.println("Enter your choice :");
		int choice =in.nextInt();
		
		switch(choice) 
		{
		case 1:
			a.add();
			break;
		case 2:
			a.remove();
			break;
		case 3:
			a.sicart();
			break;
		case 4:
			a.disp();
			break;
		case 5:
			ch=false;
			System.out.println("Thnak you for shopping with us");
			return;
			
			
		default:
				System.out.println("Invalid chhoice ,Plese read the menu");
		}
		in.nextLine();
		System.out.println("Do you wish to contine - yes or no");
		String opt=in.nextLine();
		if (opt.equals("yes"))
		{
			ch=true;
		}
		else
		{
			ch=false;
		}
			

	}
		System.out.println("Thnak you for shopping with us");
		
		
	}		
	}



