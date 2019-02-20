package wrapper;

public class WrapperInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer j=new Integer("35");
		String s="209";
		Integer i=new Integer(20);
		int i1=i;//Unboxing
		Integer i2=new Integer(i1);//Autoboxing
		Integer k=new Integer(s);
		System.out.println(i2);
		System.out.println(k);
	}

}
