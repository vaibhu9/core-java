package ClassExamples;

class CalSum{
	void findSum(int ...x) {	//Method with variable argument which indicated by ...
		int sum=0;				//It is internally an array
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
	System.out.println("Sum of all integer is = "+sum);
	}
}
public class MethodWithVariableExample {

	public static void main(String[] args) {
		CalSum cs=new CalSum();
		cs.findSum(10,20,30,40,50,60,70,80,90,100);	//Here we can pass infinite parameter to variable argument

	}

}
