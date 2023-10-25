package Assignment2;

import java.util.Random;
import java.util.Scanner;

/*
시스템과 가위(1), 바위(2), 보(3)를 하기
 시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
 한개의 숫자를 입력받아 가위바위보 게임하기 
 
 [결과]
 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
 1
 사용자 승리!

 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
 1
 시스템 승리!
 
 
 스위치문 사용해서 랜덤함수이용
 
*/
public class Test2 {
	public static void main(String[] args) {
		System.out.println(" 가위(1), 바위(2), 보(3) 하나를 선택하여 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int my = scan.nextInt();
		int com = (int)(Math.random()*3)+1;
		
		if(com==my) {
			System.out.println("비김");
		}else if(com<my) {
			System.out.println("사용자승리!");
		}else if(com>my) {
			System.out.println("시스템승리!");
		}
		
		/*
		if(com==my) {
			System.out.println("컴퓨터 : "+com+" 비겼습니다.");
		}else if(com<my) {
			System.out.println("컴퓨터 :"+com+" 사용자승리!");
		}else if(com>my) {
			System.out.println("컴퓨터 :"+com+" 사용자패배!");
		}*/
		
	}
}
