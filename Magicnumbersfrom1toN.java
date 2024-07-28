package vaibhu.s9;
import java.util.*;
public class Magicnumbersfrom1toN {
	public static void main(String x[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the start and end limit to print all Magic numbers : ");
	int start=s.nextInt();
	int end=s.nextInt();
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
