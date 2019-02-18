package programs;

public class Clock {
	public static String convert(String s)
	{
		
		if(s.startsWith("12")&&s.endsWith("am"))
		{
			
			s=s.replace("12","00");
			int z=s.indexOf('a');
			s=s.substring(0, z);
			
		}
		else
		{
			String[] s1=s.split(":");
			if(s.endsWith("pm"))
			{
				if(s1[0].equals("12"))
				{
					
				}
				else
				{
					int h=Integer.parseInt(s1[0]);
					h=h+12;
					//System.out.println(h);
					s1[0]=Integer.toString(h);
				}
				
			}
			s=s1[0]+":"+s1[1]+":"+s1[2].charAt(0)+s1[2].charAt(1);
			
		}
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("6:34:32pm");
		s=convert(s);
		System.out.println(s);
	}

}
