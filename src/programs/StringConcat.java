package programs;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello world");
		String s2=new String("Worldse");
		System.out.println(appendString(s1,s2));
	}

	private static String appendString(String s1, String s2) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		char[] ch=new char[ch1.length+ch2.length];
		for (int k = 0; k < ch.length; k++) {
			if(i<ch1.length)
			{
				ch[k]=ch1[i];
				i++;
				if(j<ch2.length)
				k++;
			}
			if(j<ch2.length)
			{
				ch[k]=ch2[j];
				j++;
			}
		}
		String s=new String(ch);
		//System.out.println(s);
		return s;
	}
	
}
