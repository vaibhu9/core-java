package vaibhu.s9;
import java.util.*;
public class Armstrongnumbersfrom1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit to print all Armstrong numbers : ");
		int limit=s.nextInt();
		System.out.printf("All Armstrong numbers upto %d are : ",limit);
		for(int n=1;n<=limit;n++) {
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
