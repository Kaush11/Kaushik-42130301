package utilities;
import java.util.LinkedList;
import java.util.Scanner;
class Admin {
	String adminexi; 
	String adminpassexi;
	LinkedList<String> b=new LinkedList<>();
	
	Scanner in=new Scanner (System.in);
	Admin()
	{
			
		b.add("A risk on forever");
		b.add("It ends with us");
		b.add("Harry Potter");
		b.add("5 feet apart");
		b.add("All this time");
		b.add("Murder in the Orient express");
		b.add("Death on the river Nile");
		b.add("Seven husbands of Evelyn Hugu");
	}
	public void adding() {
		
		System.out.println("Enter the Book you want to add");
		String adder=in.nextLine();
		b.add(adder);
		System.out.println(adder+" is added into the library");
					
		
	}
	public void removing() {
		System.out.println("Enter the book you want to remove:");
		String remover=in.nextLine();
	
		b.remove(remover);
		System.out.println(remover+" is removed from library");
		}
		
	
	public void availibility() {
		
		System.out.println("Enter the book you want to check for availibility");
		String ava=in.nextLine();
		if (b.contains(ava))
		{
			if (true)
			{
				System.out.println(ava+" IS available in the library");
			}
			
		}
		else
		{
			System.out.println(ava+" is NOT available in the library");
		}
				
	}
	
	public void disp() {
		for (int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i)+" ");
		}
	}
	
	

}
class User extends Admin{
	String usernameexi;
	String passwordexi;
	
	public void disp()
	{
		for (int i=0;i<b.size();i++) {
		
			System.out.println(b.get(i)+" ");
		}
		
	}
	
	
	public void availibility() {
		System.out.println("Enter the book you want to check for availibility");
		String ava=in.nextLine();
		if (b.contains(ava))
		{
			if (true)
			{
				System.out.println(ava+" IS available in the library");
			}
			
		}
		else
		{
			System.out.println(ava+" is NOT available in the library");
		}
		
	}
	
	
	
	public void issued() {
		System.out.println("Enter the book you want to borrow");
		String issue=in.nextLine();
		if (b.contains(issue))
		{
			if (true)
			{
				b.remove(issue);
				System.out.println("The book "+issue+" has been issued.");
			}
			
		}
		else
		{
			System.out.println("Please check the availibility of the book !");
		}
	
	}
	
	
	
	public void returning() {
		
		System.out.println("Welcome to the returns pannel");
		System.out.println("Please enter the book you want to return");
		String ret=in.nextLine();
		b.add(ret);
		System.out.println("Thank you ! I hope you had a amazing journey ..");
		
		
		
	}
	
}

public class Users {

	public static void main(String[] args) {
		
		Admin a=new Admin();
		User u=new User();
		System.out.println("Welcome to the Hogwarts Liberary !");
		System.out.println("Choose from the given options");
		System.out.println("1. Consumer: ");
		System.out.println("2. Admin: ");
		
		
		Scanner in=new Scanner(System.in);
		
		int option=in.nextInt();
		
		switch (option) {
		
		case 1:
			in.nextLine();
			System.out.println("Enter your registered mail or user name :");
			String usernameexi=in.nextLine();
			System.out.println("Enter your Password:");
			String passwordexi=in.nextLine();
			System.out.println(" Acesss Granted ! Welcome to the Hogwarts Liberary !");
			boolean ch=true;
			while(ch){
			
			System.out.println("Menu: ");
			System.out.println("Enter a choice: ");
			
			System.out.println("1. View all the books in the Hogwarts Library  : ");
			System.out.println("2. Check for availibility for a particular book: ");
			System.out.println("3. Issued book");
			System.out.println("4. Return of books: ");
			
			int choice1=in.nextInt();
			in.nextLine();
			switch (choice1) {
			
			case 1:
				u.disp();
				break;
				
			case 2:
				u.availibility();
				break;
				
			case 3:
				u.issued();
				break;
				
			case 4:
				u.returning();
				break;
				}
			
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
			
				break;
		
		case 2:
			
			in.nextLine();
			System.out.println("Enter your registered mail or user name :");
			
			String adminexi=in.nextLine();
			
			System.out.println("Enter your password :");
			String adminpassexi=in.nextLine();
			
			
			System.out.println("Enter your registered mail or user name :");
			
			if (adminexi.equals("Kaushik 1109"))
			{
				if (adminpassexi.equals("Hogwarts")) {
					
				System.out.println(" Acesss Granted ! Welcome to the Hogwarts Liberary !");
				
				boolean c=true;
				while(c) {
				System.out.println("Menu: ");
				System.out.println("Enter a choice: ");
				
				System.out.println("1. Add books: ");
				System.out.println("2. Remove books: ");
			//	System.out.println("3. Issued books");
				System.out.println("3. Availibility of books: ");
				
				int choice=in.nextInt();
				
				switch (choice)
				{
				case 1:
					
					a.adding();
					a.disp();
					break;
					
				case 2:
					a.removing();
					a.disp();
					break;
					
					
				case 3:
					a.availibility();
				//	a.disp();
					break;
				}
				
				System.out.println("Do you wish to contine enter - true else false");
				 c=in.nextBoolean();
//				if (opt.equals("yes"))
//				{
//					ch=true;
//				}
//				else
//				{
//					ch=false;			
				}
			}		
				break;
	}
			
		else
			{
				System.out.println(" Acesss Denied !Try again !");
				break;
				
			}
			
		
			
		default:
			System.out.println("Please enter a valid option! :");
				
		}
	

	}

}
