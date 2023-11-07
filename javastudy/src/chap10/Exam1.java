package chap10;

import java.io.IOException;
import java.util.Scanner;

class FailException extends Exception {
	FailException(String msg) {
		super(msg);
	}
}
/*
 * 1,화면에서 1~10사이의 숫자를 입력받아서 숫자만큼 *출력하기
 	 1~10사이의 숫자가 아닌경우 예외를 강제 발생시키고 다시 숫자를 입력받기.
 */
public class Exam1 {
	public static void main(String[] args) throws FailException {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~10사이의 숫자를 입력하세요 :");
		while(true) {
		try {
			int num = scan.nextInt();
			System.out.println("num="+num);
			if(0<num && num<11) {
				for(int i=1; i<=num ; i++) {
					System.out.print("*");
				}
				break;
			} else{
				throw new FailException("1~10사이의 숫자만 가능합니다.");
				}
		}catch (FailException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}




