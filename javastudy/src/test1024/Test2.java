package test1024;

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
		 *  
		 * 10부터 99사이의 두자리 자연수를 입력하세요
		 * 20
		 * 0   :  20 - 20
		 */
		
		System.out.println("10부터 99사이의 두자리 자연수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); 
		//num%10 ==0:입력된수가 10의 배수인 경우
		int num10 = (num%10==0)?num:((num/10+1)*10);
		
		System.out.println((num10-num)+":"+num10+"-"+num);
		
	}
}