package java.misc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@MyAnnotation(value = 340, name = "Sibi")
public class MyAnnotationTest {
	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException {
		Annotation[] annList = MyAnnotationTest.class.getAnnotations();
		for (Annotation ann : annList) {

			MyAnnotation myAnn = (MyAnnotation) ann;
			System.out.println(myAnn.value());
			System.out.println(myAnn.name());
		}
		annList = null;
		Method method = MyAnnotationTest.class.getMethod("getIt",null);
		
		Method method_overloaded = MyAnnotationTest.class.getMethod("getIt",String.class);

		annList = method.getAnnotations();
		
	
		Parameter[] params = method_overloaded.getParameters();
		for(Parameter param :params)
		{
			System.out.println(param.isNamePresent());
			System.out.println(param);
		}
		for (Annotation ann : annList) {

			MyAnnotation myAnn = (MyAnnotation) ann;
			System.out.println(myAnn.value());
			System.out.println(myAnn.name());
		}

	}

	@MyAnnotation(value = 1, name = "Method")
	public void getIt() {

	}
	
	@MyAnnotation(value = 1, name = "Method")
	public void getIt(String dataInput) {

	}
}