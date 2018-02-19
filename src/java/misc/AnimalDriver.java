package java.misc;

import java.io.IOException;

public class AnimalDriver {
	
	public static void main(String args[]) throws IOException
	{ 
		Alsatian alsatian = new Alsatian(45, "A123");
		
		System.out.println(alsatian.getLimbCount());
		System.out.println(alsatian.getGenus());
	}
}
