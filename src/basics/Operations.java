package basics;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		double n1=sc.nextDouble();
		System.out.println("Enter the 2nd number");
		double n2=sc.nextDouble();
		System.out.println("Enter the operation you want to perform(+,-,*,/)");
		String s=sc.next();
		switch(s)
		{
		case "+": System.out.println("Result is:"+(n1+n2));
		         break;
		case "-": System.out.println("Result is:"+(n1-n2));
				 break;
		case "*": System.out.println("Result is:"+(n1*n2));
         		 break;
		case "/": System.out.println("Result is:"+(n1/n2));
        		 break;
        default: System.out.println("Select the correct operation");
		}
	}

}
