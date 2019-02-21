package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("D:\\Programs\\demo1.txt");
			System.out.println("Enter String");
			String n=sc.next();
			byte[] b=n.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();
			System.out.println("Done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

