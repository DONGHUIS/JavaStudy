package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 *	Iterator 인터페이스 객체 : 반복자 
 *    Collection 객체는 Iterator객체로 변환이 가능 : iterator()메서드 이용.
 *    주요메서드  - boolean hasNext() : 조회 대상 각체 존재?
 *    		   - Object next() 	   : 조회 대상 객체 리턴
 *    		   - void remove()     : 조회된 객체 제거, 반드시 next()실행 이후에 호출해야함.
 *    
 *    Enumeration 인터페이스 : Iterator 반복자 이전에 사용되던 구반복자.
 *    					  : Collection 프레임워크 이전에 사용됨 : Vector,HashTable
 *   	 주요메서드  - boolean hasMoreElement() : 조회대상 객체 존재?
 *    	     	  - Object nextElement()     : 조회대상 객체 리턴
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator<Integer> it = null;
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i=1;i<=5; i++) {
			list.add(i+10);
			set.add(i*10);
		}
		it=list.iterator();
		print(it);
		it=set.iterator();
		print(it);
		System.out.println(list);
		System.out.println(set);
	}
	private static void print(Iterator<Integer>it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
