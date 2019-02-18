package programs;

import java.util.Scanner;

public class AppleOrange {
	public static void countAppleOranges(int s,int t,int a,int b,int[] m,int[] n)
	{
		int c1=0;
		int c2=0;
		//System.out.println(d1);
		for (int i = 0; i < m.length; i++) {
			if((m[i]+a>=s)&&(m[i]+a<=t))
				c1++;
		}
		for (int i = 0; i < n.length; i++) {
			if((n[i]+b>=s)&&(n[i]+b<=t))
				c2++;
		}
		System.out.println("No.of Apples:"+c1);
		System.out.println("No.of Oranges:"+c2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter data");
		/*int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();*/
		int p[]= {10,-5,15,7,18};
		int q[]= {10,-17,15,-7,-15};
		/*for (int i = 0; i < q.length; i++) {
			q[i]=sc.nextInt();
		}
		for (int j = 0; j < p.length; j++) {
			p[j]=sc.nextInt();
		}*/
		countAppleOranges(10,20,5,30,p,q);
	}

}
