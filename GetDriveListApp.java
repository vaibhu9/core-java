package ClassExamples;

import java.io.*;

public class GetDriveListApp {

	public static void main(String[] args) {
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++) {
			long totalSpace=f[i].getTotalSpace();
			long freeSpace=f[i].getFreeSpace();
			
			System.out.println(f[i]+"\t"+(totalSpace/1073741824)+"\tGB\t"+(freeSpace/1073741824)+"\tGB");
		}

	}

}
