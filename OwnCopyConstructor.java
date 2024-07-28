package vaibhu.s9;

class A{
	int id;
	String name;
	
	A(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	A(A a1){		//	Own Copy constructor in java
		this.id=a1.id;
		this.name=a1.name;
	}
}
public class OwnCopyConstructor {

	public static void main(String[] args) {
		
		A a1=new A(5,"Vaibhav");
		A a2=new A(a1);	//copy content of a1 object into a2 with the help of copy constructor

		//		A a2=a1;
		
		System.out.println("With first object :");
		System.out.println("Id is : "+a1.id);
		System.out.println("Name is : "+a1.name);
		
		System.out.println("\nWith second object :");
		System.out.println("Id is : "+a2.id);
		System.out.println("Name is : "+a2.name);

	}

}
