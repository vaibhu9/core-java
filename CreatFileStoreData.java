package Practical;

import java.io.*;
import java.util.*;

public class CreatFileStoreData {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:\\Demo Folder 123\\Demo Text File.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string data");
		String data=s.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		System.out.println("Data saved successfuly.....");
		
		s.close();

	}

}
