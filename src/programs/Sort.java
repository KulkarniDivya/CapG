package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
		public void sort(int[] a)
		{
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if(a[i]>a[j])
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
			int d=a.length/2;
			int e=a.length-d;
			int[] b=new int[d]; int f=0;
			int[] c=new int[e]; int g=0;
			for (int i = 0; i < a.length; i++) {
				if(f<b.length)
				{
					b[f]=a[i];
					f++;
				}
				else
				{
					c[g]=a[i];
					g++;
				}
			}
			f=0;
			g=c.length-1;
			for (int i = 0; i < a.length; i++) {
				if(f<b.length)
				{
					a[i]=b[f];
					i++;
					f++;
				}
				
				if(i<a.length&&g>=0)
				{
					a[i]=c[g];
					g--;
				}
				
				
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		Sort e= new Sort();
		//1D Array
		int[] a=new int[6];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextInt();
			a[i]=num;
		}
		e.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
