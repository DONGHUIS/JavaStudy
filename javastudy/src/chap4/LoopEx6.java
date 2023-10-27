package chap4;

import java.util.Scanner;

/*
 * 1~100사이의 임의의 수를 컴퓨터가 저장함.
 * 사용자는 숫자를 입력받아서 저장된 숫자를 맞추기 
 * 시스템  : 37가정
 * [결과]
 * 1~100사이의 숫자입력 : 50 
 * 작은 수입니다.
 * 1~100사이의 숫자입력 : 25 
   큰수입니다.
   1~100사이의 숫자입력 : 37 
   정답입니다.
   프로그램 종료.
 */
public class LoopEx6 {
	public static void main(String[] args) {
		int sysnum = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1~100사이의 숫자입력 : ");
			int data = scan.nextInt();
			if(sysnum > data) {
				System.out.println("큰수입니다.");
			}else if(sysnum<data){
				System.out.println("작은수입니다.");
			}else {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println("프로그램이 종료");
	}
}
