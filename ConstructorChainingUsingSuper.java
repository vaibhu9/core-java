package ClassExamples;

class A3{
	A3(){
		System.out.println("I am A constructor");
	}
}

class B3 extends A3{
	B3(){
		super();
		System.out.println("I am B constructor");
	}
}

class C3 extends B3{
	C3(){
		super();
		System.out.println("I am C constructor");
	}
}

class D3 extends C3{
	D3(){
		super();
		System.out.println("I am D constructor");
	}
}

public class ConstructorChainingUsingSuper {

	public static void main(String[] args) {
		D3 d1=new D3();

	}

}


// We use super constructor to work with immediate parent class constructor 
//When we use constructor chaining then last calling constructor execute first