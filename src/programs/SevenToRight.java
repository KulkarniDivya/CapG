package programs;

import java.util.Scanner;

public class SevenToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move(accept());
	}

	private static void move(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if(a[i]==7)
			{
				for (int j = i+1; j < a.length; j++) {
					if(a[j]!=7)
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
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
