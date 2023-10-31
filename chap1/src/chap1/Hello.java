package chap1;

import java.util.Scanner;

public class Hello {
	/*
	 * 주석(comment) : 컴파일이 되지않은 영역 -> 기계어로 번역 되지않음. 
	 * 				  문법과 상관없이 소스의 설명등을 기술함.
	 */
	/* 여러줄 주석 */
	// -> 한줄 주석: //부분이 주석임.
	/* java 실행단계 
	 * 1, 소스코딩 : Hello.java
	 * 2, 컴파일 단계 : javac Hello.java -> 바이트코드(Hello.class) 생성
	 *     javac : 자바 컴파일러
	 * 3, 실행 단계 : java Hello -> 바이트코드를 실행.
	 * 	   java : 자바 인터프리터
	 * 		 -자바가상머신 (JVM) 환경 생성
	 *  	 -바이트코드를 메모리에 로드함.바이트코드 여부 검증.
	 *  	 -main 메서드를 찾아서 실행.
	 */
	public static void main(String[] args) { // main은 프로그램의 시작
		//System.out : 표준출력 -> 콘솔(화면)출력
		System.out.println("Hello World");
		System.out.println("Hello Java");
		
		//때, A+B, A-B, A*B, A/B(몫), A%B(나머지)
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
		
		
	}

}
