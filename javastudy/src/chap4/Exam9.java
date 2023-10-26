package chap4;

import java.util.Scanner;
/*
 * 삼각형 높이 입력
 * 
 * 5
 * 
 * 15 14  13  12  11 
 *    10  9    8   7 
 *        6    5   4
 *             3   2
 *                 1
 */


public class Exam9 {
	public static void main(String[] args) {
		System.out.println("삼각형 높이  입력");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int sum = 0; 
		
		//숫자 더하는 코드
		for(int i=1 ; i<=h; i++) {
			sum+= i;
		}
		//번호 찍는 코드
   		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h;j++) {
				if(i<=j) {
					System.out.print(sum--+"\t");
				}else {
					System.out.print(" "+"\t");
				}
			}
			System.out.println();
		}
   		
   		
   		
	}
}
