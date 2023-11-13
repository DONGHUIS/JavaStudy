package chap13;

import java.util.Vector;

/**
 * Vector 클래스
 *   -Collection 프레임워크 이전의 클래스
 *   -List 인터페이스의 구현클래스
 *   -구버전에의 메서드, List메서드 공존
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0);
		System.out.println(list);
		
		//요소의 위치찾기
		double num = 5.0;
		int index = list.indexOf(num);
		if(index<0) {
			System.out.println(num +"은 list에 없는 요소입니다.");
		}else {
			System.out.println(num+"의 위치:"+index);
		}
		
		//contains() 요소의 존재
		if(list.contains(num)) {
			System.out.println(num+"은 list객체에 있음.");
		}else {
			System.out.println(num+"은 list객체에 존재하지않음.");
		}
		
		//요소제거하기
		System.out.println(list.get(0));
		list.remove(0.3);
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(0));
		
		
		
	}
}
