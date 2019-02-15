package conditional;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2=sc.nextInt();
		System.out.println("Enter 3rd number");
		int n3=sc.nextInt();
		if((n1==n2)&&(n2==n3))
			System.out.println("All are equal");
		else if((n1==n2)&&(n1>n3))
			System.out.println("n1 and n2 "+n1+" are equal and greater");
		else if((n1==n3)&&(n1>n2))
			System.out.println("n1 and n3 "+n1+" are equal and greater");
		else if((n2==n3)&&(n2>n1))
			System.out.println("n2 and n3 "+n2+" are equal and greater");
		else if((n1>n2)&&(n1>n3))
			System.out.println(n1+" is greater");
		else if(n2>n3)
			System.out.println(n2+" is greater");
		else
			System.out.println(n3+" is greater");
	}

}
