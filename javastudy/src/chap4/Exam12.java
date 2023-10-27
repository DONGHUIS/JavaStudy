package chap4;
/*
 * 1부터 합이 1000이넘는 순간의 값을 출력하기
 */
public class Exam12 {
	public static void main(String[] args) {
		int sum=0;
		int i = 0;
		
		while(true) {	
			i++;
			sum+=i;
			if(sum>1000)break;
		}
		System.out.println(sum);
		
		System.out.println("========================");
		
		for(i=0 ; i<=100;i++) {
			sum+=i;
			if(sum>=1000) break;
		}
		System.out.println(sum);
		
		
	}
}
