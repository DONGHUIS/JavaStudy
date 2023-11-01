package chap6;
/*
 * 메서드 오버로딩 : 메서드의 다형성 
 *  1, 동일한 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 할 수 있다.
 *  2, 단,매개변수 목록이 달라야한다.(자료형 기준 => 갯수,형,순서)
 */
class Math2{
	int a = 100;
	
	int add(int b) {
		System.out.print("1:");
		return a+b;
	}
	
	/*  매개변수 목록이 다른경우는 자료형 기준임. 매개변수명이 다르다고 오버로딩되지않는다.
	int add(int x) {
		System.out.print("1:");
		return a+x;
	}*/
	
	double add(double b) {
		System.out.print("2:");
		return a+b;
	}
	
	String add(String b) {
		System.out.print("3:");
		return a+b;
	}
}

public class OverloadingEx1 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
		System.out.println(m.add(10L)); //long형 자료형이 없어도 자동으로 double형으로 형변환됨.
		System.out.println(m.add(10F)); //float형 자료형 없어도 자동으로 double형으로 형변환됨.
//		System.out.println(m.add(new int[1]));  배열은 안된다.
	}
}
