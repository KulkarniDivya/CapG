package programs;

import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		arrange(n);
	}

	private static void arrange(int n) {
		// TODO Auto-generated method stub
		int x=0;
		int a=n%6;
		int m=6-a;
		m=m+n;
		if((m/6)%2==0)
		{
			switch(a)
			{
			case 0: x=n-11;
				break;
			case 1: x=n-1;
			break;
			case 2: x=n-3;
			break;
			case 3: x=n-5;
			break;
			case 4: x=n-7;
			break;
			case 5: x=n-9;
			break;
			}
		}
		else
		{
			switch(a)
			{
			case 0: x=n+1;
				break;
			case 1: x=n+11;
			break;
			case 2: x=n+9;
			break;
			case 3: x=n+7;
			break;
			case 4: x=n+5;
			break;
			case 5: x=n+3;
			break;
			}
		}
		String s;
		if(x%6==0||x%6==1)
			s="WS";
		else if(x%6==2||x%6==5)
			s="MS";
		else
			s="AS";
		System.out.println("Opposite seat:"+x);
		System.out.println("Seat type:"+s);
	}

}
