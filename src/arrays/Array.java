package arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num;
		Scanner sc= new Scanner(System.in);
		long[][] kotak=new long[4][];
		long[] customerDetails=new long[4];
		
		int k=0;
		int m=4;
		kotak[0]=new long[4];
		kotak[1]=new long[4];
		kotak[2]=new long[4];
		kotak[3]=new long[4];
		do
		{
			for (int i = 0; i < customerDetails.length; i++) {
				System.out.println("Enter Details:1.Accountno 2.Aadharno 3.Balance 4.Contactno");
				customerDetails[i]=sc.nextLong();
			}
			for(int i=0;i<4;i++)
			{
				kotak[k][i]=customerDetails[i];
			}
			k++;
			m--;
		}while(m>0);
		for(int i=0;i<kotak.length;i++)
		{
			System.out.println();
			for(int j=0;j<kotak[i].length;j++)
			{
				System.out.print(kotak[i][j]+" ");
			}
		}
	}

}
