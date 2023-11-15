package chap13;

import java.util.Comparator;
import java.util.TreeMap;

/*
 * TreeMap 예제 : key순으로 정렬됨.
 */
public class MapEx2 {
	public static void main(String[] args) {
		//TreeMap<Integer,String> scores = new TreeMap<Integer, String>();
		TreeMap<Integer,String> scores = new TreeMap<Integer, String>(
											Comparator.reverseOrder());
		scores.put(87, "홍길동");
		scores.put(98, "이몽룡");
		scores.put(75, "임꺽정");
		scores.put(94, "김삿갓");
		scores.put(80, "성춘향");
		scores.put(88, "향단이");
		System.out.println(scores);
		
		System.out.println("첫번째 key:"+scores.firstKey());
		System.out.println("첫번째 entry:"+scores.firstEntry());
		
		//점수가 가장 낮은 사람의 이름 출력
		System.out.println("최저점수를 받은자:"+scores.get(scores.firstKey()));
		System.out.println("최저점수를 받은자:"+scores.firstEntry().getValue());
		
		System.out.println("마지막 key:"+scores.lastKey());
		System.out.println("마지막 key:"+scores.lastEntry());
		
		System.out.println("최저점수를 받은자:"+scores.get(scores.lastKey()));
		System.out.println("최저점수를 받은자:"+scores.lastEntry().getValue());
		
		System.out.println("94점 앞 점수:"+scores.lowerEntry(94));
		System.out.println("94점 뒤 점수:"+scores.higherEntry(94));
		
		System.out.println("94점포함 앞점수:"+scores.floorEntry(94));
		System.out.println("94점포함 뒤점수:"+scores.ceilingEntry(94));
		
	}
}
