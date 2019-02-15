package abstractclass;

public abstract class Operation {
	abstract public void add(int a, int b);
	abstract public void sub(int a, int b);
	public void mul(int a, int b)
	{
		System.out.println("Result:"+a*b);
	}
}
