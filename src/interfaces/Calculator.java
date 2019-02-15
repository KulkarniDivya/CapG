package interfaces;

public class Calculator implements Operation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.add(10, 20);
		c.sub(40, 20);
		c.mul(4, 9);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Result:"+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Result:"+(a-b));
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Result:"+(a*b));
	}

}
