package MachineTest;
import java.util.*;

public class ExceptionsPrograms {
	static int a[];
	public static void main(String[] args) {
		System.out.println("1. NullPointerException");
			try{
				a[0]=10;
			}
			catch(Exception ex){
				System.out.println("Exception is "+ex);
			}


		System.out.println("\n\n2.ArithmeticException");
			try{
				int a=5/0;
			}
			catch(Exception ex){
				System.out.println("Exception is "+ex);
			}


		System.out.println("\n\n3.using throws clause");
			class Division{
				void getDivision()throws Exception{
					System.out.println("Division is = "+(10/0));
				}
			}
				
			try{
				Division d=new Division();
				d.getDivision();
			}
			catch(Exception ex){
				System.out.println("Exception is "+ex);
			}


		System.out.println("\n\n4.ClassCastException");
			try{
				Object o=new Object();
				String s=(String)o;
			}
			catch(Exception ex){
				System.out.println("Exception is "+ex);
			}

		System.out.println("\n\n5.ClassNotFoundException");
			try{
				Class.forName("Employee123");
			}
			catch(Exception ex){
				System.out.println("Exception is "+ex);
			}
			
	}

}
