package PatternPrograms;

public class Left_Half_Pyramid_With_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j<=i) {
					System.out.print(num++);
				}
			}
			System.out.println();
		}

	}

}
