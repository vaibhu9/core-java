package Practical;

import java.io.*;

public class ReadFileCountCharacterWordsVowelsConsonantSymbolDigitsApp {

	public static void main(String[] args)throws IOException, InterruptedException {
		File f=new File("D:\\Demo Folder 123\\Demo Text File.txt");
		FileReader fr=new FileReader(f);
		int characters=0;
		int words=0;
		int vowels=0;
		int consonants=0;
		int symbols=0;
		int digits=0;
		boolean b=false;
		int data;
		while((data=fr.read())!=-1) {
			b=true;
			characters++;
			if(data==32) {
				words++;
			}
			else if(data==65||data==97||data==69||data==101||data==73||data==105||data==79||data==111||data==85||data==117) {
				vowels++;
			}
			else if((data>=65&&data<=90)||(data>=97&&data<=122)) {
				if(data!=65||data!=97||data!=69||data!=101||data!=73||data!=105||data!=79||data!=111||data!=85||data!=117) {
					consonants++;
				}
			}
			else if(data>=48&&data<=57) {
				digits++;
			}
			else {
				symbols++;
			}
			System.out.print((char)data);
		}
		
		if(b) {
			System.out.println("\n\nTotal number of characters is : "+characters);
			System.out.println("Toatal number of words is : "+(words+1));
			System.out.println("Total number of vowels is : "+vowels);
			System.out.println("Total number of consonants is : "+consonants);
			System.out.println("Total number of special symbols is : "+symbols);
			System.out.println("Total number of digits is : "+digits);
		}
		else {
			System.out.println("File is empty.");
		}
		fr.close();

	}

}
