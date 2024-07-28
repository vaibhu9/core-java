package ClassExamples;

abstract class Mobile{	//Abstract class
   abstract void specialFeature ();	//Abstract method
};

class Vivo extends Mobile{
    public void specialFeature(){	//Here we override abstract method
       System.out.println("Good Camera Quality");
    }
}

class Nokia extends Mobile{
     void specialFeature(){			//Here also we override abstract method
       System.out.println("Good battery backup");
    }
}

public class AbstractClassAbstractMethodExample {

	public static void main(String[] args) {
		Mobile m=new Vivo();	//Here we create reference of parent class and object of child class
		m.specialFeature();		//Here we call overridden method
		
		m=new Nokia();			//Here we again use parent reference but object of another child
		m.specialFeature();		//which class version is executed is depend on type of object called as dynamic polymorphism
		
		Vivo v=new Vivo();
		v.specialFeature();
		
		Nokia n=new Nokia();
		n.specialFeature();

	}

}
