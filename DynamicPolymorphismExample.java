package ClassExamples;

abstract class Vehicle{
	abstract void engine();
}

class Bike extends Vehicle{
	void engine() {
		System.out.println("100 CC");
	}
}

class Car extends Vehicle{
	void engine() {			//Here engine() method differently behave two times
		System.out.println("1000 CC");	//Means same this behave differently
	}
}

public class DynamicPolymorphismExample {

	public static void main(String[] args) {
		Vehicle v=new Bike();
		v.engine();			//Here we use abstract class reference
							//that reference decide which version of child execute
							//is depend on run time object of child class.
		
		v=new Car();
		v.engine();

	}

}
