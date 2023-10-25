package Assignment;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		/*
		 * 화면에서 점수를 입력받아서 
		 * 90점 이상이면 A학점,80점 이상이면 B학점
		 * 70점 이상이면 C학점,60점 이상이면 D학점
		 * 60 점 미만이면 F학점을 출력하기
		 */
		System.out.println("본인점수입력:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score + "점은 "+((score>=90)?"A학점입니다.":(score>=80)?"B학점입니다.":(score>=70)?"C학점입니다.":(score>=60)?"D학점입니다.":"F학점입니다"));
		
	}
}
