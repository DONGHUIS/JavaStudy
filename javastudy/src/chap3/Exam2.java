package chap3;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/*
 * 키보드에서 초를 입력받아 몇시간 몇분 몇초인지 출력하기
 * [결과]
 * 초를 입력하세요.
 * 1시간1분2초
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("초를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		int si = second/3600;
		int bun = (second%3600)/60;
		int cho = second % 60;
		System.out.printf("%d시간%d분%d초\n",si,bun,cho);
	}
}
