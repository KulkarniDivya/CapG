package encapsulation;

import java.util.Scanner;

public class Batch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the Roll no");
		int rno=sc.nextInt();
		System.out.println("Enter the fee");
		double fee=sc.nextDouble();
		System.out.println("Enter the college name (VJIT)");
		String cname=sc.next();*/
		Student s=new Student();
		s.setName("Divya");
		s.setRno(532);
		s.setFee(25000);
		s.setCollegename("VJIT");
		//System.out.println(s.getName());
		//System.out.println(s.getRno());
		//System.out.println(s.getFee());
		
		Student s1=new Student();
		s1.setName("Kavya");
		s1.setRno(544);
		s1.setFee(25000);
		s1.setCollegename("VJIT");
		//System.out.println(s1.getName());
		//System.out.println(s1.getRno());
		//System.out.println(s1.getFee());
		
		Student s2=new Student();
		s2.setName("Shruthi");
		s2.setRno(552);
		s2.setFee(25000);
		s2.setCollegename("CVSR");
		//System.out.println(s2.getName());
		//System.out.println(s2.getRno());
		//System.out.println(s2.getFee());
		
		System.out.println(s.getCollegename());
		System.out.println(s1.getCollegename());
		System.out.println(s2.getCollegename());
		
	}

}
