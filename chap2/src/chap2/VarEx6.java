package chap2;
/*
 * String 클래스의 + 연산 
 *   1, 참조자로형(문자열 객체)
 *   2, 클래스 중에 유일하게 =(대입연산자)로 객체 생성이 가능하다.
 *   3, 클래스 중에 유일하게 + 연산자 사용 가능함.
 *   	String = String + 기본자료형
 */
public class VarEx6 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = str1 + 100;			//String  <=  String + int 
		System.out.println("Str2="+ str2);
		str2 = str1 + 1+2+3;
		System.out.println("str2=" + str2);
		str2 = 1+2+3+str1;
		System.out.println("str2=" + str2); //한줄출력
		
		System.out.print(1); //ln은 개행되서 다음줄에 찍는다. ln을 안쓰고 그냥 print로 쓰면 그냥 옆에다가 붙인다
		System.out.print(2); 
		System.out.print(3);
		
		System.out.println();
		
		//printf : format을 지정하여 출력
		System.out.printf("%d\n",12345);	// %d : 10진정수출력
		System.out.printf("%10d\n",12345); // 10자리 확보하여 10진수 12345 출력
		// %f : 부동소숫점 출력. 실수 출력.
		System.out.printf("%f\n",123.45);
		// %.1f : 실수 출력. 소숫점이하 1자리로 출력. 반올림함.
		System.out.printf("%.1f\n",123.45);
	}
}
