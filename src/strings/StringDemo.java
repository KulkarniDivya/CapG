package strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("hello this is the hello of hello");
		System.out.println(s.charAt(6));
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		//s.trim();
		System.out.println(s.startsWith("Hi"));
		System.out.println(s.endsWith("hello"));
		System.out.println(s.replace("h", "w"));
		System.out.println(s.replaceAll("hello", "hi"));
	}

}
