package accountdetail;
import java.util.*;
class User{
	int tot;
	Scanner in=new Scanner(System.in);
	
	LinkedList<String> l=new LinkedList<>();
//	
	public void depositing() {
	//	
		System.out.println("Enter the Minimum Amount you want to deposit into your Account :");
		int deposit=in.nextInt();
		in.nextLine();
		l.add(deposit+" was added");
		System.out.println("do you want to Deposit Even more Amount - yes or no");
		String op=in.nextLine();
		boolean h=true;
		if (op.equals("yes"))
		{
			h=true;
			System.out.println("Enter the next amount you want to deposit");
			int nextdep=in.nextInt();
			tot=deposit+nextdep;
			l.add(nextdep+" was added");
		
			System.out.println("the amount total amount is "+tot);
		}
		else
		{
			h=false;
		}
		}

			
	
	public void removing() {
		
	
		System.out.println("Enter the Amount you want to Withdraw from you Account");
		int withd=in.nextInt();
		if (tot>=withd)
		
		{
			 tot=tot-withd;
			l.add(tot+" was withdrawed");
			System.out.println(withd+" Rupees has been sucessfully Withdrawed into your account");
		}
		else {
			System.out.println("Your total amount is "+tot);
			
			System.out.println("the "+withd+" amount is greater than the deposit amount ! \n Please deposit some amount .");
		}
		
	}
	
	public void disp() {
		System.out.println("The total amount in your account is:"+tot);
		
	}
	
	public void hist() {
		System.out.println("Transation history of your account is :");
		
		for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
	

	}
	


public class Accd {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		User u=new User();

		System.out.println("Welcome to Gringots Bank !");
		System.out.println("Enter your Account id :");
		int accid=in.nextInt();
		in.nextLine();
		
		System.out.println("Enter your Account Password :");
		String accpass=in.nextLine();
		
		System.out.println("Access Granted ! :");
		
		boolean ch=true;
		while(ch) {
		System.out.println("Menu ");
		System.out.println(". Create new Account :");
		System.out.println("1. Deposit Money:");
		System.out.println("2. Withdraw Money :");
		System.out.println("3. Check Balance");
		System.out.println("4. Show transation history");
		
		int option=in.nextInt();
		in.nextLine();
		
		
		
		switch (option) {
		case 1:
			
			u.depositing();
			break;
			
		case 2:
			u.removing();
			break;
		case 3:
			u.disp();
			break;
		case 4:
			u.hist();
			break;
		default :
			System.out.println("It is mandatory to depost a Minimum amount");
			u.depositing();
				
		}
		System.out.println("do you want to continue yes or no");
		String opt=in.nextLine();
		if(opt.equals("yes")) 
		{
			ch=true;
		}
		else
		{
			ch=false;
		}
			
		
		}

	}
	}



