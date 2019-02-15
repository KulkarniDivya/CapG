package bank;

public class Bank {
	int accno;
	int balance;
	public Bank() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor called");
	}
	
	public Bank(int accno, int balance) {
		// TODO Auto-generated constructor stub
		
			this.accno=accno;
			this.balance=balance;
			System.out.println(accno+" "+balance);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		Bank b2=new Bank(20,100);
		Bank b3=new Bank(50,80);
	}

}
