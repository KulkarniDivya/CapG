package exceptions;

public class App3 {

	public static void main(String[] args) throws MyCustomException {
		// TODO Auto-generated method stub
		/*try {
			throw new MyCustomException();
		} catch (MyCustomException e) {
			// TODO: handle exception
		}*/
		
		int a=4;
		if(a==5)
			throw new MyCustomException();
		else
			System.out.println(a);
		System.err.println("Hello");
	}

}
