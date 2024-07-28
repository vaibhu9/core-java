package ClassExamples;

class Value{
	int no;
	Value(int x){
		no=x;
		System.out.println("Value of no is :"+no);
	}
}
class Square1 extends Value{
	Square1(int x){
		super(x);	//Super constructor used to call or pass parameter to immediate parent constructor
	}				//It must be the first line of code in calling constructor
	public void show() {
		System.out.println("Square is = "+no*no);
	}
}
public class SupeConstructorExample {

	public static void main(String[] args) {
		Square1 s=new Square1(10);	//Here we pass parameter to child constructor
		s.show();

	}

}
