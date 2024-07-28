package MachineTest;
import java.util.*;

class MergerTwoArray{		//class for merge arrayy
	int a[],b[];
	MergerTwoArray(int a[],int b[]){
	this.a=a;
	this.b=b;
	}
	
	void getMergeArray(){
	int m[]=new int[(a.length)+(b.length)];
		for(int i=0;i<a.length;i++){
		m[i]=a[i];
		}

		for(int i=0;i<b.length;i++){
		m[i+(a.length)]=b[i];
		}
	System.out.println("Merged Array is :");
		for(int i=0;i<m.length;i++){
		System.out.printf("%d\t",m[i]);
		}
	}
}

public class MergeTwoArrayAndReturn {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 3 elemets in array");
			int a[]=new int[3];
				for(int i=0;i<a.length;i++){
				a[i]=s.nextInt();
				}
			System.out.println("Enter 3 elements in array");
			int b[]=new int[3];
				for(int i=0;i<b.length;i++){
				b[i]=s.nextInt();
				}
			MergerTwoArray m1=new MergerTwoArray(a,b);
			m1.getMergeArray();
			s.close();
	}

}
