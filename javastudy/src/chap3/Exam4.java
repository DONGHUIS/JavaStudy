package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아 양수인 경우 양수를 출력 
 * 음수인 경우 음수를 출력하고 
 * 양수도 음수도 아닌 0인경우 0을 출력
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("숫자를 하나 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(num +((num>0)?"양수입니다.":(num<0)?"음수입니다.":"0입니다."));
		//입력된 숫자의 절대값 출력하기 
		//-10 : 10 
		// 10 : 10 
		System.out.println(num+"의 절댓값"+((num>=0)? num : -num));
	}
}
