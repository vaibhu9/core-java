package vaibhu.s9;
import java.util.*;

class Limit{
	int start,end;
	void setLimit(int start,int end) {
		this.start=start;
		this.end=end;
	}
}

class Armstrongnumbers extends Limit{
	public void find() {
		System.out.printf("\nAll Armstrong numbers from %d to %d are :\n",start,end);
		for(int n=start;n<=end;n++) {
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
				System.out.printf("%d\t",n);
			}
		}
		System.out.println("\n");
	}
}

class Ducknumbers extends Limit{
	public void find() {
		System.out.printf("\nAll Duck numbers from %d to %d are :\n",start,end);
		for(int n=start;n<=end;n++) {
			int temp=n;
			while(temp!=0) {
				int rem=temp%10;
				temp=temp/10;
				if(rem==0) {
					System.out.printf("%d\t",n);
					break;
				}
			}
		}
		System.out.println("\n");
	}
}

class Neonnumbers extends Limit{
	public void find() {
		System.out.printf("\nAll Neon numbers from %d to %d are :\n",start,end);
		for(int n=start;n<=end;n++) {
			int square=n*n;
			int sum=0;
			while(square!=0) {
				int rem=square%10;
				square=square/10;
				sum=sum+rem;
			}
			if(sum==n) {
				System.out.printf("%d\t",n);
			}
		}
		System.out.println("\n");
	}
}

class Palindromenumbers extends Limit{
	public void find() {
		System.out.printf("\nAll Palindrome numbers from %d to %d are :\n",start,end);
		for(int n=start;n<=end;n++) {
			int temp=n;
			int rev=0;
			while(temp!=0) {
				int rem=temp%10;
				temp=temp/10;
				rev=rev*10+rem;
			}
			if(rev==n) {
				System.out.printf("%d\t",n);
			}
		}
		System.out.println("\n");
	}
}

class Perfectnumbers extends Limit{
	public void find() {
		System.out.printf("\nAll Perfect numbers from %d to %d are :\n",start,end);
		for(int n=start;n<=end;n++) {
			int sum=0;
			for(int d=1;d<=n/2;d++) {
				if(n%d==0) {
					sum=sum+d;
				}
			}
			if(sum==n) {
				System.out.printf("%d\t",n);
			}
		}
		System.out.println("\n");
	}
}

class Primenumbers extends Limit{
	public void find() {
		System.out.printf("\nAll Prime numbers from %d to %d are :\n",start,end);
		for(int n=start;n<=end;n++) {
			int count=0;
			for(int d=1;d<=n;d++) {
				if(n%d==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.printf("%d\t",n);
			}
		}
		System.out.println("\n");
	}
}

class Strongnumbers extends Limit{
	public void find() {
		System.out.printf("\nAll Strong numbers from %d to %d are :\n",start,end);
		for(int n=start;n<=end;n++) {
			int temp=n;
			int sum=0;
			while(temp!=0) {
				int rem=temp%10;
				temp=temp/10;
				int factorial=1;
				for(int i=1;i<=rem;i++) {
					factorial=factorial*i;
				}
				sum=sum+factorial;
			}
			if(sum==n) {
				System.out.printf("%d\t",n);
			}
		}
		System.out.println("\n");
	}
}

class Magicnumbers extends Limit{
	public void find() {
		System.out.println("\nAll magic numbers between "+start+" to "+end+" are:");
		while(start<=end){
		int num=start;
			while(num>9){
			int sum=0;
				while(num>0){
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
				}
			num=sum;
			}
			if(num==1){
			System.out.printf("%d\t",start);
			}
		start++;
		}
		System.out.println("\n");
	}
}


public class FindNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start,end;
		
		char run;
		do {
			System.out.println("\n\n1) Find Armstrong numbers");
			System.out.println("2) Find Duck numbers");
			System.out.println("3) Find Neon numbers");
			System.out.println("4) Find Palindrome numbers");
			System.out.println("5) Find Perfect numbers");
			System.out.println("6) Find Prime numbers");
			System.out.println("7) Find Strong numbers");
			System.out.println("8) Find Magic numbers");
			
			System.out.printf("\nEnter Your choice : ");
			char choice=s.next().charAt(0);
			
			switch(choice) {
			
			case '1':
				System.out.println("Enter the start and end limit to print all Armstrong numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Armstrongnumbers a1=new Armstrongnumbers();
				a1.setLimit(start, end);
				a1.find();
				
				break;
				
			case '2':
				System.out.println("Enter the start and end limit to print all Duck numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Ducknumbers d1=new Ducknumbers();
				d1.setLimit(start, end);
				d1.find();

				break;
				
			case '3':
				System.out.println("Enter the start and end limit to print all Neon numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Neonnumbers n1=new Neonnumbers();
				n1.setLimit(start, end);
				n1.find();

				break;
				
			case '4':
				System.out.println("Enter the start and end limit to print all Palindrome numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Palindromenumbers p1=new Palindromenumbers();
				p1.setLimit(start, end);
				p1.find();

				break;
				
			case '5':
				System.out.println("Enter the start and end limit to print all Perfect numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Perfectnumbers p2=new Perfectnumbers();
				p2.setLimit(start, end);
				p2.find();

				break;
				
			case '6':
				System.out.println("Enter the start and end limit to print all Prime numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Primenumbers p3=new Primenumbers();
				p3.setLimit(start, end);
				p3.find();

				break;
				
			case '7':
				System.out.println("Enter the start and end limit to print all Strong numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Strongnumbers s1=new Strongnumbers();
				s1.setLimit(start, end);
				s1.find();

				break;
				
			case '8':
				System.out.println("Enter the start and end limit to print all Magic numbers : ");
				start=s.nextInt();
				end=s.nextInt();
				Magicnumbers m1=new Magicnumbers();
				m1.setLimit(start, end);
				m1.find();
				
				break;
				
			default : System.out.println("Sorry !!!   Yout have entered wrong choice.");
			
			}
			System.out.println("\nDo you want to continue ? (y/n) :");
			run=s.next().charAt(0);
			
		}while(run!='n');
		
		s.close();
	}
}
