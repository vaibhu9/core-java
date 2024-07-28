package vaibhu.s9;
import java.util.*;
public class Strongnumbersfrom1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit to print all Strong numbers : ");
		int limit=s.nextInt();
		System.out.printf("All Strong numbers upto %d are : ",limit);
		for(int n=1;n<=limit;n++) {
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
				System.out.printf("%d  ",n);
			}
		}
	}

}
