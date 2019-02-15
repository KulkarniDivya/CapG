package inheritance;

public class Child2 extends Child1{
	String a;
	public Child2()
	{
		super.set();
		super.read();
		scan();
		System.out.println(super.name+" "+super.name+" "+a);
	}
	public void scan()
	{
		a="CSE";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Child2();
	}

}
