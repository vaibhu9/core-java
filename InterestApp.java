package ProgramOnInheritanceInJAVA;

import java.util.Scanner;

class Interest{
	int pamt,irate,dur;
	
	void setPRD(int pamt,int irate,int dur) {
		this.pamt=pamt;
		this.irate=irate;
		this.dur=dur;
	}
}

class CalculateInterest extends Interest{
	void calInterest() {
		System.out.println("\n\nInterest is\t:\t"+pamt*irate*dur/100+"\n\n");
	}
}

public class InterestApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Principal amount, interest rate and duration :");
		int pamt=sc.nextInt();
		int irate=sc.nextInt();
		int dur=sc.nextInt();
		
		CalculateInterest c1=new CalculateInterest();
		c1.setPRD(pamt, irate, dur);
		c1.calInterest();
		
		sc.close();
	}

}
