package test1025;

import java.util.Scanner;

/*
1.   ch 변수의  문자가 
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을  출력하기
     그외의 문자는 기타 문자 를 출력하세요 
[결과]
A : a
b : B
1 : 21
- :기타문자

*/
public class Test1 {
	public static void main(String[] args) {
		char ch = 'A';
		//'0'의 코드갑 : 48 - 48
		//'1'의 코드값 : 49 - 48	
		//'2'의 코드값  : 50 -48
		System.out.print(ch+":");
		if(ch>='A' && ch<='Z') {
			System.out.println("A:"+(char)('A'+32));
		}else if(ch>='a' && ch <='z') {
			System.out.println((char)(ch-32));
		}else if(ch>='0' && ch <='9') {
			System.out.println((ch-'0')+20);
		}else {
			System.out.println("기타문자");
		}
		
		
		
		
	}
}
