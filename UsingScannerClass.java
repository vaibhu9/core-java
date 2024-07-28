package ClassExamples;
import java.util.*;		//Importing package of scanner class
public class UsingScannerClass {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);		//Creating object of Scanner class
		int a,b,c;
		System.out.println("Enter two values :");
		a=xyz.nextInt();		//Geting input with the help of Scanner class object
		b=xyz.nextInt();
		c=a+b;
		System.out.println("Addition is = "+c);
		
		System.out.println("Enter two floating numbers :");
		float d=xyz.nextFloat();
		float e=xyz.nextFloat();
		float f=d+e;
		System.out.println("Addition of float is = "+f);
		
		System.out.println("Enter two double numbers :");
		double g=xyz.nextDouble();
		double h=xyz.nextDouble();
		double i=g+h;
		System.out.println("Addition of double is = "+i);
		
		System.out.println("Enter two long numbers :");
		long j=xyz.nextLong();
		long k=xyz.nextLong();
		long l=j+k;
		System.out.println("Addition of long is = "+l);
		
		System.out.println("Enter two String :");
		String m=xyz.nextLine();
		String n=xyz.nextLine();
		String o=m+n;
		System.out.println("Addition of Strings is = "+o);
		
		xyz.close();

	}

}
