package chap4;

import java.util.Scanner;

/*
 * 농장에 강아지,병아리가 있다.
 * 강아지,병아리의 전체 마리수와, 다리수를 입력받고,
 * 강아지의 마리수와 병아리의 마리수를 출력하자.
 * 
 * [결과]
 * 마리수 입력 : 20 
 * 다리수 입력 : 30
 * 강아지 : xx
 * 병아리 : yy
 * 
 */
public class Exam10 {
	public static void main(String[] args) {
		System.out.print("마리수 입력");
		System.out.print("다리수 입력");
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt(); //마리수 2 
		int leg = scan.nextInt(); //다리수 6
		boolean check =false; //마지막에 계산안될때 사용됨
		
		for(int x=0; x<=cnt; x++) {
			for(int y=0; y<=cnt; y++) {
				if((x+y==cnt) && ((4*x)+(2*y)== leg)){
					System.out.println("강아지수:"+x);
					System.out.println("병아리수:"+y);
					check = true; //조건만족
				}
			}
		}
		/* check == true  : !check => false 
		   check == false : !check => true  */
		if(!check) { //check == false
			System.out.println("계산안됨.");
		}
		
		
	}
}
