package polymorphismOverloading;

public class AdditionUsingOverloading {

	public void add()
	{
		System.out.println("Addition of two number 10 and 20 is :"+(10+20));
	}
	
	public void add(int num, int num1)
	{
		int result = num + num1;
		System.out.println("Addition of two number :"+num+" and :"+num1+" is = "+result);
	}
	
	public void add(int num, float num1)
	{
		double result = num + num1;
		System.out.println("Addition of two number :"+num+" and :"+num1+" is = "+result);
	}
	
	
}
