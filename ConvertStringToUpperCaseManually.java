package MachineTest;
import java.util.*;

public class ConvertStringToUpperCaseManually {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=s.nextLine();
		String strn="";
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
					if(ch>=97&&ch<=122){
						ch=(char)((int)ch-32);
					}
				strn=strn+ch;
			}
		System.out.println("After conveting in uppercase:");
		System.out.println(strn);

	}

}
