package arrays;

import java.util.Scanner;

public class Diagonal {
	public int sum(int a[][],int row,int column)
	{
		int sum1=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i==j)
					sum1=sum1+a[i][j];
			}
		}
		return sum1;
	}
	public int add(int a[][],int row,int column)
	{
		int sum2=0;
		int b=column-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(j==b)
				{
					sum2=sum2+a[i][j];
					//System.out.println(sum2);
					b--;
				}
			}
		}
		return sum2;
	}
	public int diaDiff(int a, int b)
	{
		int sub;
		sub=a-b;
				
		return Math.abs(sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		Diagonal d=new Diagonal();
		System.out.println("Enter row and column values");
		int row=sc.nextInt();
		int column=sc.nextInt();
		if(row==column)
		{
			int[][] mat1=new int[row][column];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.println("Enter the number");
					num=sc.nextInt();
					mat1[i][j]=num;
				}
			}
			int a=d.sum(mat1, row, column);
			int b=d.add(mat1, row, column);
			System.out.println("Difference:"+d.diaDiff(a, b));
		}
		else
		{
			System.out.println("Only square matrices are taken");
		}
	}

}
