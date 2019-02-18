package exceptions;

public class Power {
	public static void power(int[] a,int[] b)
	{
		for (int i = 0; i < a.length; i++) {
			if(b[i]>=0&&a[i]!=0)
			{
				int c=b[i]-1;
				int d=a[i];
				if(b[i]==0)
					System.out.println("1");
				else
				{
					while(c!=0)
					{
						a[i]=a[i]*d;
						c--;
					}
					System.out.println(a[i]);
				}
				
			}
			else
			{
				try
				{
					if(a[i]==0||b[i]==0)
						throw new ArithmeticException("0");
					else if(b[i]<0)
						throw new ArithmeticException("Negative");
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,0,-3};
		int[] b= {1,4,1,-3};
		if(a.length==b.length)
		power(a,b);
		else
			System.out.println("Length of both arrays should be same");
	}

}
