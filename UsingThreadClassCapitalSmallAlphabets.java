package Practical;

class Capital extends Thread{
	char A=65;
	char Z=90;
	
	public void run() {
		System.out.println("Capital Alphabets are :");
		while(A<=Z) {
			System.out.printf("%c\t",A);
			A++;
		}
	}
}

class Small extends Thread{
	char a=97;
	char z=122;
	
	public void run() {
		System.out.println("\nSmall Alphabets are :");
		while(a<=z) {
			System.out.printf("%c\t",a);
			a++;
		}
		
	}
}

public class UsingThreadClassCapitalSmallAlphabets {

	public static void main(String[] args) {
		Capital c=new Capital();
		c.run();
		
		Small s=new Small();
		s.run();

	}

}
