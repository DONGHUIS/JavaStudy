package chap5;

import java.util.Scanner;
//10진수를 입력받아 16진수로 번경하기
//int[] 베열 사용불가. 012345678ABCDEF데이터 필요
public class ArrayEx5 {
	public static void main(String[] args) {
		//toCharArray : char[] <= 문자열 변환해줌.
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8]; //변환된 16진 데이터저장
		System.out.println("16진수로 변환할 10진수 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //17
		int divnum=num;
		int index = 0; //1
		while(divnum>0) { //17
			hex[index++]=data[divnum%16];//divnum%16:1
			divnum/=16;
		}
		System.out.print(num+"의 16진수:");
		for(int i=index-1; i>=0;i--) {
			System.out.print(hex[i]);
		}
		System.out.println();
		
		System.out.println(Integer.toHexString(num)); 
	}
}
