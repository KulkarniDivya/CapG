package programs;

import java.util.Scanner;

public class BrickGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of bricks");
		int n=s.nextInt();
		check(n);
	}

	private static void check(int n) {
		// TODO Auto-generated method stub
		int s=0;
		int i;
		for(i=0;i<n;i++)
		{
			s=s+(i+i*2);
			if(s>n)
			{
				break;
			}
		}
		s=s-i*2;
		if(s>n)
			System.out.println("PATLU");
		else
			System.out.println("MOTU");
	}

}
