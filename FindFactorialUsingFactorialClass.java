package MachineTest;
import java.util.*;

class Factorial{		//class for calculate factorial
	int num;
	void setValue(int x){
	num=x;
	}
	
	int getFactorial(){
		int fact=1;
		for(int i=1;i<=num;i++){	//logic to calculate factorial
		fact=fact*i;
		}
	return fact;		//return factorial
	}
}

public class FindFactorialUsingFactorialClass {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number");
			int a=s.nextInt();
			Factorial f=new Factorial();		//creating object of factorial class
			f.setValue(a);
			int result=f.getFactorial();		//call to getfactorial method
			System.out.println("Factorial is = "+result);
			s.close();
	}

}
