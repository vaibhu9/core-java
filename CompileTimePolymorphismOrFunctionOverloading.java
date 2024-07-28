package ClassExamples;

class Addi{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getAdd() {
		return a+b;
	}
}

class Multi{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getMul() {
		return a*b;
	}
}

class Calcu{	// In this class we use function overloading
	void performCalc(Addi ad) {	// to solve tight coupling problem
		int result=ad.getAdd();
		System.out.println("Addition is = "+result);
	}
	
	void performCalc(Multi m) {
		int result=m.getMul();
		System.out.println("Multiplication is = "+result);
	}
}

public class CompileTimePolymorphismOrFunctionOverloading {

	public static void main(String[] args) {
		Calcu c=new Calcu();
		Addi ad=new Addi();
		ad.setValue(8, 2);
		c.performCalc(ad);
		
		Multi m=new Multi();
		m.setValue(5, 2);
		c.performCalc(m);

	}

}
