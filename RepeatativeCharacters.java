package ArrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatativeCharacters {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter String value:");
		String str=s.nextLine();
		
		char ch[]=str.toCharArray();
		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char c:ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> e:map.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
		
	}

}
