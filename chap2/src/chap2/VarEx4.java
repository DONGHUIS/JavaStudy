package chap2;
/*
 * 형변환 예제1
 * 
 * 자바의 자료형 
 * 	기본자료형  
 * 		논리형 :	boolean(1byte)
 * 		문자형 :  char(2byte)
 * 		정수형 :  byte(1btye) , short(2byte) , int(4byte) , long(8byte) 
 * 		실수형 :  float(4byte) , double(8byte)
 * 	참조자료형 
 * 		배열(array)
 * 		클래스(class)
 * 		인터페이스(interface)
 * 
 * 형변환 
 *   1, 기본자료형 중 boolean을 제외한 7개의 자료형은 형변환 가능함.
 *   2, 기본자료형과 참조자료형은 형변환 불가능.(Wrapper class는 예외).
 *   3, 자동형변환 : 형변환 연산자 생략 가능.
 *   			  큰자료형 <= 작은자료형
 *   	명시적형변환 : 형변환 연산자 생략 불가.
 *   			  작은자료형 <= 큰자료형.
 *   4, float <= long : 자동형변화. 형변환 연산자 생략가능.
 *   	long <= float : 명시적형변화. 형변환 연산자 생략불가.
 */
public class VarEx4 {
	public static void main(String[] args) {
		byte b = 10 ;
		short s = 20 ;
		int i  = 30 ;
		long l = 40 ; //8바이트 크기
		float f = 50;  //형변환 float <- 정수형. 4바이트 크기 
		double d = 60; //형변환 double <- 정수형
		//(타입) : 형변환 연산자
		b=(byte)257; //byte형 값의 저장범위 : -128 ~ 127까지만 가능.
		s=128;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		s = (short)i;  //작은 자료형 <= 큰자료형 : 명시적형변환 , 형변환연산자 필수.
		l= (long)i ;  //큰 자료형 <= 작은 자료형 :  자동형변환 형변환 연산자 생략 가능.
		l= (long)f;   //float > long
		f= l;
		
		//실수형 리터널은 기본이 double임.
		f = (float)10.0; //float <- double이므로 형변환 연산자 생략 불가
		d = 20.0;
		//접미사를 이용한 리터널 : F/f , D/d , L/l로 표현함.
		f = 10.0F; //float형 리터널
		d = 20.0D; //double형 리터널
		l = 100L;  //long형 리터널 
		
	}
}
