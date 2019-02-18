package programs;

import java.util.Scanner;

public class RemoveDuplicate {
	public int[] remove(int[] a)
	{
		int k=0;
		int c=0;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
				a[i]=0;
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
				k++;
		}
		int b[]=new int[k];
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			{
				b[c]=a[i];
				c++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		RemoveDuplicate r= new RemoveDuplicate();
		//1D Array
		int[] a=new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			a[i]=num;
		}
		a=r.remove(a);
		System.out.println("Length of array:"+a.length);
	}

}
