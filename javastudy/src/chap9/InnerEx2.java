package chap9;

import chap9.Outer2.InstanceInner;

class Outer2{
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{
		//int siv = outeriv; //객체화 필요
		int siv = new Outer2().outeriv;
		static int scv = outercv;
		int siv2 = outercv;
	}
	
	void method(int pv) { //pv=30
		int max = 1000; //지역변수의 번경이없어 상수로 판단되어 정상.
		// max++; => 지역변수의 변경이 있어 오류가 발생됨.
		class LocalInner{
			int liv = outeriv;
			int liv2 = outercv;
			
/*
 * 지역중첩클래스의 멤버메서드에서 외부메서드의 지역변수는 상수화되어야함.
 * 지역변수의 변경이 없는 경우는 상수로 판단함.
 * 지역변수의 번경이 되는경우는 오류발생.
*/
	void method(int num) { //LocalInner의 멤버메서드
		outeriv++;
		outercv++;
		liv++;
		liv2++;
		System.out.println("outeriv="+outeriv);
		System.out.println("outercv="+outercv);
		System.out.println("liv="+liv);
		System.out.println("liv2="+liv2);
		num = liv+liv2;
		System.out.println("num="+num);
		//pv = outeriv + outercv;
		System.out.println("pv="+pv);
		System.out.println("max="+max); //1000
			}
		}
		//LocalInner.method() 호출하기
		LocalInner li = new LocalInner(); //localInner 객체생성
		li.method(3);
	}
}
public class InnerEx2 {
	public static void main(String[] args) {	
		Outer2 o = new Outer2(); //LocalInner를 호출할려면 외부클래스를 호출.
		
//		InnerEx2클래스에서 outer2의 private멤버 접근 불가.
//		System.out.println(out.outeriv); 
//		System.out.println(out.outercv);
		
		o.method(30);
		//InstatnceInner,StaticInner의 멤버변수를 화면 출력하기
		Outer2.InstanceInner in = o.new InstanceInner();
		Outer2.StaticInner st = new Outer2.StaticInner();
		
		System.out.println(in.iiv);
		System.out.println(in.iiv2);
		System.out.println(st.siv);
		System.out.println(st.siv2);
		System.out.println(Outer2.StaticInner.scv);
	}
}
