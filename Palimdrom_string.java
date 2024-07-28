package may032024;

import java.util.Scanner;

public class Palimdrom_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=s.nextLine();
		char strarray[]=str.toCharArray();
		boolean b=true;
		for(int i=0;i<strarray.length/2;i++) {
			if(strarray[i]!=(strarray[strarray.length-1-i])) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println("String is palimdrom");
		}
		else {
			System.out.println("not palimdrom");
		}

	}

}
