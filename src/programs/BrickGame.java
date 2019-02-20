package programs;

import java.util.Scanner;

public class BrickGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of bricks");
		int n=s.nextInt();
		check(n);
	}

	private static void check(int n) {
		// TODO Auto-generated method stub
		int i=1;
		while(n>0)
		{
			n=n-i;
			if(n>=i*2)
			{
				n=n-i*2;
				if(n==0)
				{
					System.out.println("Motu");
					break;
				}
					
			}
				
			else
			{
				System.out.println("Motu");
				break;
			}
			
			if(n<=i+1)
			{
				System.out.println("Patlu");
				break;
			}
			i++;	
			
		}
	}

}
