package chap7.test;

import chap7.Modifier3;
import chap7.ModifierEx2;

public class ModifierEx3 {
	public static void main(String[] args) {
		//Modifier3 클래스의 접근제어자가 default임.
		//다른 패키지에서 클래스에 접근불가
		chap7.Modifier3 m3 = new chap7.Modifier3();
		m3.method();
		//ModifierEx2 클래스의 접근 제어자가 public임.
		//다른패키지에서 접근허용
		chap7.ModifierEx2 m2 = new chap7.ModifierEx2();
		
	}
}
