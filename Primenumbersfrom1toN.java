package vaibhu.s9;
import java.util.*;
public class Primenumbersfrom1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit to print all Prime numbers : ");
		int limit=s.nextInt();
		System.out.printf("All Prime numbers upto %d are : ",limit);
		for(int n=1;n<=limit;n++) {
			int count=0;
			for(int d=1;d<=n;d++) {
				if(n%d==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.printf("%d  ",n);
			}
		}
	}

}
