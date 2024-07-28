package PatternPrograms;

public class Full_Pyramid_With_Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i++) {
			boolean b=true;
			char ch='A';
			for(int j=1;j<=17;j++) {
				if((j>=10-i)&&(j<=8+i)&&b) {
					System.out.print(ch++);
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
