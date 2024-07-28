package ArrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxRepeatativeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int arr[]=new int[6];
		System.out.println("Enter values in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int maxRepetive=0;
		int value=0;
		for(Map.Entry<Integer, Integer> e:map.entrySet()) {
			if(e.getValue()>value) {
				value=e.getValue();
				maxRepetive=e.getKey();
			}
		}
		
		if(value>1) {
			System.out.println("In your array max repetive element is "+maxRepetive);
		}else {
			System.out.println("There is no repetive element in your array.");
		}

	}

}
