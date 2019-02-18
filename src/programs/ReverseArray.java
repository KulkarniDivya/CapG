package programs;

import java.util.Scanner;

public class ReverseArray {
	public void reverse(int[] a)
	{
		int b=a.length-1;
		int c=a.length/2;
		for (int i = 0; i < a.length; i++) {
			if(c>0)
			{
				int t=a[i];
				a[i]=a[b];
				a[b]=t;
				b--;
				c--;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		ReverseArray r= new ReverseArray();
		//1D Array
		int[] a=new int[6];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			a[i]=num;
		}
		r.reverse(a);
	}

}
