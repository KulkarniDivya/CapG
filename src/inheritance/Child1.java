package inheritance;

public class Child1 extends Parent {
	String name;
	String role;
	public Child1()
	{
		super.set();
		read();
		System.out.println(super.name+" is from "+name);
	}
	public void read()
	{
		name="A";
		role="Student";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child1();
		
		
		
	}

}
