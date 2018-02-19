package java.misc;

import java.io.IOException;

public abstract class Dog {
	
	int serialNo;
	String colour;
	
	Dog()
	{
		System.out.println("Implicit Abstract Class Constructor");
	}
	
	Dog(int serialNo , String colour)  throws IOException
	{
		System.out.println("Inside Paramterized Constructor - Abstract Class");
		this.serialNo = serialNo;
		this.colour = colour;
	}
	
	public abstract String getGenus();
		
    public int getLimbCount()
    {
    	return 4;
    }
    
    public static void main(String[] args) throws IOException {
		
    	
    	Dog dog = new Alsatian(12, "Red");
    	System.out.println("Ho hO");
    	AnimalDriver.main(null);
	}

}