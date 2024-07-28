package ClassExamples;

class CalculateSum{
	void findSum(String name,int ...x) {	//Variable argument with simple argument
											//(simple argument always write left side and variable argument always right side at last)
											//We can pass only one variable argument, not more than one
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		System.out.println("Name is :\t"+name);
		System.out.println("Sum of all integer is =\t"+sum);
	}
}
public class VariableArgumentWithSimpleArgumentExample {

	public static void main(String[] args) {
		CalculateSum cs=new CalculateSum();
		cs.findSum("Vaibhav",10,20,30,40,50,60,70,80,90,100);	//Here we pass some simple argument and variable argument to method

	}

}
