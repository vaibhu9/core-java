package ClassExamples;

class Voter{		//POJO class
	private int id;
	private String name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
}
class VoteBank{
	Voter v[];
	int count=0;
	void acceptVoter(Voter ...v) {	//Accepting infinite object by using variable argument
		this.v=v;
	}
	void showVoter() {
		for(int i=0; i<v.length;i++) {
			 if(v[i].getAge()>18) {		//Logic to find 18+ voter
				 ++count;
			    System.out.println(v[i].getName()+"\t"+v[i].getId()+"\t"+v[i].getAge());
			 }
		}
	}
	void showFinalCount() {
		System.out.println("Valid count "+count);
		System.out.println("Invalid voter  "+(v.length-count));
		
	}
}

public class POJOWithVariableArguments {

	public static void main(String[] args) {
		Voter v1 = new Voter();
		  v1.setId(1);
		  v1.setName("ABC");
		  v1.setAge(20);
		  
		  Voter v2 = new Voter();
		  v2.setId(2);
		  v2.setName("MNO");
		  v2.setAge(10);
		  
		  Voter v3 = new Voter();
		  v3.setId(3);
		  v3.setName("PQR");
		  v3.setAge(25);
		  
		  VoteBank vb= new VoteBank();
		  vb.acceptVoter(v1,v2,v3);		//Passing infinite object with variable argument
		  vb.showVoter();
		  vb.showFinalCount();
		  
	}

}
