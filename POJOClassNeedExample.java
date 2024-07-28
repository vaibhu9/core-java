package ClassExamples;

class EmployeeData{		//POJO class
	private int id;
	private String name;
	private int sal;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setSal(int sal) {
		this.sal=sal;
	}
	public int getSal() {
		return sal;
	}
}

class Company{
	private EmployeeData employee;
	void setEmployeeDetail(EmployeeData employee) {		//Passing all data using single object or single parameter
		this.employee=employee;
	}
	
	void shows() {
		System.out.println(employee.getId()+"\t"+employee.getName()+"\t\t"+employee.getSal());
	}
}
public class POJOClassNeedExample {

	public static void main(String[] args) {
		EmployeeData e=new EmployeeData();
		
		e.setId(1);
		e.setName("Vaibhav");
		e.setSal(1000000);
		
		Company c=new Company();
		
		c.setEmployeeDetail(e);
		c.shows();

	}

}
