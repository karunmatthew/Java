package java.generics;

public class Generics<T1,T2> {
	
	T1 nameObject;
	T2 valueObject;
	Generics<T1,T2> instance;
	
	public T1 getName()
	{
		return nameObject;
	}

	public void setNameObject(T1 nameObject)
	{
		this.nameObject = nameObject;
	}
	
	public void assign (Generics<T1,T2> gen)
	{
		this.instance = gen;
		System.out.println(instance.getName());
		
		
	}
	public static void main(String[] args) {
		Generics<String,Integer> generics = new Generics<>();
		generics.getName();
		
		generics.assign(new Generics<>());
		
	}
}
