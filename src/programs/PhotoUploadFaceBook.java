package programs;

import java.util.Scanner;

public class PhotoUploadFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the minimum size of photo");
		int l=s.nextInt();
		System.out.println("Enter height and width of photo");
		int w=s.nextInt();
		int h=s.nextInt();
		check(w,h,l);
		
	}
	
	private static void check(int w, int h, int l) {
		// TODO Auto-generated method stub
		if(w>=l&&h>=l)
		{
			if(w==h)
				System.out.println("ACCEPTED");
			else
				System.out.println("CROP IT");
		}
		else
			System.out.println("UPLOAD ANOTHER");
	}

}
