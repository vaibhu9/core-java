package ClassExamples;

class Square{
	int no;
	Square(int x){		//Parameterized Constructor
		no=x;
	}
	
	void showSquare() {
		System.out.println("Square is = "+no*no);
	}
}
public class ParameterizedConstructorExample {

	public static void main(String[] args) {
		Square s1=new Square(5);	//Passing parameter to constructor
		s1.showSquare();

	}

}
