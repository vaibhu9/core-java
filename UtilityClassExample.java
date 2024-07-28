package ClassExamples;

class TestUtil{
	private TestUtil() {	//Declaring constructor as private to create utility class
		
	}
	public static void show() {		//Define method as static for utility class
		System.out.println("Hello Vaibhav");
	}
}
public class UtilityClassExample {

	public static void main(String[] args) {
		TestUtil.show();		//Call method using class name (means without object)

	}

}
