package bank;

public class Bank2 {
	int roll;
	public Bank2() {
		this(20);
		// TODO Auto-generated constructor stub
		System.out.println("Hello");
		new Bank2(40);
	}
	public Bank2(int roll) {
		// TODO Auto-generated constructor stub
		//this();
		this.roll=roll;
		System.out.println(this.roll);
		//new Bank2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank2 b1=new Bank2(1);
		
		//System.out.println(new Bank2());
	}

}
