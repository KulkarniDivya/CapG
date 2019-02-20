package programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,7,1,9,2,6};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int k=s.nextInt();
		//System.out.println("Smallest(0) or Largest(1)");
		//int z=s.nextInt();
		Arrays.sort(a);
		smallest(a,k);
		largest(a,k);
	}

	private static void largest(int[] a, int k) {
		// TODO Auto-generated method stub
		System.out.println(k+"th largest element:"+a[a.length-k]);
	}

	private static void smallest(int[] a, int k) {
		// TODO Auto-generated method stub
		System.out.println(k+"th smallest element:"+a[k-1]);
	}

}
