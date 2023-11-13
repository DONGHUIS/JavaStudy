package chap13;
/* 사용자가 정의한 클래스의 객체를 TreeSet에 저장을 하자.
 * 	1,Comparable<T> - 인터페이스 구현 => 클래스에 구현,기본정렬 방식 설정 사용.
 *  	int comparaTo(T o);
 * 	2,Comparator<T> 인터페이스 구현 => 기본정렬방식외에 다른 방식 사용.실행시 정렬방식 설정.
 *  	int compare(T o1,T o2)
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

//이름순 정렬이 되도록 정렬
class PhoneNo implements Comparable<PhoneNo >{
	String name;
	int number;
	public PhoneNo(String name,int number) {
		super();
		this.name=name;
		this.number=number;
	}
	public String toString() {
		return name + ":" + number;
	}
	@Override
	public int compareTo(PhoneNo p) {
		return name.compareTo(p.name);
	}
	

}
public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<PhoneNo> set = new  TreeSet<PhoneNo>();
		set.add(new PhoneNo("홍길동", 1234));
		set.add(new PhoneNo("김삿갓", 2345));
		set.add(new PhoneNo("이몽룡", 3456));
		System.out.println(set);
		
		System.out.println("전화번호 역순으로 정렬");//comparator 인터페이스
		/*
		TreeSet<PhoneNo> set2 = new TreeSet<>(new Comparator<PhoneNo>() {
			@Override
			public int compare(PhoneNo o1, PhoneNo o2) {
				return o2.number-o1.number;
			}
		});  
		*/		
		//람다식 이용
		TreeSet<PhoneNo> set2 = new TreeSet<>((o1,o2)->o2.number-o1.number);
		set2.add(new PhoneNo("홍길동", 1234));
		set2.add(new PhoneNo("김삿갓", 2345));
		set2.add(new PhoneNo("이몽룡", 3456));
		System.out.println(set2);
		
	}
}
