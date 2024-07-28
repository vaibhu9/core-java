package vaibhu.s9;
import java.util.*;
public class Ducknumbersfrom1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit to print all Duck numbers : ");
		int limit=s.nextInt();
		System.out.printf("All Duck numbers upto %d are : ",limit);
		for(int n=1;n<=limit;n++) {
			int temp=n;
			while(temp!=0) {
				int rem=temp%10;
				temp=temp/10;
				if(rem==0) {
					System.out.printf("%d  ",n);
					break;
				}
			}
		}

	}

}
