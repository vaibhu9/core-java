import java.io.Console;
import java.io.InputStreamReader;

public class InputFromKeyboardUsingConsoleClass {

	public static void main(String[] args) {
		Console c=System.console();
		if(c!=null) {
			String name=c.readLine("Enter your name :");
			c.printf("Hello, %s!\n",name);
		}
		else {
			System.out.println("Console is not available.");
		}

	}

}
