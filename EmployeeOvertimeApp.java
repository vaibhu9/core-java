//Q 1. Write a JAVA Program to calculate overtime pay of 5 employees. The overtime pay rate is Rs.50/- (per Hour). Daily shift hour time is only 8 hours.
//
//Note- for a week only 40 hours of working are allowed.
//
//1. Create class Employee with data member ID, Name, totalworking, salary, overtime Set Information by using a constructor and create a displayInformation() function to display all information with salary.
//
//2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and void calculateOvertime() to calculate overtime.
//
//3. Create the main class name as EmployeeOvertimeApp.
//================================================================================================================================================
package MachineTest;

import java.util.*;

class Employee{
	int id,totalworking,salary,overtime;
	String name;
	
	Employee(int id,String name,int totalworking,int salary){
		this.id=id;
		this.name=name;
		this.totalworking=totalworking;
		this.salary=salary;
	}
	
	void displayInformation() {
		System.out.println("ID\t\t:\t"+id);
		System.out.println("Name\t\t:\t"+name);
		System.out.println("Total working\t:\t"+totalworking);
		System.out.println("Salary\t\t:\t"+salary);
		System.out.println("Overtime\t:\t"+overtime);
		System.out.println();
	}
}

class Overtime{
	Employee emp[];
	
	void setEmployee(Employee emp[]) {
		this.emp=emp;
	}
	
	void calculateOvertime(){
		for(int i=0;i<emp.length;i++) {
			emp[i].overtime=(emp[i].totalworking-40)*50;
		}
	}
}

public class EmployeeOvertimeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp[]= new Employee [5];
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter Name, totalworking, salary :");
			String name=sc.next();
			int totalworking=sc.nextInt();
			int salary=sc.nextInt();
			
			emp[i]=new Employee(i+1, name, totalworking, salary);
		}
		
		Overtime v=new Overtime();
		v.setEmployee(emp);
		v.calculateOvertime();
		
		for(int i=0;i<emp.length;i++) {
			emp[i].displayInformation();
		}
		
		sc.close();

	}
}
