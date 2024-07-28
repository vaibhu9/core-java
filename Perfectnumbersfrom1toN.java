package vaibhu.s9;
import java.util.*;
public class Perfectnumbersfrom1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit to print all Perfect numbers : ");
		int limit=s.nextInt();
		System.out.printf("All Perfect numbers upto %d are : ",limit);
		for(int n=1;n<=limit;n++) {
			int sum=0;
			for(int d=1;d<=n/2;d++) {
				if(n%d==0) {
					sum=sum+d;
				}
			}
			if(sum==n) {
				System.out.printf("%d  ",n);
			}
		}

	}

}
