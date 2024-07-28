package ProgramOnInheritanceInJAVA;

abstract class Area{
	abstract void showArea();
}

class Circle extends Area{
	int radius;
	
	void setRadius(int rad) {
		radius=rad;
	}
	
	void showArea(){
		System.out.println("Area of circle is = "+3.14*radius*radius);
	}
}

class Rectangle extends Area{
	int len,wid;
	
	void setLengthWidth(int len,int wid) {
		this.len=len;
		this.wid=wid;
	}
	
	void showArea(){
		System.out.println("Area of rectange is = "+len*wid);
	}
}

public class AreaApplication {

	public static void main(String[] args) {
			Circle c=new Circle();
			Rectangle r=new Rectangle();
			
			c.setRadius(5);
			c.showArea();
			
			r.setLengthWidth(5, 4);
			r.showArea();
	}
}
