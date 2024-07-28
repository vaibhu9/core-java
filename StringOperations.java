package Practical;
import java.util.*;
public class StringOperations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("\nEnter a string to perform some operations on it :");
		String str=s.nextLine();
		
		System.out.println("Input String is\t\t:\t"+str);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String nstr1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			nstr1=ch+nstr1;
		}
		System.out.println("\n\nFirst output is\t\t:\t"+nstr1);
		//////////////////////////////////////////////////////////////////////
		StringBuilder rv=new StringBuilder(str);
		rv.reverse();
		System.out.println("By function is\t\t:\t"+rv);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String space=" ";
		int start=0;
		int count=0;
		String nstr2="";
		for(int i=start;i<str.length();i++) {
			if(str.charAt(i)==space.charAt(0)||i==str.length()-1) {
				start=i;
				if(i==str.length()-1) {
					int j=start;
					nstr2=nstr2+" ";
					while(count!=0-1) {
						nstr2=nstr2+str.charAt(j);
						j--;
						count--;
					}
				}
				else if(i==1){
					int j=start-1;
							while(count!=0) {
						nstr2=nstr2+str.charAt(j);
						j--;
						count--;
					}
					
					count=0;
				}else{
					int j=start;
					while(count!=0-1) {
						nstr2=nstr2+str.charAt(j);
						j--;
						count--;
					}
					count=0;
				}
			}
			else {
				count++;
			}
		}
		System.out.println("\nSecond output is\t:\t"+nstr2);
		//////////////////////////////////////////////////////////////
		String []sp1=str.split(" ");
		
		String wsr="";
		System.out.printf("By fuction is\t\t:\t");
		for(int i=0;i<(sp1.length);i++) {
			String wsrt="";
			for(int j=0;j<sp1[i].length();j++) {
				wsrt=sp1[i].charAt(j)+wsrt;
			}
			wsr=wsr+wsrt+" ";
		}
		System.out.println(wsr);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		count=0;
		String nstr3="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==space.charAt(0)||i==0) {
				if(i>0) {
					start=i+1;
					int end=i+count;
					while(start<=end) {
						nstr3=nstr3+str.charAt(start);
						start++;
					}
					nstr3=nstr3+" ";
					count=0;
				}
				else if(i==0) {
					start=i;
					int end=i+count;
					while(start<=end) {
						nstr3=nstr3+str.charAt(start);
						start++;
					}
					count=0;
				}
				else {
					start=i;
					int end=i+count;
					while(start<=end) {
						nstr3=nstr3+str.charAt(start);
						start++;
					}
					count=0;
				}
			}
			else {
				count++;
			}
		}
		System.out.println("\nThird output is\t\t:\t"+nstr3);

		///////////////////////////////////////////////////////////////////////
		String []sp=str.split(" ");
		System.out.printf("By fuction is\t\t:\t");
		for(int i=(sp.length)-1;i>=0;i--) {
			System.out.printf("%s ",sp[i]);
		}
		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String nstr4="";
		count=0;
		for(int i=0;i<nstr3.length();i++) {
			if(i==1||i==3) {
				char ch=nstr3.charAt(i);
				ch=(char)((int)ch-32);
				nstr4=nstr4+ch;
			}
			else {
				nstr4=nstr4+nstr3.charAt(i);
			}
		}
		System.out.println("\nFourth output is\t:\t"+nstr4);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String nstr5="";
		for(int i=0;i<str.length();i++) {
			if(i>=7&&i<=9) {
				continue;
			}
			else {
				nstr5=nstr5+str.charAt(i);
			}
		}
		System.out.println("\nFifth output is\t\t:\t"+nstr5);
		/////////////////////////////////////////////////////////////////
		String tm=str;
		StringBuffer tm1=new StringBuffer(tm);
		tm1.delete(7,10);
		System.out.println("By fuction is\t\t:\t"+tm1);
		
		s.close();

	}

}
