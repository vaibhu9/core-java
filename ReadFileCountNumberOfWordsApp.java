package Practical;

import java.io.*;

public class ReadFileCountNumberOfWordsApp {

	public static void main(String[] args)throws IOException, InterruptedException {
		File f=new File("D:\\Demo Folder 123\\Demo Text File.txt");
		FileReader fr=new FileReader(f);
		int data;
		int count=0;
		boolean b=false;
		System.out.println("Data present in file are :");
		while((data=fr.read())!=-1) {
			b=true;
			if(data==32) {
				count++;
			}
			System.out.print((char)data);
			Thread.sleep(50);
		}
		if(b) {
			System.out.println("Number of words in file are : "+(count+1));
		}
		else {
			System.out.println("File is empty.");
		}
		
		fr.close();

	}

}
