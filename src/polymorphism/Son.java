package polymorphism;

public class Son extends Father {
	public void marry()
	{
		System.out.println("Mary");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s= new Son();
		s.marry();
	}

}
