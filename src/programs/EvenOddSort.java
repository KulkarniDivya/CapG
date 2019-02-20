package programs;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=evenOdd(accept());
		System.out.println(Arrays.toString(a));
	}
	private static int[] evenOdd(int[] a) {
		// TODO Auto-generated method stub
		
		int j=0;
		int k=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
				j++;
			else
				k++;
		}
		int[] b=new int[j];
		int[] c=new int[k];
		int y=0;
		int z=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				b[y]=a[i];
				y++;
			}
				
			else
			{
				c[z]=a[i];
				z++;
			}
		}
		Arrays.sort(b);
		Arrays.sort(c);
		System.out.println(Arrays.toString(b));
		System.arraycopy(b, 0, a, 0, j);
		System.arraycopy(c, 0, a, j, k);
		return a;
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
		//Arrays.sort(a);
		return a;
		
	}
}
