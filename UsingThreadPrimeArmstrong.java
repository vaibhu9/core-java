package Practical;

class Prime extends Thread{
	public void run() {
		System.out.println("All prime numbers upto 20 are :");
		for(int i=1;i<=20;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.printf("%d\t",i);
			}
		}
	}
}

class Armstrong extends Thread{
	public void run() {
		System.out.println("\nAll armstrong numbers upto 200 are :");
		for(int n=1;n<=200;n++) {
			int temp=n;
			int digits=0;
			while(temp!=0) {
				digits++;
				temp=temp/10;
			}
			temp=n;
			int sum=0;
			while(temp!=0) {
				int rem=temp%10;
				temp=temp/10;
				int power=1;
				for(int i=1;i<=digits;i++) {
					power=power*rem;
				}
				sum=sum+power;
			}
			if(sum==n) {
				System.out.printf("%d  ",n);
			}
		}
	}
}

public class UsingThreadPrimeArmstrong {

	public static void main(String[] args) {
		Prime p=new Prime();
		p.run();
		
		Armstrong a=new Armstrong();
		a.run();

	}

}
