package ClassExamples;

interface Result{
	void getResult();
}
class Square3 implements Result {
	int no;
	void setNum(int no) {
		this.no=no;
	}
	public void getResult() {
		System.out.println("Square is = "+no*no);
	}
}
class Cube implements Result{
	int no;
	void setNum(int no) {
		this.no=no;
	}
	public void getResult() {
		System.out.println("Cube is = "+no*no*no);
	}
}

public class InterfaceForSquareCubeExample {

	public static void main(String[] args) {
		Square3 s1=new Square3();
		s1.setNum(5);
		s1.getResult();
		
		Cube c1=new Cube();
		c1.setNum(5);
		c1.getResult();

	}

}
