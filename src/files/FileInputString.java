package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream=new FileInputStream("D:\\Programs\\demo1.txt");
			int i;
			while((i=fileInputStream.read()) != -1)
			{
				System.out.print((char)i);
			}
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
