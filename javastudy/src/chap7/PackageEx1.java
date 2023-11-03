package chap7;

import java.util.Scanner;

/*
 * 패키지예제
 * package
 *   -클래스와 인터페이스들의 모임
 *   -클래스명은 패키지명을 포함한다.
 *   -package의 설정은 파일의 처음에 한번 가능하다.
 *     => 하나의 파일에 존재하는 모든클래스는 같은 package의 클래스임.
 *     
 *	import : 클래스명에 패키지명을 생략할수 있도록 지정.
 *
 *	클래스의 패키지명을 생략 할 수 있는 경우 
 *	1,같은패키지에 속한 클래스 사용시 
 *  2,java.lang 패키지에 속한 클래스 사용시 
 *  3,import 구문에서 선언된 클래스 사용시
 */
class Pack1{ //chap7.Pack1
	void method() { //default 접근제어자
		System.out.println("chap7.Pack1 클래스의 메서드");
	}
}

public class PackageEx1 {//chap7.PackageEx1
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		Pack1 p1 = new Pack1();
		p1.method();
	}
}
