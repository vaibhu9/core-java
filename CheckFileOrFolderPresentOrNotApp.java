package ClassExamples;

import java.io.*;

public class CheckFileOrFolderPresentOrNotApp {

	public static void main(String[] args) {
		File f=new File("D:\\Demo Folder 123");
		if(f.exists()) {
			System.out.println("Folder is present");
		}
		else {
			System.out.println("Folder is not present");
			boolean b=f.mkdir();
			if(b) {
				System.out.println("Folder created successfully.....");
			}
			else {
				System.out.println("Fetching a problem to create folder....");
			}
		}

	}

}
