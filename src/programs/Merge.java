package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=accept();
		int[] b=accept();
		
			merge(a,b);
	}
	private static void merge(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int[] c=new int[a.length+b.length];
		int j=0;
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		/*for (int i = 0; i < c.length; i++) {
			c[i]=a[j];//System.out.println(j);
			i++;
			c[i]=b[j];//System.out.println(i);
			j++;
		}*/
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
	public static int[] accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		return a;
		
	}
}
