package test1027;

import java.util.Arrays;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Test6 {
	public static void main(String[] args) {
		int[] num = new int[9];
		int[] select = new int[3];
		
		for(int i=0; i<num.length;i++) {
			num[i] = i+1;
		}
		for(int i=0; i<=1000; i++) {
			int f = (int)(Math.random()*num.length);
			int t = (int)(Math.random()*num.length);
			
			int temp = num[f];
			num[f]=num[t];
			num[t]=temp;
			
		}
		
		for(int b : num) System.out.print(b+" ");
		
		for(int i=0; i<select.length; i++) {
			num[i]=select[i];
		}

		System.out.println();
		for(int b: select) System.out.print(b+" ");
		System.out.println();
		
	}
}