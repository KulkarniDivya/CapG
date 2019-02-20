package programs;

import java.util.Scanner;

public class Right7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move(accept());
	}

	private static void move(int[] a) {
		// TODO Auto-generated method stub
		int[] b=new int[a.length];
		int c=0;int j=0;
		for (int i = 0; i < a.length; i++) {
				if(a[i]==7)
					c++;
				else
				{
					b[j]=a[i];
					j++;
				}
			}
		//System.out.println(j);
		for (; c>0; c--) {
			b[j]=7;
			j++;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	private static int[] accept() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	
}
