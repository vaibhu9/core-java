package MachineTest;

import java.util.*;

class Steel{
	int id;
	int hardness;
	float carbon_content;
	int tensilestrength;
	
	Steel(int id,int hardness,float carbon_content,int tensilestrength){
		this.id=id;
		this.hardness=hardness;
		this.carbon_content=carbon_content;
		this.tensilestrength=tensilestrength;
	}
	
	void display() {
		
	}
}

class Quality extends Steel{
	int Grade;
	Quality(int id,int hardness,float carbon_content,int tensilestrength){
		super(id,hardness,carbon_content,tensilestrength);
	}
	
	void checkGrade() {
		if(hardness>50&&carbon_content<0.7&&tensilestrength>5600) {
			Grade=10;
		}
		else if(hardness>50&&carbon_content<0.7) {
			Grade=9;
		}
		else if(carbon_content<0.7&&tensilestrength>5600) {
			Grade=8;
		}
		else if(hardness>50&&tensilestrength>5600) {
			Grade=7;
		}
		else if(hardness>50) {
			Grade=6;
		}
		else {
			Grade=5;
		}
	}
	
	void display() {
		System.out.println("\n\nId\t\t:\t"+id);
		System.out.println("Hardness\t:\t"+hardness);
		System.out.println("Carbon-Content\t:\t"+carbon_content);
		System.out.println("Tensile-Strength:\t"+tensilestrength);
		System.out.println("Grade is\t:\t"+Grade);
	}
}
public class SteelGradeApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("\nEnter id, hardness, carbon_content, tensilestrength");
			int id=s.nextInt();
			int hardness=s.nextInt();
			float carbon_content=s.nextFloat();
			int tensilestrength=s.nextInt();
			
			Quality q=new Quality(id,hardness,carbon_content,tensilestrength);
			q.checkGrade();
			q.display();
			
			System.out.println("\n\nTo continue Enter any number key except 9");
			choice=s.nextInt();
		}while(choice!=9);
		
		s.close();

	}

}
