package ArrayPrograms;

public class RamdomWordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list1[]= {"Happy","Sad","Poor","Rich"};
		String list2[]= {"Men","Women","Boy","Girl"};
		String list3[]= {"Enjoying food","Playing games","Reading books","Going to home"};
		
		java.util.Random randomgenerator=new java.util.Random();
		
		int length1=list1.length;
		int length2=list2.length;
		int length3=list3.length;
		
		int rand1=randomgenerator.nextInt(length1);
		int rand2=randomgenerator.nextInt(length2);
		int rand3=randomgenerator.nextInt(length3);
		
		System.out.println("New created statement is : "+list1[rand1]+" "+list2[rand2]+" "+list3[rand3]);
	}

}
