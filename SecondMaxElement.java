package ArrayPrograms;

import java.util.Scanner;

public class SecondMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter element in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		int secMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secMax&&arr[i]<max) {
				secMax=arr[i];
			}
		}
		
		if(secMax==max) {
			System.out.println("All values are same");
		}else {
			System.out.println("In your array second max element is "+secMax);
		}

	}

}
