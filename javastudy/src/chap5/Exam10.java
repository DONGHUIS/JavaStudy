package chap5;

import java.util.Scanner;

/**
 * 2차원 배열의 값을 입력받아 다음과 같은 내용을 출력하기
 * 배열의 갯수를 입력하세요.
   5
  
   1
   2  3
   4  5  6
   7  8  9  10 
   11 12 13 14 15
 */
public class Exam10 {
	public static void main(String[] args) {
		System.out.println("배열의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int arr[][] = new int[h][];
		int data=0;
		
		for(int i=0; i<h;i++) {
			arr[i] = new int[i+1];//1차원 배열 객체 생성
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ++data;
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		
		//개선된 for문 활용한 arr배열 출력하기
		for(int[] ar: arr) {
			for(int a : ar) {
				System.out.printf("%5d",a);
			}
			System.out.println();
		}
		
	}
}
