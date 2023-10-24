package Assignment;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수 보다 크거나 
		 * 같은 10의 배수를 구하기
		 * 10의 배수에서 입력된 수를 뺀값을 출력하기
		 * [결과]
		 * 10부터 99사이의 두자리 자연수를 입력하세요
		 * 24
		 *  6  :  30 - 24
		 *  
		 *  ((apple%10 !=0)? apple/10+1:apple/10);
		 *  
		 * 10부터 99사이의 두자리 자연수를 입력하세요
		 * 20
		 * 0   :  20 - 20
		 */
		
		System.out.println("10부터 99사이의 두자리 자연수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //23
		int num2 = scan.nextInt();
		
		System.out.println((num1/10==0)? ((num1/10)*10)-num1:(((num1/1)*10)%10)-num1);
		
		num1 = (num1/10)*10;
		System.out.println(num1);
	}
}
