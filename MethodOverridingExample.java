package ClassExamples;

class A4{
	void show() {
		System.out.println("I am A class show method");
	}
}

class B4 extends A4{
	void show() {
		System.out.println("I am B class show method");
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		B4 b1=new B4();
		b1.show();		//In the case of method overriding 
						//when we create object of child class
						//then by default child version get executed
	}

}
