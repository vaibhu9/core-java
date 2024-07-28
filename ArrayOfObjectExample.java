package ClassExamples;

import java.util.*;

class EmployeeDetail{		//POJO class
	private int id;
	private String name;
	private int sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
public class ArrayOfObjectExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		EmployeeDetail emp[]=new EmployeeDetail[3];		//Declaration of array of object
		
		for(int i=0;i<emp.length;i++) {
			
			emp[i]=new EmployeeDetail();		//Creating new object of array
			
			System.out.println("Enter name id and salary of employee");
			String name=s.next();
			int id=s.nextInt();
			int sal=s.nextInt();
			
			emp[i].setId(id);			//Setting data to each object means object of array
			emp[i].setName(name);
			emp[i].setSal(sal);
			
		}
		System.out.println("Display all employees");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());		//Getting data from each object mean from object of array
		}
		
		s.close();

	}

}
