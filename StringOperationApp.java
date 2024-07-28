package ProgramOnInheritanceInJAVA;
import java.util.Scanner;

abstract class StringOperation{
	abstract void performOperation(String x);
}

class ConvertToUpper extends StringOperation{
	public void performOperation(String x) {
		System.out.println("\n\nGiven string is\t\t\t:\t"+x);
		String n="";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			if(ch>90) {
				ch=(char)((int)ch-32);
			}
			n=n+ch;
		}
		System.out.println("After converting to upper case\t:\t"+n);
		
	}
}

class MaxRepetativeChar extends StringOperation{
	public void performOperation(String x) {
		char repchar=x.charAt(0);
		int count=0;
		for(int i=0;i<x.length();i++) {
			int curcount=1;
			for(int j=0;j<x.length();j++) {
				if(x.charAt(i)==x.charAt(j)) {
					curcount++;
				}
			}
			if(curcount>count) {
				count=curcount;
				repchar=x.charAt(i);
			}
		}
		System.out.println("\nMaximum repetative character is : "+repchar);
	}
}

class WordReverse extends StringOperation{
	public void performOperation(String x){
		System.out.println("\n\nGiven string is\t\t\t:\t"+x);
		String n="";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			n=ch+n;
		}
		System.out.println("After wordreverse string is\t\t:\t"+n);
		
	}
}

public class StringOperationApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=s.nextLine();
		
		ConvertToUpper u=new ConvertToUpper();
		u.performOperation(str);
		
		MaxRepetativeChar m=new MaxRepetativeChar();
		m.performOperation(str);
		
		WordReverse w=new WordReverse();
		w.performOperation(str);
		
		s.close();

	}

}
