package Assignment;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("금액을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int remind; //잔액
		
		int t500 = total/500;
		remind = total-(t500*500);
		System.out.println("500원:"+t500+"개");
		int t100 = remind/100;
		System.out.println("100원:"+t100+"개");
		remind = remind - (t100*100);
		int t50 = remind/50;
		System.out.println("50원:"+t50+"개");
		remind = remind - (t50*50);
		int t10 = remind/10;
		System.out.println("10원:"+t10+"개");
		remind = remind -(t10*10);
		int t1 = remind/1;
		System.out.println("1원:"+t1+"개");
	}
}
