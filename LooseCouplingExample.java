package ClassExamples;

abstract class Val{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	abstract int getResult();
}

class Addit extends Val{
	int getResult() {
		return a+b;
	}
}

class Multip extends Val{
	int getResult() {
		return a*b;
	}
}

class Calcul{	// Here we can accept any type of object so it is partially dependent
	void performCalc(Val v) {	// so this is called loose coupling
		int result=v.getResult();
		System.out.println("Result is = "+result);
	}
}
public class LooseCouplingExample {

	public static void main(String[] args) {
		Calcul c=new Calcul();
		Val v=new Addit();
		v.setValue(10, 10);
		c.performCalc(v);
		
		v=new Multip();		//same object behave differently so
		v.setValue(5, 5);	//we can say it is dynamic polymorphism
		c.performCalc(v);

	}

}
