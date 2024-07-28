package vaibhu.s9;

abstract class Value {
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	abstract int getResult();
}
class Add extends Value{
	int getResult() {
		return a+b;
	}
}
class Mul extends Value{
	int getResult() {
		return a*b;
	}
}
class Calc{
	void performCalc(Value v) {
		int result=v.getResult();
		System.out.println("Result is "+result);
	}
}
public class LooseCouplingApplication{
	public static void main(String[] args) {
		Calc c=new Calc();
		Value v=new Add();
		v.setValue(10,20);
		c.performCalc(v);
		v=new Mul();
		v.setValue(5,4);
		c.performCalc(v);
	}
}
