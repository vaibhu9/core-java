package may032024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Occuranceinstring {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=s.nextLine();
		
		LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			m.put(str.charAt(i), m.getOrDefault(str.charAt(i), 0)+1);
		}
		System.out.println("Occerence are:");
		for(Map.Entry<Character, Integer> entry:m.entrySet()) {
			System.out.println(entry.getKey()+"=====>"+entry.getValue());
		}
	}

}
