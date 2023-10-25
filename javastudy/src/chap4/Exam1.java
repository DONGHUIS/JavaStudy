package chap4;

import java.util.Scanner;

/*
 * 정수를 입력받아서 
 * 1, 양수 /음수 / 0 출력
 * 2, 짝수 / 홀수 출력
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("정수를 입력.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		
		if(num%2 ==0) {
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
	}
}
