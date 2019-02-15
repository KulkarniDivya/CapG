package arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		
		//1D Array
		int[] accno=new int[5];
		for (int i = 0; i < accno.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			accno[i]=num;
		}
		for (int i = 0; i < accno.length; i++) {
			System.out.println(accno[i]);
		}
		
		//2D Arrays
		System.out.println("Enter row and column values");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int[][] mat1=new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter the number");
				num=sc.nextInt();
				mat1[i][j]=num;
			}
		}
		for (int i = 0; i < row; i++) {
			System.out.println();
			for (int j = 0; j < column; j++) {
				System.out.print(mat1[i][j]+" ");
			}
		}
		}

}
