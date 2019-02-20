package programs;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of scenarios");
		int t=s.nextInt();
		int[] f=new int[t];
		int[] c=new int[t];
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter no.of friends");
			f[i]=s.nextInt();
			System.out.println("Enter no.of chocolates");
			c[i]=s.nextInt();
		}
		check(f,c);
	}

	private static void check(int[] f, int[] c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length; i++) {
			if(c[i]%f[i]==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
