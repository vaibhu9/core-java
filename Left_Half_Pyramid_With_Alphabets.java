package PatternPrograms;

public class Left_Half_Pyramid_With_Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i++) {
			char ch='A';
			for(int j=1;j<=17;j++) {
				if(j<=i) {
					System.out.print(ch++);
				}
			}
			System.out.println();
		}

	}

}
