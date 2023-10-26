package chap4;
/*
 * 가로구구단 만들기
	2*1=2	3*1=3	4*1=4	....
	2*2=4	3*2=6	4*2=8		
	2*3=6	3*3=9	4*3=12		
     ....
 */
public class Exam8 {
	public static void main(String[] args) {
	 for(int k=2; k<=9;k++) {
		 System.out.printf("%d단\t\t",k);  // \t  : 탭역할 해줌.
	 }
	 System.out.println();
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i+" X "+j+" = "+(i*j)+"\t"); 
			}
			System.out.println();
		}
		
	}
}
