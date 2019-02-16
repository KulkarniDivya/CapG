package programs;

import java.util.Scanner;

public class RemoveDuplicate {
	public void remove(int[] a)
	{
		int b[]=new int[5];
		b[0]=a[0];
		for (int i = 1; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					count++;
				}
			}
			
		}
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
		
	}

}
