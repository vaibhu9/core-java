import java.util.*;
public class DigitOccurrence{
	public static void main(String x[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of array :");
	int size=s.nextInt();
	int a[]=new int[size];
	System.out.println("Enter elements in array :");
		for(int i=0;i<a.length;i++){
		a[i]=s.nextInt();
		}
	System.out.println("Occurence of digits are :");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.println(a[i]);
		}
		int count=1;
		for(int i=0;i<a.length;i++){
			if(i<(a.length)-1){
				if(a[i]==a[i+1]){
				count++;
				}
				else{
					System.out.println(a[i]+"=====>"+count);
					count=1;
				}
			}
			if(i==(a.length)-1){
				System.out.println(a[i]+"=====>"+count);
			}
		}
	}
}