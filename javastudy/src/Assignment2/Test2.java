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
		System.out.println("가위바위보중 하나를 선택하여 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String my = scan.next();
		int com = (int)(Math.random()*3)+1;
		
		System.out.print("사용자가 "+my);
		switch(com) {
			case 1:System.out.print(" 시스템이 가위를 하여");break;
			case 2:System.out.print(" 시스템이 바위를 하여");break;
			case 3:System.out.print(" 시스템이 보를하여");break;
		
		}
		
		System.out.println(com);
		
		

		
	}
}
