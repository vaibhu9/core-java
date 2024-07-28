package ClassExamples;

import java.io.*;

public class CreateNewFileApp {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Demo Folder 123\\newfile.txt");
		
		boolean b=f.createNewFile();
		if(b) {
			System.out.println("File is created.....");
		}
		else {
			System.out.println("File is not created.....");
		}

	}

}
