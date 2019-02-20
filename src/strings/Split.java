package strings;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("abcde fghij klmno pqrs uvwxyz");
		String[] s1=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		
	}

}
