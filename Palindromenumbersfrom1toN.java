package vaibhu.s9;
import java.util.*;
public class Palindromenumbersfrom1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit to print all Palindrome numbers : ");
		int limit=s.nextInt();
		System.out.printf("All Palindrome numbers upto %d are : ",limit);
		for(int n=0;n<=limit;n++) {
			int temp=n;
			int rev=0;
			while(temp!=0) {
				int rem=temp%10;
				temp=temp/10;
				rev=rev*10+rem;
			}
			if(rev==n) {
				System.out.printf("%d  ",n);
			}
		}

	}

}
