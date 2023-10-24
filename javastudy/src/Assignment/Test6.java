package Assignment;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
	//  반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
	// pi* r의 제곱  -> 넓이
	// 2*pi*r -> 둘레
		System.out.println("반지름 입력");
		Scanner scan = new Scanner(System.in);
		int ban = scan.nextInt();
		double pi = 3.141592;
		double round;
		double extent;
		
		round = 2 * pi * ban;
		extent = (Math.pow(ban, 2))*pi;
		
		System.out.printf("원의둘레="+"%.2f",round);
		System.out.println();
		System.out.printf("원의넓이="+"%.2f",extent);
		
		
	}
}
