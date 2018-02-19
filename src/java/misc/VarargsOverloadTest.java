package java.misc;

public class VarargsOverloadTest {

	static void method(String... data) {
		System.out.println("VARARGS");
	}

	static void method(String data) {
		System.out.println("SINGLE STRING");
	}
	
	static void method(Integer... data)
	{
		System.out.println("DOUBLE INTEGER");
	}
	
	static void method(Integer data)
	{
		System.out.println("SINGLE INTEGER");
	}
	
	static void method(int... data)
	{
		System.out.println("VARARGS int");
	}
	
	
	
	
	public static void main(String[] args) {
		Integer i = new Integer(4);
		short s =9;
		method(s,s);

	}
}
