package ClassExamples;

interface Area{
	float PI=3.14f;	//public static final float PI
}
public class InterfaceVariablePublicStaticFinal {

	public static void main(String[] args) {
		System.out.println(Area.PI);	//we can use interface variable
										//using only interface name
	}

}
