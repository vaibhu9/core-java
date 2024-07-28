package PatternPrograms;

public class Full_Pyramid_With_Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=6;i++) {
			boolean b=true;
			for(int j=1;j<=11;j++) {
				if((j>=7-i)&&(j<=5+i)&&b) {
					System.out.printf("*");
					b=false;
				}
				else {
					System.out.printf(" ");
					b=true;
				}
			}
			System.out.println();
		}

	}

}
