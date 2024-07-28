package ClassExamples;

import java.io.*;

public class CheckFolderPresentOnPathOrNotApp {

	public static void main(String[] args) {
		File f=new File("D:\\Demo Folder 123");
		if(f.isDirectory()) {
			System.out.println("Folder present on this path.....");
		}
		else {
			System.out.println("Folder not present on this path.....");
		}
		
		File f1=new File("D:\\Demo Folder 123\\demofile");
		if(f1.isFile()) {
			System.out.println("File present on this path.....");
		}
		else {
			System.out.println("File not present on this path.....");
		}

	}

}
