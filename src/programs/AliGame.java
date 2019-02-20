package programs;

public class AliGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("24S284-22");
		if(checkFormat(s))
			check(s);
	}

	

	private static boolean checkFormat(String s) {
		// TODO Auto-generated method stub
		boolean sc=false;
	//char a=s.charAt(2);
		if(s.length()==9)
		{
			if((byte)s.charAt(2)>=65&&(byte)s.charAt(2)<=96)
			{
				if(s.charAt(6)=='-')
				{
					sc=true;
				}
				else
					System.out.println("6th letter must be a '-'");
			}
			else
				System.out.println("3rd character must be a letter");
		}
		return sc;
	}



	private static void check(String s) {
		// TODO Auto-generated method stub
		if(s.charAt(2)=='A'||s.charAt(2)=='E'||s.charAt(2)=='I'||s.charAt(2)=='O'||s.charAt(2)=='U'||s.charAt(2)=='Y')
			System.out.println("Invalid");
		else
		{
			int c=0;
			char[] ch=s.toCharArray();
			for (int i = 0; i < ch.length-1; i++) {
				if(i!=2&&i!=6&&i+1!=2&&i+1!=6)
				{
					if((ch[i]+ch[i+1])%2==0)
						c++;
						
				}
			}
			//System.out.println(c);
			if(c==4)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
		
	}

}
