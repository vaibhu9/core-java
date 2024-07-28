package ClassExamples;
import java.util.*;
public class JaggedArrayExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a[][]=new int[3][];		//Declaration of jagged array
		a[0]=new int[3];			//Declaration of columns in array
		a[1]=new int[4];
		a[2]=new int[2];
		
		System.out.println("Enter values in matriz");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {	//Here we need to write length of each row
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Display matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}

	}

}
