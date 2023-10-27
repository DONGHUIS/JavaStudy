package chap5;

import java.util.Arrays;

/*
 * 로또번호 생성기
 */
public class ArrayEx3 {
	public static void main(String[] args) {
		
		int[] balls = new int[45];
		int[] lotto = new int[6];
		
		for(int i=0; i<balls.length;i++) {
			balls[i] = i+1; //1~45값 balls 배열에 저장
		}	
		//ball 섞기
		for(int i=0;i<=1000; i++) { //i : 0~1000
			int f =(int)(Math.random()*balls.length); //0~44까지의 임의의수 . 3 
			int t = (int)(Math.random()*balls.length);//0~44까지의 임의의수 . 5
			//swap 알고리즘 (번호를 뒤바꾼다.)
			int tmp = balls[f]; //tmp:4 <= balls[3]
			balls[f]=balls[t]; //balls[3]:6 <= balls[5]:6
			balls[t] =tmp; //balls[5]:4 <= tmp:4
		}
		for(int b : balls) System.out.print(b+" ");
		
		//선택된 데이터를 lotto배열에 저장 
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=balls[i];
		}
		System.out.println();
		for(int b: lotto) System.out.print(b+" ");
		System.out.println();
		
		//정렬
		/*for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length-1-i;j++) {
				if(lotto[j]>lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=tmp;
				}
			}
			System.out.print(i+":");
			for(int a:lotto) System.out.print(a+" ");
			System.out.println();
		}*/
		
		//Arrays 클래스를 이용한 정렬
		//Arrays : 배열객체의 다양한 기능을 제공해주는 클래스
		System.out.println("Arrays 클래스를 이용한 정렬");
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=balls[i];
		}
		Arrays.sort(lotto);//lotto 배열 정렬하기.
		for(int a:lotto) System.out.print(a +" ");
		System.out.println();
		
		
	}
}
