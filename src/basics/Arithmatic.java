package basics;
import java.util.Scanner;
public class Arithmatic {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1=500;
		short num2=400;
		System.out.println(num1+num2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		short n1=sc.nextShort();
		System.out.println("Enter 2nd number");
		short n2=sc.nextShort();
		System.out.println("The result is"+(n1+n2));
	}
}
