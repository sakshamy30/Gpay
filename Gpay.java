import java.util.*;
class Gpay
{
	String name;
	String mail1;
	String mail2;
	long no;
	String password1;
	String password2;
	int totalbalance;
	int deposit;
	int cost;
	public void wallet() 
	{
		Scanner sc = new Scanner(System.in);
		if(password1.equals(password2) && mail1.equals(mail2))
		{
			int balance = 5000;
			totalbalance = balance;
			System.out.println();
			System.out.println("Do you want to Check your Bank Balance? \nType Y or N");
			String choice1 = sc.next();
			if(choice1.equals("Y"))
			{
				System.out.println("Your Bank Balance is: "+balance+"rs");
			}
			else if(choice1.equals("N"))
			{
				System.out.println("OK. Thank You!");
			}
			else
			{
				System.out.println("Invalid Input");
			}
			System.out.println();
			System.out.println("Do you want to deposit cash? \nType Y or N");
			String choice2 = sc.next();
			if(choice2.equals("Y"))
			{
				System.out.println("How much amount do you want to deposit: ");
				deposit = sc.nextInt();
				totalbalance = balance + deposit;
				System.out.println("Your current Balance is: "+totalbalance+"rs");
			}
			else if(choice2.equals("N"))
			{
				System.out.println("OK. Thank You!");
			}
			else
			{
				System.out.println("Invalid Input");
			}
			System.out.println();
			System.out.println("Do you want to purchase something? \nType Y or N");
			String choice3 = sc.next();
			if(choice3.equals("Y"))
			{
				System.out.println("Enter the item cost:");
				cost = sc.nextInt();
				totalbalance = totalbalance - cost;
				if(totalbalance >= 500)
				{
					System.out.println();
					System.out.println("Your current Balance is: "+totalbalance+"rs");
				}
				else
				{
					System.out.println("Sorry the minimum balance should be 500rs!!!");
				}
			}
			else if(choice3.equals("N"))
			{
				System.out.println("OK Bye.");
			}
			else
			{
				System.out.println("Invalid Input");
			}
			System.out.println();
			System.out.println("Thank You For Visiting Our App \nSee You Soon :)");
		}
		else
		{
			System.out.println();
			System.out.println("******************* Sorry Incorrect Credentials :( **********************");
		}
	}
	public void login() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("LOGIN DETAILS :-");
		System.out.println();
		System.out.println("User Mail id:");
		mail2 = sc.nextLine();
		System.out.println("Password:");
		password2 = sc.nextLine();
		if(password1.equals(password2) && mail1.equals(mail2))
		{
			System.out.println("You Have Successfully Logged In.");
			System.out.println();
			System.out.println("============================ GPay =============================");
			System.out.println();
		}
	}
	public void inputDetails() 
	{
		System.out.println("================================ 1ST Time Registration ======================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		System.out.println("Customer Details");
		System.out.println();
		System.out.println("Enter the Name:");
		name = sc.nextLine();
		System.out.println("Enter the Email id:");
		mail1 = sc.nextLine();
		System.out.println("Enter the Phone number:");
		no = sc.nextLong();
		Long temp = no;
		int count = 0;
		while(temp > 0)
		{
			temp = temp/10;
			count++;
		}
		if(count == 10)
		{
			System.out.println("OTP is sent to your Phone number:");
			int r1 = rm.nextInt(10);
			System.out.print(r1);
			int r2 = rm.nextInt(10);
			System.out.print(r2);
			int r3 = rm.nextInt(10);
			System.out.print(r3);
			int r4 = rm.nextInt(10);
			System.out.println(r4);
			System.out.println("OTP Verified");
			System.out.println("Enter the Password:");
			password1 = sc.next();
			System.out.println();
			System.out.println("======================== You Have Been Successfully Registered!!! =========================");
			System.out.println();
		}
		else
		{
			System.out.println("Invalid Phone Number!!!");
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		Gpay cus1 = new Gpay();
		cus1.inputDetails();
		cus1.login();
		cus1.wallet();
	}
}

	