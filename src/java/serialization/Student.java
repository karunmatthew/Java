package java.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	transient String name;
	int age;
	transient School school;
	public transient static String value  = "DEFAULT VALUE";

	Student(int id, String name, int age, School school) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.school = school;
		value = "INITIALIZED";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", school=" + school + ", value=" + value + "]";
	}

	

}
