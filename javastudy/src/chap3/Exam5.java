package chap3;

import java.util.Scanner;

/*
 * 사과의 갯수를 입력받아서 필요한 바구니수 계싼하기
 * 바구니당 10개의 사과를 저장할수 있다고 가정함.
 * 
 * [결과]
 * 사과의 갯수를 입력하세요 
 * 21 
 * 필요한 바구니 : 3바구니
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("현재 보유중인 사과갯수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int apple = scan.nextInt();
		System.out.println("필요한 바구니 갯수:"+ ((apple%10 !=0)? apple/10+1:apple/10));
	}
}
