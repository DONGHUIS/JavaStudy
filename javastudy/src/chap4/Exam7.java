package chap4;
/*
 * 1에서 100까지 중 2의 배수도 아니고 3의배수도 아닌 수의 합을 구하자
 */
public class Exam7 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100 ; i++) {
			if(i%2!=0 && i%3!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		//continue 이용한 방법
		sum = 0;
		
		for(int i=1; i<=100 ; i++) {
			if(i%2==0) continue;
			if(i%3==0) continue;
				sum+=i;
		}
		System.out.println(sum);
	}
}
