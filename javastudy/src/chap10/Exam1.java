package chap10;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class FailException extends Exception {
	FailException(String msg) {
		super(msg);
	}
}
/*
 * 1,화면에서 1~10사이의 숫자를 입력받아서 숫자만큼 *출력하기, 1~10사이의 숫자가 아닌경우 예외를 강제 발생시키고 다시 숫자를 입력받기.
   2, 1~10사이의 숫자를 입력받아서 입력값이 문자인경우 InputMismatchException
 */
public class Exam1 {
	public static void main(String[] args) throws FailException {
		Scanner scan = new Scanner(System.in);
		while(true) {
		try {
			System.out.print("1~10사이의 숫자를 입력하세요 :");
			int num = scan.nextInt();  //정수아닌 값을 입력하면 InputMismatchException 예외발생.
			System.out.print(num+":");
			if(0<num && num<11) {
				for(int i=1; i<=num ; i++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			} else{
				throw new Exception("1~10사이의 숫자만 가능합니다.");
			}
		}catch (InputMismatchException e) {
			scan.next();
			continue;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			continue;
			}
		}
	}
}