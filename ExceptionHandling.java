//Q2. Write a Program to Demonstrate Exception Handling By Using a Switch Case.
//
//Case 1. ClassNotFoundException.
//
//Case 2. ArrayIndexOutBoundException.
//
//Case 3. NumberFormateException.
//
//Case 4. InputMismatchException.
//
//Case 5.NullPointerException.
//
//Case 6. User-Defined Exception.

package MachineTest;

import java.util.*;

public class ExceptionHandling {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("\n1 : Class Not Found Exception");
			System.out.println("\n2 : Class Cast Exception");
			System.out.println("3 : Array Index Out Of Bound Exception");
			System.out.println("4 : String Index Out Of Bounds Exception");
			System.out.println("5 : Number Formate Exception");
			System.out.println("6 : Input Mismatch Exception");
			System.out.println("7 : Null Pointer Exception");
			System.out.println("8 : Use throws for Exception Handling");
			System.out.println("9 : User Defined Exception");
			System.out.println("10 : Exit");
			System.out.println("\nEnter your choice :");
			choice=sc.nextInt();
			
			switch(choice){
			
				case 1: 
					try {
						Class.forName("Employee");
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
					
					break;
						
				case 2: 
					try {
						Object o=new Object();
						String s=(String)o;
						System.out.println(s);
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
					
					break;
					
				case 3 : 
					try {
						int a[]=new int[2];
						a[2]=5;
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
				
					break;
				
				case 4 :
					try {
						String s1="Vaibhav";
						String subS1=s1.substring(2, 8);
						System.out.println("Substring is "+subS1);
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
					
					break;
				
				case 5 : 
					try {
						String s="12345 ";
						int a=Integer.parseInt(s);
						System.out.println("Value of a is "+a);
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
				
					break;
				
				case 6  : 
					Scanner s=new Scanner(System.in);
					try {
						System.out.println("Enter float value");
						int num=s.nextInt();
						System.out.println(num);
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
				
					break;
				
				case 7 : 
					try {
						int a[] = null;
						a[0]=100;
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
				
					break;
				
				case 8 : 
					class Division{
						public void getDivision() throws Exception {
							System.out.println("Division is = "+(9/0));
						}
					}
					
					try {
						Division d=new Division();
						d.getDivision();
					}
					catch(Exception ex) {
						System.out.println("Exception is "+ex);
					}
				
					break;
				
				case 9 : 
					class VoterException extends ArithmeticException{
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public String getVoterError(){
							return "Invalid voter because age is below 18";
						}
					}
					
					class VotingMachine{
						void verifyVoter() {
							int age=17;
							if(age<18) {
								VoterException ve=new VoterException();
								throw ve;
							}
							else {
								System.out.println("Valid voter");
							}
						}
					}
					
					try {
						VotingMachine vm=new VotingMachine();
						vm.verifyVoter();
					}
					catch(VoterException ve){
						System.out.println(ve.getVoterError());
					}
				
					break;
					
				default : System.out.println("Please enter correct choice.....");
			}
			
		}while(choice!=10);
		
		sc.close();

	}
}
