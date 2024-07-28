package ClassExamples;

import java.io.*;

public class FetchingAllFilesAndFolderApp {

	public static void main(String[] args) {
		File f=new File("D:");
		
		File f1[]=f.listFiles();
		System.out.println("Display all files and folders from path :");
		for(int i=0;i<f1.length;i++) {
			System.out.println(f1[i]);
		}

	}

}
