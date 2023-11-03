package chap8;
/*
 * 인터페이스 
 * 1, 인터페이스 멤버 : 상수 ,추상메서드 , default 메서드,static 메서드만 가능.
 * 2, 인터페이스 접근제어자 : 무조건 public만 가능.
 * 3, 객체화불가 => 구현클래스(인터페이스를 구현)의 객체화로 객체화
 * 4, 클래스와 인터페이스는 구현으로 표현함. => implements 예약어 사용
 * 	  => 다중 구현이 가능.
 * 5, 인터페이스간의 상속가능. => 다중 상속이 가능.
 * 
 * 인터페이스 멤버 
 *  상수 : [public static final] int NUM=100;  (o)
 *        [public static ] final int NUM=100; (o)
 *        protected int NUM = 100;            (X)
 *        
 * 추상메서드 :[public abstract] void method();  (O)
 * 			[public] abstract void method();  (O)
 * 
 * default 메서드 : 구현부가 있는 메서드, 인스턴스 멤버. jdk8이후에서 가능
 * static 메서드 : 구현부가 있는 메서드, 클래스 멤버. jdk8이후에서 가능	 
 * 
 * 참조자료형 : 배열 , 클래스 , 인터페이스
 */
interface Printerable{
	int INK = 100; //상수 [public static final] int INK = 100
	void print();  //추상메서드 [public abstract] void print()
}
public class InterfaceEx1 {
	public static void main(String[] args) {
//		Printerable.INK = 1000; 
		System.out.println(Printerable.INK);
	}
}
