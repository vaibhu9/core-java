package ClassExamples;

interface AAAA{
	void show();
}
interface BBBB{
	void show();
}
class CCCC{
	void show() {
		System.out.println("I am C method");
	}
}
class DDDD extends CCCC implements AAAA,BBBB{//Multiple parents
	public void show() {		//Resolving diamond problem here
		System.out.println("I am D method");
	}
}
public class MultipleInheritanceResolvingDiamondProblem {

	public static void main(String[] args) {
		DDDD d1=new DDDD();
		d1.show();

	}

}
