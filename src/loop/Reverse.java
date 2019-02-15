package loop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		//System.out.println("Reverse of the given no:"+sum);
		if(sum==a)
			System.out.println("Given no "+a+" is a palindrome");
	}

}
