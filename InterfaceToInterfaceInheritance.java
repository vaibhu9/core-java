package ClassExamples;

interface A2{
	void show();
}
interface B extends A2{	//To inherit interface to interface we must use "extends" keyword
	void display();		//interface B contain two methods i.e show()
}						//and display() beacause B is child of A

class C implements B{
	public void show() {
		System.out.println("I am A method");
	}
	public void display() {
		System.out.println("I am B method");
	}
}

public class InterfaceToInterfaceInheritance {

	public static void main(String[] args) {
		C c1=new C();
		c1.show();
		c1.display();

	}

}
