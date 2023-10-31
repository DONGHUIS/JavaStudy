package test1027;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
  	
   입력을 받아서 
   배열에 넣고 
   입력받은 만큼 빈배열을 만들고 그 두개를 비교함.  
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //123
		int tmp = num;  //0
		int result = 0; //입력받은 수의 반대방향 수
		while(tmp != 0) {   
			result *=10;   
			result += tmp %10;   
			tmp /= 10; 
		}
		if(num == result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
		String snum = ""+num; //문자열 형태로 변경 123
        String rsnum="";
        for(int i=snum.length()-1;i>=0;i--) {
        	rsnum += snum.charAt(i);
        }
        if(snum.equals(rsnum))//snum==rsnum 방식안됨.
			System.out.println(num + ": 대칭수");
		else
			System.out.println(num + ": 대칭수 아님");
		
	}
}