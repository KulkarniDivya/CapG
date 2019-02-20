package programs;

import java.util.Scanner;

public class ProfilePicture {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the minimum size of photo");
		int l=s.nextInt();
		System.out.println("Enter no.of photos");
		int n=s.nextInt();
		int[] w=new int[n];
		int[] h=new int[n];
		System.out.println("Enter height and width of photo");
		for(int i=0;i<n;i++)
		{
			w[i]=s.nextInt();
			h[i]=s.nextInt();
			
		}
		check(w,h,l);
	}

	private static void check(int[] w, int[] h, int l) {
		// TODO Auto-generated method stub
		for(int i=0;i<w.length;i++)
		{
			if(w[i]>=l&&h[i]>=l)
			{
				if(w[i]==h[i])
					System.out.println("ACCEPTED");
				else
					System.out.println("CROP IT");
			}
			else
				System.out.println("UPLOAD ANOTHER");
		}
		
	}
	

}
