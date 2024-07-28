package PatternPrograms;

public class HollowFullPyramidWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			boolean flag=true;
			for(int j=1,num=1;j<=9;j++) {
				if(j==6-i&&i<5&&flag) {
					System.out.printf("%d",num);
				}else if(i<5&&j==4+i) {
					System.out.printf("%d",i);
				}else if(i==5&&j>=1&&flag) {
					System.out.printf("%d",num++);
					flag=false;
				}else {
					System.out.printf(" ");
					flag=true;
				}
			}
			System.out.println();
		}

	}

}
