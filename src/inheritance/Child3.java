package inheritance;

public class Child3 extends Parent{
	String role;
	public void read()
	{
		role="Employee";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 c=new Child3();
		c.set();
		c.read();
		System.out.println(c.name+" is "+c.role);
	}

}
