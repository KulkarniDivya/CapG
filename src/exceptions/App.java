package exceptions;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		try
		{
			
			System.out.println(2/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		System.out.println("Ends");
	}
	
}
