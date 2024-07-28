package ClassExamples;

import java.io.*;

public class CreatFolderApp {

	public static void main(String[] args) {
		File f=new File("D:\\Demo Folder");
		boolean b=f.mkdir();
		if(b) {
			System.out.println("Folder created successfully.....");
		}
		else {
			System.out.println("Fetching a problem to creat folder.....");
		}

	}

}
