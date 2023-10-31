package test1026;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3			i         j          *
*****       0		0~4		    i~(b-1)
 ***	    1 		1~3			
  *		    2       2~2
 
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("삼각형 높이를 구하세요.");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int b = h*2-1;
		int m = b/2;
		
		
		for(int i=0; i<h; i++) {
			for(int j=0;j<b;j++) {
				if(j<=m+i&& j>=m-i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
