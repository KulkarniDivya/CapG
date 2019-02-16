package programs;

import java.util.Scanner;

public class Small {
	public void sort(int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		Small e= new Small();
		//1D Array
		int[] a=new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			a[i]=num;
		}
		e.sort(a);
		System.out.println("Smallest:"+a[a.length-1]);
		System.out.println("2nd Smallest:"+a[a.length-2]);
	}

}
