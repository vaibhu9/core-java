package ClassExamples;

abstract class Aa{		//Abstract class
	abstract void show();
	abstract void display();
	abstract void test();
}

class ADP extends Aa{	//Adapter class which able to provide specific
	void show() {		//method to child class
		
	}
	void display() {
		
	}
	void test() {
		
	}
}

class Bb extends ADP{	//Here we use only one method from abstract class
	void show() {		//with the help of adapter class
		System.out.println("I required show method");
	}
}

class Cc extends ADP{
	void display() {
		System.out.println("I required display method");
	}
}
public class AdapterClassExample {

	public static void main(String[] args) {
		Aa a1=new Bb();
		a1.show();
		
		a1=new Cc();
		a1.display();

	}

}
