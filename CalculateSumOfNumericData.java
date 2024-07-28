package Practical;

import java.io.*;

public class CalculateSumOfNumericData {

	public static void main(String[] args)throws IOException, InterruptedException {
		File f=new File("D:\\Demo Folder 123\\Demo Text File.txt");
		FileReader fr=new FileReader(f);
		int sum=0;
		int data;
		while((data=fr.read())!=-1) {
			if(data>=48&&data<=57) {
				sum=sum+data-48;
			}
			System.out.print((char)data);
		}
		System.out.println("Sum of total numeric character is = "+sum);
		fr.close();

	}

}
