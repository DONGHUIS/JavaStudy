package chap13;

import java.util.*;
/*
 * 1,대한민국=서울, 캐나다=오타와 , 영국=런던값을 저장하는 HashMap객체 생성
 * 2,화면에서 나라이름을 입력받아 수도출력하고 종료 입력시까지 계속 입력받기.
 * 	=> 등록된 나라가 아닌경우 : 등록된 나라가 아닙니다.
 * 3,등록된 나라가 아닌 경우 : 수도를 입력받아. map 등록하기
 *   =>프로그램 종료전에 map에 등록된 내용을 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("나라입력을 입력.(종료:종료)");
			String nara = scan.next();
			String cap = map.get(nara);
			
			//객체들은 무조건 equals 써야된다.
			if(nara.equalsIgnoreCase("종료")) {
//				Set<String> keys = map.keySet();
//				for(String k : keys) {
//					System.out.println(k+"의 수도 "+map.get(k));
//				}
				for(Map.Entry<String,String>e:map.entrySet()) {
					System.out.println(e.getKey()+"=>"+e.getValue());
				}
				System.out.println("프로그램 종료");
				break;
			}
			
			if(cap==null) {
				System.out.println(nara+":등록된나라가 아닙니다.");
				System.out.println(nara+"의 나라 등록을 위해 수도를 입력하세요.");
				cap = scan.next();
				map.put(nara, cap);
			}else {
				System.out.println(nara+"의 수도" + cap);
			}
			
			
		}
	}
}
