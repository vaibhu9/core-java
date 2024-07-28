package ProgramOnInheritanceInJAVA;
import java.util.*;

abstract class Value{
	int a,b;
	
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	
	abstract void performCalculation();
}

class Add extends Value{
	void performCalculation() {
		System.out.println("Addition is = "+(a+b));
	}
}

class Sub extends Value{
	void performCalculation() {
		System.out.println("Subtraction is = "+(a-b));
	}
}

class Mul extends Value{
	void performCalculation() {
		System.out.println("Multiplication is = "+a*b);
	}
}

class Div extends Value{
	void performCalculation() {
		System.out.println("Division is = "+a/b);
	}
}

class Calculator{
	void performOperation(Value v) {
		v.performCalculation();
	}
}

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		Calculator c=new Calculator();
		
		int ch;
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("9.Exit");
			
			System.out.println("\nEnter your choice :");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1 :
					System.out.println("Enter two values :");
					int a=s.nextInt();
					int b=s.nextInt();
					
					Add a1=new Add();
					a1.setValue(a, b);
					c.performOperation(a1);
					
					break;
					
				case 2 :
					System.out.println("Enter two values :");
					a=s.nextInt();
					b=s.nextInt();
					
					Sub s1=new Sub();
					s1.setValue(a, b);
					c.performOperation(s1);
					
					break;
					
				case 3 :
					System.out.println("Enter two values :");
					a=s.nextInt();
					b=s.nextInt();
					
					Mul m1=new Mul();
					m1.setValue(a, b);
					c.performOperation(m1);
					
					break;
					
				case 4 :
					System.out.println("Enter two values :");
					a=s.nextInt();
					b=s.nextInt();
					
					Div d1=new Div();
					d1.setValue(a, b);
					c.performOperation(d1);
					
					break;
					
				case 9 :
					break;
					
				default : System.out.println("Sorry !!! You have entered wrong choice...");
			}
		}while(ch!=9);
		
		s.close();

	}

}
