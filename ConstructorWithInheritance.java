package ClassExamples;

//class Value2{
//	
//	Value2(){	//When we have default constructor in  parent class and constructor in child class and if we create object of child class
//				//then parent constructor get executed before child constructor
//		System.out.println("I am parent constructor");
//	}
//}
//class Square2 extends Value2{
//	Square2(){
//		System.out.println("I am child constructor");
//	}
//}
//
//public class ConstructorWithInheritance {
//
//	public static void main(String[] args) {
//		Square2 s=new Square2();	//Creating object of child class
//
//	}
//
//}

class Value2{
	protected int num;
	
		Value2(int num){	//When user define parameterized constructor in parent class 
							//then we need to pass parameter from child class constructor by using super constructor
		this.num=num;
		System.out.println("I am parent constructor");
		System.out.println("From Parent constructor Square is = "+(num*num));
	}
}
class Square2 extends Value2{
	Square2(){
		super(5);		//Passing parameter to parent class constructor
		System.out.println("I am child constructor");
		System.out.println("From child constructor Square is = "+(num*num));
	}
	public void show() {
		System.out.println("From show method Square is = "+(num*num));
	}
}

public class ConstructorWithInheritance {

	public static void main(String[] args) {
		Square2 s=new Square2();	//Creating object of child class
		s.show();

	}

}
