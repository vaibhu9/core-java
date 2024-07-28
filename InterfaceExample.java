package ClassExamples;

interface ABC{
	void show();
}

class DEF implements ABC{
	public void show() {
		System.out.println("I am show method");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		DEF d=new DEF();
		d.show();

	}

}
