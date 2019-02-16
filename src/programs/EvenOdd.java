package programs;

import java.util.Scanner;

public class EvenOdd {
	public void evenOdd(int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			int j=i+1;
				if(a[i]%2!=0)
				{
					while(j<a.length)
					{
						if(a[j]%2==0)
						{
							int t=a[i];
							a[i]=a[j];
							a[j]=t;
							break;
						}
						else
						{
							j++;
						}
					}
					
				}
				
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		EvenOdd e= new EvenOdd();
		//1D Array
		int[] a=new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			a[i]=num;
		}
		e.evenOdd(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
