package ProgramOnInheritanceInJAVA;

import java.util.Scanner;

class Per{
	protected  String name;
	protected int id;
	protected String address;
	protected String year;
	protected int per;
	
	void calPer(int s[]) {
		int agg=0;
		for(int i=0;i<s.length;i++) {
			agg=agg+s[i];
		}
		per=agg/6;
	}
}

class CSE extends Per{
	CSE(String name,int id,String address,String year){
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	
	void showCSEPer() {
		System.out.println("Name\t\t:\t"+name);
		System.out.println("ID\t\t:\t"+id);
		System.out.println("Address\t\t:\t"+address);
		System.out.println("Year\t\t:\t"+year);
		System.out.println("Percentage\t:\t"+per+"\n\n\n");
	}
}

class ETC extends Per{
	ETC(String name,int id,String address,String year){
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	
	void showETCPer() {
		System.out.println("Name\t\t:\t"+name);
		System.out.println("ID\t\t:\t"+id);
		System.out.println("Address\t\t:\t"+address);
		System.out.println("Year\t\t:\t"+year);
		System.out.println("Percentage\t:\t"+per);
	}
}

public class ResultApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sub[]=new int[6];
		
		System.out.println("Enter marks of six subjects of CSE student :");
		for(int i=0;i<sub.length;i++) {
			sub[i]=sc.nextInt();
		}
		
		CSE c1=new CSE("Vaibhav",40,"Malshemba","Final");
		c1.calPer(sub);
		c1.showCSEPer();
		
		System.out.println("Enter marks of six subjects of ETC student :");
		for(int i=0;i<sub.length;i++) {
			sub[i]=sc.nextInt();
		}
		
		ETC e1=new ETC("Bhagwat",41,"Malshemba","Third");
		e1.calPer(sub);
		e1.showETCPer();
		
		
		sc.close();
	}

}
