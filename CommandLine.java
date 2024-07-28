package MachineTest;

public class CommandLine {

	public static void main(String[] args) {	//command line argument
			int a=Integer.parseInt(args[0]);		//Input from command line and convert string to int type
			int b=Integer.parseInt(args[1]);
			System.out.println("Value Before Swap A = "+a+"\tB = "+b);
			int temp=a;							//swapping logics
			a=b;
			b=temp;
			System.out.println("Value After Swap A = "+a+"\tB = "+b);

	}

}
