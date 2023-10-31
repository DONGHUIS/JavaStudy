package test1026;

import java.util.Scanner;

/*
삼각형의 높이를 홀수로 입력하세요
5           i   j
*****        0   0,1,2,3,4   j : i ~ (h-i) ,i <= j : *   
 ***         1     1,2,3
  *          2       2
 ***         3     1,2,3       j : 0~i  , h-i-1 <= j : *  
*****        4   0,1,2,3,4                 
 */
public class Test6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int len = 0;
		while(true) {
			System.out.println("삼각형의 높이를 홀수를 입력하세요.");
			len = scan.nextInt();		
			if(len%2==0) {
				System.out.println("홀수만 가능합니다.");
			}else break;
		}
		//역이동변삼각형
		
	}
}
