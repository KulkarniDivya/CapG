package programs;

public class StringBuilderConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hellowo");
		String s2=new String("Worldhell");
		System.out.println(appendString(s1,s2));
	}

	private static StringBuilder appendString(String s1, String s2) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		int a=s1.length();
		int b=s2.length();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int c;
		if(a>b)
			c=b;
		else
			c=a;
		for(int i=0;i<c;i++)
		{
			s.append(ch1[i]);
			s.append(ch2[i]);
		}
		if(a>b)
		{
			c=a-b;
			while(c>0)
			{
				s.append(ch1[a-c]);
				c--;
			}
		}
		else 
		{
			c=b-a;
			while(c>0)
			{
				s.append(ch2[b-c]);
				c--;
			}
		}
		return s;
		
	}

}
