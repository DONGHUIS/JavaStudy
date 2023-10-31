package chap5;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		System.out.println("사각형의 높이를 홀수로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		
		char[][] ex = new char[h][h];
		for(int i=0; i<ex.length; i++) {
			for(int j=0; j<ex[i].length;j++) {
				if(i==j) {
					ex[i][j]='X';
				}else if(i+j ==h-1) {
					ex[i][j] ='X';
				}else {
					ex[i][j]=' ';
				}
				System.out.print(ex[i][j]);
			}
			System.out.println();
			
			
			/*
			  (0,0) (0,1) (0,2)
			  (1,0) (1,1) (1,2)
			  (2,0) (2,1) (2,2)
			 */
		}
	}
}
