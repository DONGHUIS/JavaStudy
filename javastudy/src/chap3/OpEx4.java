package chap3;
/*
 * 이항연산자 : 비교연산자 => 결과는 boolean(true/false)
 * 이항연산자 : 논리연산자 => &&(AND), ||(OR)
 * 		             T && T => T 
 * 		             T && F => F
 * 		             F && T => F
 * 		             F && F => F
 *                   => && 조건의 앞쪽의 결과가 False 인경우 전체 결과 값은 False임.
 *                   	뒤 부분의 연산을 수행하지않는다.
 * 		             T || T => T 
 * 		             T || F => T
 * 		             F || T => T
 * 		             F || F => F
 * 					 => ||조건의 앞쪽의 결과가 true인 경우 전체 결과값음 true임.
 * 					   뒤부분의 연산을 수횅하지않는다.
 */
public class OpEx4 { 
	public static void main(String[] args) {
		int x=1 , y=1;
		// %b : boolean 값 출력
		System.out.printf("%d == %d : %b \n", x, y,(x==y));
		System.out.printf("%d != %d : %b \n", x, y,(x!=y));
		System.out.printf("%d > %d : %b \n", x, y,(x>y));
		System.out.printf("%d >= %d : %b \n", x, y,(x>=y));
		
		//논리연산자
		System.out.println("x==1 && y==2:" + (x==1 && y==2));
		System.out.println("x==1 && y==1:" + (x==1 && y==1));
		System.out.println("x==1 || y==2:" + (x==1 || y==2));
		System.out.println("x==2 || y==2:" + (x==2 || y==2));
		
		String str = null;
		if(str==null || str.equals("")) {
			System.out.println("str에 변수값이 없음.");
		}
		
		
	}
}