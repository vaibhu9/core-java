package ProgramOnInheritanceInJAVA;
import java.util.Scanner;

interface ArrayOperation{
	void performOperation(int x[]);
}

class Sorting implements ArrayOperation{
	public void performOperation(int x[]) {
		int a[];
		a=x;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting array :");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d\t",a[i]);
		}
	}
}

class Insertion implements ArrayOperation{
	int no,ind;
	void setValue(int value,int index) {
		no=value;
		ind=index;
	}
	
	public void performOperation(int x[]) {
		int a[]=new int[x.length+1];
		for(int i=0;i<a.length;i++) {
			if(i<ind) {
				a[i]=x[i];
			}
			else if(i==ind) {
				a[i]=no;
			}
			else {
				a[i]=x[i-1];
			}
		}
		
		System.out.println("After inserting value :");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d\t",a[i]);
		}
	}
}

class Deletion implements ArrayOperation{
	int ind;
	void setIndex(int index) {
		ind=index;
	}
	
	public void performOperation(int x[]) {
		int a[]=new int[x.length-1];
		for(int i=0;i<a.length;i++) {
			if(i<ind) {
				a[i]=x[i];
			}
			else {
				a[i]=x[i+1];
			}
		}
		
		System.out.println("After deletion :");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d\t",a[i]);
		}
	}
}

class Reverse implements ArrayOperation{
	public void performOperation(int x[]) {
		int a[];
		a=x;
		for(int i=0;i<=a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
		System.out.println("After reversing array :");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d\t",a[i]);
		}
	}
}


public class ArrayIndexOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[6];
		System.out.println("Enter values in array :");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int choice;
		do
		{
			System.out.println("\n\n1.Sort");
			System.out.println("2.Insertion");
			System.out.println("3.Deletion");
			System.out.println("4.Reverse");
			System.out.println("9.Exit");
			System.out.println("\n\nEnter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					Sorting s=new Sorting();
					s.performOperation(a);
					break;
					
				case 2:
					Insertion i1=new Insertion();
					System.out.println("Enter index and value :");
					int index=sc.nextInt();
					int value=sc.nextInt();
					i1.setValue(value, index);
					i1.performOperation(a);
					break;
					
				case 3:
					Deletion d=new Deletion();
					System.out.println("Enter index :");
					index=sc.nextInt();
					d.setIndex(index);
					d.performOperation(a);
					break;
					
				case 4:
					Reverse r=new Reverse();
					r.performOperation(a);
					break;
					
				case 9:
					break;
					
				default:
					System.out.println("Sorry !!! You have entered wrong choice...");
			}
		}while(choice!=9);
		
		
		sc.close();
	}

}
