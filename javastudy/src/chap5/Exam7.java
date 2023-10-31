package chap5;

import java.util.Scanner;
/*
 * 2차원 배열 만들기
 */
public class Exam7 {
	public static void main(String[] args) {
		//1, 숫자의 시작값을 데이터에 저장 
		System.out.println("삼각형의 높이를 입력하시오.");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int data = 0; //숫자 시작부분 저장해줄 변수
		for(int i=1;i<=h;i++) {
			data+=i;
		}
		//높이와 같은 행과 열을 가지 배열 matrix생성하자.
		int[][] matrix = new int[h][h];
		
		//숫자 각자리수에 저장하기
		for(int i=0;i<h;i++) {
			for(int j=i;j<h;j++) {
				matrix[i][j] = data--;
			}
		}
		for(int[] arr : matrix) {
			for(int a:arr) {
				if(a==0) {
					System.out.printf("%3c",' ');
				}else {
					System.out.printf("%3d",a);
				}
			}
			System.out.println();
		}
		
	}
}
