package Assignment;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		 *  화면에서 두수를 입력받아서 더큰수를 출력하기 
		 */
		System.out.println("두수를 입력:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.printf("%d,%d 수중 더 큰수 : %d\n",num1,num2,(num1>num2?num1:num2));
		
	}
}
