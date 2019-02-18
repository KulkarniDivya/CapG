package exceptions;

public class App2 {
	public static void validate(int a)
	{
		if(a<18)
			throw new ArithmeticException("Age");
		else
			System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(31);
	}

}
