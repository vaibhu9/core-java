package MachineTest;
import java.util.*;

class Cube{		//class for find cube
 	int x;
	void setValue(int x){
	this.x=x;
	}
	
	int getCube(){		//logic for calculate cube and return it
	return x*x*x;
	}
}
public class FindCubeByCreatingClassCube {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number");
			int a=s.nextInt();
			Cube c=new Cube();		//creating object of cube class
			c.setValue(a);			//call to set value method
			int result=c.getCube();		//call to get cube method
			System.out.println("Cube is = "+result);
			s.close();
	}

}
