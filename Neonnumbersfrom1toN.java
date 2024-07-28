package vaibhu.s9;
import java.util.*;
public class Neonnumbersfrom1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit to print all Neon numbers : ");
		int limit=s.nextInt();
		System.out.printf("All Neon numbers upto %d are : ",limit);
		for(int n=1;n<=limit;n++) {
			int square=n*n;
			int sum=0;
			while(square!=0) {
				int rem=square%10;
				square=square/10;
				sum=sum+rem;
			}
			if(sum==n) {
				System.out.printf("%d  ",n);
			}
		}

	}

}
