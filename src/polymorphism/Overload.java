package polymorphism;

import java.util.Scanner;

public class Overload {
	 static int balance=1000;
	public void transaction(int m)
	{
		
		balance=balance+m;
		System.out.println("Your current balance:"+balance);
	}
	public void transaction(int j,int accno)
	{
		if(balance>=j)
		{
			balance=balance-j;
			System.out.println("Your current balance:"+balance);
		}
			
			
		else 
			System.out.println("U don't have enough money");
	}
	public static void main(String[] args) {
		int a;
		// TODO Auto-generated method stub
		do
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Debit or Credit: press 0 to debit and 1 to credit");
			int n=s.nextInt();
			Overload o=new Overload();
			switch(n)
			{
			case 0:System.out.println("Enter the amount of money u want withdraw");
				 int n1=s.nextInt();
				 System.out.println("Enter the account no to which u want to debit the amount");
				 int n2=s.nextInt();
				 o.transaction(n1,n2);
				 break;
			case 1: System.out.println("Enter the amount of money u want credit");
			 int n3=s.nextInt();
				o.transaction(n3);
				break;
			default: System.out.println("Enter the correct choice");
				
			}
			System.out.println("Do u want to continue? press 1 to continue else press 0");
			a=s.nextInt();
		}while(a==1);
	}

}
