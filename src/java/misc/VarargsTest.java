package java.misc;

import static java.lang.System.out;

public class VarargsTest {

	public static void main(String[] args) {
		
		doIt();		doIt("a","b","c","d");
		
		String a ="abc";
		System.out.println(a.getClass().getName());
		
		Entry entryArr[]= new Entry[3];
	}

	private static void doIt(String... dataIn) {

		out.println(dataIn.getClass().getName());
		
		for(String data :dataIn)
		{
			System.out.println(data);
		}
		
		out.println(dataIn);
		
	}
}
