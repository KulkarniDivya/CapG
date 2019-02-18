package programs;

import java.util.Scanner;

public class ArrayElements {
	public static void plusMinus(int[] a) {
		int c1=0;
		int c2=0;
		int c3=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0)
				c1++;
			else if(a[i]<0)
				c2++;
			else
				c3++;
		}
		
		System.out.println("Percentage of +ve numbers:"+((double)c1/a.length)*100+"%");
		System.out.println("Percentage of -ve numbers:"+((double)c2/a.length)*100+"%");
		System.out.println("Percentage of zeroes:"+((double)c3/a.length)*100+"%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		Equal r= new Equal();
		//1D Array
		System.out.println("Enter the size of 1st array");
		int n1=sc.nextInt();
			int[] a=new int[n1];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Enter the "+i+"th element of 1st array");
				num=sc.nextInt();
				a[i]=num;
			}
	plusMinus(a);

}
}
