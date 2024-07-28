package ClassExamples;

class Addition{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getAdd() {
		return a+b;
	}
}

class Multiplication{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getMul() {
		return a*b;
	}
}

class Calc{		// Here we can pass only one object of addition class
	void performCalc(Addition ad) {	//If we try to pass object of another class
		int result=ad.getAdd();		//then we get compile time error mean it is 100% dependent
		System.out.println("Result is = "+result);	//on addition class object that is called as tight coupling
	}
}

public class TightCouplingExample {

	public static void main(String[] args) {
		Calc c=new Calc();
		Addition ad=new Addition();
		ad.setValue(8, 2);
		c.performCalc(ad);

	}

}
