package abstractclass;

public class Calci extends Operation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation c=new Calci();
		c.add(30, 80);
		c.sub(50, 30);
		c.mul(6, 9);
		
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
	

}
