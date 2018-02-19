package java.misc;

import java.util.ArrayList;
import java.util.List;

public class BoxingTest {

	public static void main(String[] args) {
		
	int data = 8;
	Integer integerData = new Integer(8);
	
	if(integerData == data)
	{
		System.out.println("Its equal");
	}
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(data);
	
	System.out.println(list);
	
	}
}
