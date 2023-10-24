package chap3;

import java.util.Scanner;

/*
 * 화면에서 3자리 자연수를 입력받아 100짜리 미만을 버리고 출력하기 
 * [결과]
 * 세자리 자연수를 입력하세요.
 * 321
 * 300
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("세자리 숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = num - (num%100);
		System.out.println(result);
		System.out.println(num/100 * 100);
		scan.close();
	}
}
