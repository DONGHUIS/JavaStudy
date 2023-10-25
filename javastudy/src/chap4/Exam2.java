package chap4;
/*
 * ch문자가 대문자/소문자/숫자/기타문자인지 출력하기
 * [결과]
 * A : 대문자
 * [결과]
 * b : 소문자
 * 
 * 1 : 숫자
 * 
 * - : 기타문자
 */
public class Exam2 {
	public static void main(String[] args) {
		char ch = 'B';
		
		System.out.print(ch + ":");
		if('A'<= ch  && ch<= 'Z') {
			System.out.println("대문자");
		}else if('a' <= ch && ch<='z') {
			System.out.println("소문자");
		}else if(ch>='0' && ch<='9') {
			System.out.println("숫자");
		}else {
			System.out.println("기타문자");
		}
		System.out.println("A:"+(int)'A');
		System.out.println("a:"+(int)'a');
		System.out.println("Z:"+(int)'Z');
		//대문자 + 32 -> 소문자 코드값
		System.out.println("A의 소문자:"+(char)('A'+32));
	}
}	