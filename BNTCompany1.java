package PatternPrograms;

public class BNTCompany1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			int num=9;
			boolean flag=true;
			for(int j=1;j<=9;j++) {
				if(j>=6-i&&j<=4+i&&flag) {
					System.out.printf("%d",num);
					flag=false;
				}else {
					System.out.printf(" ");
					flag=true;
					num-=2;
				}
			}
			System.out.println();
		}

	}

}
