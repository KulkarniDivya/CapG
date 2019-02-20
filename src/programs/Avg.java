package programs;

import java.util.Scanner;

public class Avg {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a=read();
		display(avgGreat(a),a);
		
	}

	

	private static double[] read() {
		// TODO Auto-generated method stub
		double[] a=new double[6];
		double num;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num=sc.nextDouble();
			a[i]=num;
		}
		return a;
	}



	private static void display(double avg, double[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if(a[i]>avg)
				System.out.println(a[i]);
		}
	}



	private static double avgGreat(double[] a) {
		// TODO Auto-generated method stub
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		double s=sum/a.length;
		return s;
	}

}
