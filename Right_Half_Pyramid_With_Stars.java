package PatternPrograms;

public class Right_Half_Pyramid_With_Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j>=7-i) {
					System.out.print("*");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}

	}

}
