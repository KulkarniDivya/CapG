package programs;

import java.util.Scanner;

public class Sort {
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
			for (int i = 1; i < a.length; i++) {
				int t=a[i];
				a[i]=a[a.length-1];
				a[a.length-1]=t;
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		Sort e= new Sort();
		//1D Array
		int[] a=new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			a[i]=num;
		}
		e.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
