package chap5;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력하시오.
 * 5 
 * 15 14 13 12 11 
 *    10 9  8  7 
 *    .....
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하시오.");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int sum = 0; //숫자 시작부분 저장해줄 변수
		
		//숫자를 합해주는 코드
		for(int i=1;i<=h;i++) {
			sum += i;
		}
		
		//숫자를 찍는 코드
		for(int i=1; i<=h ; i++) {
			for(int j=1; j<=h; j++) {
				//j가 i보다 클떄 숫자를 찍고
				if(i<=j) { //%3c : char 문자 3자리로 출
					System.out.print(sum-- + "\t");
				//j가 i보다 작을떄 공백을 찎는다.
				}else {
					System.out.print(" "+ "\t");
				}
			}
			System.out.println();
		}
	}
}
