package test1026;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
 
 
*/
public class Test4 {
	public static void main(String[] args) {
		System.out.println("삼각형 높이  입력");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int bottom = h*2-1;
		int sum = 0; //숫자의 시작값
		
		for(int i=bottom;i>=1;i-=2) {
			sum+=i;
		}
		int m = bottom/2;
		for(int i=0;i<h;i++) {
			for(int j=0;j<bottom;j++) {
				if(j>=m-i && j<=m+i) {
					System.out.print(sum--+"\t");
				}else {
					System.out.print(" ");
				}
			}
			
		}
		System.out.println();
	}
}
