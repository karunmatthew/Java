package java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializerManager {

	
	public static void main(String[] args) throws Exception {
		
		School school = new School( 1 , "Trivandrum");
		Student student = new Student(1, "Karun", 23, school);
		Student.value = "CHANGED";
		System.out.println(student);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Karun Mathew\\workspace\\Temp\\Student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Karun Mathew\\workspace\\Temp\\Student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student deserializedStudent = (Student) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(deserializedStudent);
		
		System.out.println(0.1 + 0.2);
		
		
		
	}
}


