package test1024;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		/*
		 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
		 * [결과]
		 * 밑변의 길이
		 * 10
		 * 높이의 길이
		 * 20
		 * 
		 * 넓이=10*20 / 2
		 */
		
		System.out.println("밑변과 높이를 입력하시오.");
		Scanner scan = new Scanner(System.in);
		float bottom = scan.nextFloat();
		float height = scan.nextFloat();
		float hap ;
		
		hap = (bottom * height)/2;
		
		System.out.println("넓이="+hap);
		
		
	}
}
