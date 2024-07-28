package PatternPrograms;

public class BNTCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='A';
		int num=1;
		boolean flag=true;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				
				if(j>=i&&j<=10-i&&flag) {
					
					if(i%2==1) {
						System.out.printf("%c",ch++);
						flag=false;
					}else {
						System.out.printf("%d",num++);
						flag=false;
					}
					
				}else {
					System.out.printf(" ");
					flag=true;
				}
			}
			System.out.println();
		}

	}

}
