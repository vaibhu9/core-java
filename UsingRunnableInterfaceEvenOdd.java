package Practical;

class Even implements Runnable{
	int num;
	
	void setValue(int num) {
		this.num=num;
	}
	
	public void run() {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}

class Odd implements Runnable{
	int num;
	
	Odd(int num){
		this.num=num;
	}
	
	public void run() {
		try {
			for(int i=1;i<=num;i++) {
				if(i%2!=0) {
					System.out.println(i);
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception ex){
			System.out.println("Exception is "+ex);
		}
	}
}

public class UsingRunnableInterfaceEvenOdd {

	public static void main(String[] args) {
		Even e=new Even();
		e.setValue(10);
		e.run();
		
		Odd o=new Odd(10);
		o.run();

	}

}
