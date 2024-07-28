package ClassExamples;

class A{
	A(){
		this(5);		//Passing parameter to integer parameterized constructor
		System.out.println("I am default constructor");
	}
	A(int x){
		this(5.5f);		//Passing parameter to float parameterized constructor
						//It must be first line of code in calling constructor
		System.out.println("I am integer parameterized constructor");
	}
	A(float x){
		System.out.println("I am float parameterized constructor");
	}
}
public class ThisConstructorExample {

	public static void main(String[] args) {
		A a1=new A();		//Creating object of A class

	}

}
