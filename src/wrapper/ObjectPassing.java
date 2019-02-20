package wrapper;

import java.util.Scanner;

import encapsulation.Student;

public class ObjectPassing {
	Student s=new Student();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectPassing o=new ObjectPassing();
		//Student s1=o.accept();
		//o.s=o.accept();
		o.display(o.accept());
	}

	private void display(Student s) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+s.getName());
		System.out.println("Rno:"+s.getRno());
		System.out.println("Fee:"+s.getFee());
	}

	private Student accept() {
		// TODO Auto-generated method stub
		System.out.println("Enter name");
		s.setName(sc.next());
		System.out.println("Enter RollNo");
		s.setRno(sc.nextInt());
		System.out.println("Enter Fee");
		s.setFee(sc.nextInt());
		return s;
	}

}
