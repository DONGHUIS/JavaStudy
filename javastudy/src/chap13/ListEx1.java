package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * Collection 인터페이스 : 여러개의 객체를 저장할 수 있는 객체
 *  List 인터페이스 : Collection 인터페이스의 하위 인터페이스
 *  			   저장된 객체들의 순서 유지 => 인덱스(첨자) 사용가능.
 *  			   가변배열이라고함.
 *  		       구현클래스 : ArrayList, Vector(구버전), LinkedList
 *  Set 인터페이스 : Collection 인터페이스의 하위 인터페이스
 *  			  중복된 객체를 저장하지않음.
 *  			  구현클래스 : HashSet , TreeSet , LinkedHashSet(순서유지)
 *  
 *  Map인터페이스 : (key,객체)쌍인 객체들을 저장할 수 있는 객체
 *  			 구현 클래스 : HashMap,TreeMap,Hashtable(구버전)
 */
public class ListEx1 {
	public static void main(String[] args) {
		//<Integer> : 제네릭 표시. List객체내부에 요소의 자료형 설정.
		//jdk8이후 <>표시가능함.
//		List<Integer>list = new ArrayList<Integer>();
//		List<Integer>list = new Vector<Integer>();
		List<Integer>list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(0);
		System.out.println(list);
		
		//list.size() : list 객체내부의 요소의 갯수	
		//list.get(i) : i번인덱스의 요소를 리턴
		for(int i=0; i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		//개선된 for문
		for(Integer i :list) {
			System.out.println(i);
		}
		
		//정렬하기
		System.out.println("///오름차순 정렬///");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("///내림차순 정렬///");
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		for(int i=0; i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		
		//shuffle : 섞기
		System.out.println("///섞기///");
		Collections.shuffle(list);
		System.out.println(list);
		
		//부분 리스트  : sublist(시작인덱스 , 종료인덱스+1)
		//subList(1,4) : 1번인덱스부터 3번인덱스까지
		List<Integer> list2 = new ArrayList<>(list.subList(1, 4));
		System.out.println(list2);
		list.set(1, 100);
		System.out.println("list.set(1, 100) 이후");
		System.out.println(list);
		System.out.println(list2);
		
		
		
		
	}
}
