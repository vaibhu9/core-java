package ClassExamples;

class A1{
	A1(){
		this(5);
		System.out.println("I am default constructor");
	}
	A1(int a){
		this("Vaibhav");
		System.out.println("I am integer parameterized constructor");
	}
	A1(String a){
		this(5.5f);
		System.out.println("I am Stirng parameterized constructor");
	}
	A1(float a){
		System.out.println("I am float parameterized constructor");
	}
}
public class ConstructorChainingUsingThis {

	public static void main(String[] args) {
		A1 a1=new A1();

	}

}

// We use this constructor for constructor overloading
// When we use constructor chaining then last calling constructor execute first