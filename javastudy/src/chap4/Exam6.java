package chap4;

import java.util.Scanner;
/**
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3 
 * 
 * ============================
 *
 * 
 * 
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이 입력:");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		
		for(int i =1; i<=h; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2번째 삼각형");
		
		for(int i=1; i<=h ; i++) {
			for(int j=h; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=h; i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("/////////");
		
		for(int i=h; i>=1; i--) {
			for(int j=1; j<=h; j++) {
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
				System.out.println();
			}
		
		System.out.println("/////////");
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h;j++) {
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		}
}
