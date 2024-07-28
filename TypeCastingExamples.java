package ClassExamples;

public class TypeCastingExamples {

	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(args[0]);	//Type casting (String to Integer)
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("Addition is = "+c);
		
		float d=Float.parseFloat(args[2]);	//Type casting (String to Float)
		float e=Float.parseFloat(args[3]);
		float f=d*e;
		System.out.println("Multiplication is = "+f);
		
		double g=Double.parseDouble(args[4]);	//Type casting (String to Double)
		double h=Double.parseDouble(args[5]);
		double i=g-h;
		System.out.println("Subtraction is = "+i);

	}

}
