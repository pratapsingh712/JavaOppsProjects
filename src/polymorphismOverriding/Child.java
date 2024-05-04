package polymorphismOverriding;

public class Child extends Parent{
		// This method overrides show() of parent 
		
		@Override void show()
		{
			System.out.println("Child's show()");
		}
}
