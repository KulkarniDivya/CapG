package programs;

import java.util.Arrays;

public class Candles {
	public static int candle(int[] a)
	{
		int b=a[a.length-1];int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b)
				c++;
		}
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age=4;
		int[] c= {3,2,3,1};
		Arrays.sort(c);
		System.out.println(candle(c));
	}

}
