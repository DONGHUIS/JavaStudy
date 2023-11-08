package chap11;
/*
 * String 클래스 : 정적인 문자열(번경불가 문자열)
 *   1. + 연산이 가능하다. 문자열과 기본자료형을 더할수 있어 문자열로 표현가능.(문자열 <= 문자열 + 기본형)
 *   2. 대입연산자로 객체 생성 가능.
 *   3. final 클래스임 : 다른 클래스의 부모클래스 불가.
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s1==s2) {
			System.out.println("s1과 s2는 같은객체임");
		}else {
			System.out.println("s1과 s2는 다른객체임");
		}
		if(s3==s4) {
			System.out.println("s3과 s4는 같은객체임");
		}else {
			System.out.println("s3과 s4는 다른객체임");
		}
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같은내용의 객체임");
		}else {
			System.out.println("s1과 s2는 다른내용의 객체임");
		}
		if(s3.equals(s4)) {
			System.out.println("s3과 s4는 같은내용의 객체임");
		}else {
			System.out.println("s3과 s4는 다른내용의 객체임");
		}
		System.out.println("s1.hashcode:"+System.identityHashCode(s1));
		System.out.println("s2.hashcode:"+System.identityHashCode(s2));
		System.out.println("s3.hashcode:"+System.identityHashCode(s3));
		System.out.println("s4.hashcode:"+System.identityHashCode(s4));
	}
}
