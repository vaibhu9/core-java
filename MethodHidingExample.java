package ClassExamples;

class A5{
	static void show() {	// Method declare as static
		System.out.println("I am parent show method");
	}
}
class B5 extends A5{
	static void show() {	// Here we Override static method
		System.out.println("I am child show method");
	}
}
public class MethodHidingExample {

	public static void main(String[] args) {
		A5 a1=new A5();
		a1.show();
		
		B5 b1=new B5();
		b1.show();
		///////////////////////////////////////////////////////////////
		A5 b2=new B5();	// When we create reference of parent and object of child class
		b2.show();		//then by default parent logics get executed 
						// means child not override its logic on parent logic
						// means parent hide its logic from child modification called as method hiding
		///////////////////////////////////////////////////////////////
	}

}
