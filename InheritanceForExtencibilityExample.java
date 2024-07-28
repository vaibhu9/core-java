package ClassExamples;

class Value1{			//It is Super class or Base class or Parent class
	protected int a,b;
	
	public void setValue(int a,int b) {		//That is parent properties
		this.a=a;
		this.b=b;
	}
}

class Add extends Value1{		//It is Sub class or Derived class or Child class
	
		void show(){
		System.out.println("Addition is = "+(a+b));		//Here we use parent properties means we extend code of parent in child properties
	}
}
class Mul extends Value1{		//It is Sub class or Derived class or Child class
	
	public void show(){
		System.out.println("Multiplication is = "+(a*b));	//It is called as extensibility
	}
}
public class InheritanceForExtencibilityExample {

	public static void main(String[] args) {
		Add a=new Add();		//Here we create object of child class because in the case of inheritance we not create object of parent class
		a.setValue(12, 8);		//Because using child class object we can use parent class object
		a.show();
		
		Mul m=new Mul();
		m.setValue(5, 4);
		m.show();

	}

}
