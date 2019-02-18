package exceptions;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		System.out.println("Start");
		try {
			
			System.out.println(3/0);
		}
		 catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println(e);
		 }
		try
		{
			System.out.println(a[90]);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Stop");
		}
	}

}
