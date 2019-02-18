package programs;

import java.util.Scanner;

public class Equal {
	public int equalityCheck(int[] a,int[] b)
	{
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i])
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		Equal r= new Equal();
		//1D Array
		System.out.println("Enter the size of 1st array");
		int n1=sc.nextInt();
		System.out.println("Enter the size of 2nd array");
		int n2=sc.nextInt();
		if(n1==n2)
		{
			int[] a=new int[n1];
			int[] b=new int[n2];
			for (int i = 0; i < a.length; i++) {
				System.out.println("Enter the "+i+"th element of 1st array");
				num=sc.nextInt();
				a[i]=num;
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println("Enter the "+i+"th element of 2nd array");
				num=sc.nextInt();
				b[i]=num;
			}
			int c=r.equalityCheck(a,b);
			if(c==0)
				System.out.println("Both arrays are equal");
			else
				System.out.println("Both arrays are not equal");
		}
		else
		{
			System.out.println("Size of 2 arrays should be same to check for equality of 2 arrays");
		}
	}

}
