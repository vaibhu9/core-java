package Practical;

class NaturalNumber extends Thread{
	public void run() {
		try {
			System.out.println("Natural numbers are :");
			for(int i=1;i<=10;i++) {
				System.out.printf("%d\t",i);
				Thread.sleep(2000);
			}
		}
		catch(Exception ex) {
			System.out.println("Exception is "+ex);
		}
	}
}
public class UsingThreadNaturalNumbers {

	public static void main(String[] args) {
		NaturalNumber n=new NaturalNumber();
		n.run();

	}

}
