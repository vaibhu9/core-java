package MachineTest;
import java.util.*;
public class CheckAlphabetNumberSymbol {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	//creating object of scanner clas
		System.out.println("Enter a character or digit or symbol");
		String str=s.nextLine();
		char ch=str.charAt(0);
			if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){	//logic to identify alphabet
			System.out.println("It is a alphabet");
			}
			else if(ch>=48&&ch<=57){		//logic to indentify digit
			System.out.println("It is a digit");
			}
			else{
			System.out.println("It is a symbol");
			}
		s.close();
	}

}
