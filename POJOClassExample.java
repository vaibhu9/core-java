package ClassExamples;

class Employee1{		//POJO class in which we use setter and getter method
	private int id;
	private String name;
	
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
}
public class POJOClassExample {

	public static void main(String[] args) {
		Employee1 emp=new Employee1();	//Creating object of POJO class
		emp.setId(1);					//Passing parameter or setting data to POJO class
		emp.setName("Vaibhav");
		
		System.out.println("ID\t:\t"+emp.getId());	//Retrieving data from POJO class
		System.out.println("Name\t:\t"+emp.getName());

	}

}
