package MachineTest;
import java.util.*;	//importing packege for scanner class
public class InputUsingScanner {
		public static void main(String x[]){
		Scanner s=new Scanner(System.in);	//creating object of scanner class
		System.out.println("Enter an number");
		int num=s.nextInt();		//input using scanner class
		int rev=0;
		System.out.println("Before reverse number is : "+num);
			while(num!=0){		//logic for reverse number
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			}
		System.out.println("After reversing number is : "+rev);
		s.close();
		}
}
