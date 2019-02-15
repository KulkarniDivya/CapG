package interfaces;

public class Child implements Father, Mother{  //muliple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child c=new Child();
			c.name();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name:Divya");
	}

}
