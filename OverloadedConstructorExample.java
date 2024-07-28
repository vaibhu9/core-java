package ClassExamples;

class Sum{
	Sum(int x,int y){		//Overloaded constructor
		System.out.println("Addition of integer is = "+(x+y));
	}
	Sum(float x,float y){	//Overloaded constructor
		System.out.println("Additon of float is = "+(x+y));
	}
}
public class OverloadedConstructorExample {

	public static void main(String[] args) {
		Sum s1=new Sum(10,20);		//Calling integer constructor
		Sum s2=new Sum(5.5f,4.5f);	//Calling float constructor

	}

}
