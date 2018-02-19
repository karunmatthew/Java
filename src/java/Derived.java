package java;

public class Derived extends Base{

	
	public static void doIt()
	{
		double a = 1.0/0.0;
		
		if(Double.isInfinite(a))
		{
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Derived d = new Derived();
		Derived.doIt();
	}
}
