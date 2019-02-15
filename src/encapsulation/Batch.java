package encapsulation;

public class Batch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student1 s1=new Student1();
		
		s1.setName("Bob");
		s.setName(s1.getName());
		System.out.println(s.getName());
	}

}
