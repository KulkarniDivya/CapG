package programs;

import java.util.Scanner;

public class Right {
	public static boolean check(int a,int b,int c)
	{
		boolean s=false;
		if(a>b&&a>c||b>c||c>b)
		{
			if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)
				s=true;
		}
		
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(check(a,b,c))
			System.out.println("Given sides form a Right Angled Triangle");
		else
			System.out.println("No");
	}

}
