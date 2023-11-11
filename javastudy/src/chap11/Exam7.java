package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*; //java.util 의 모든 클래스들은 패키지명 생략 가능.

/*
 * 문자열로 두개의 날짜를 입력받아 두 날짜 사이의 일수 계산하기
 * 
 * [결과]
 * 두개의 날짜를 입력하세요.(yyyy-MM-dd)
 * 2023-01-01 2023-01-03
 * 날짜차이 : 2
 * 
 */
public class Exam7 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 날짜를 입력하세요.(yyyy-MM-dd)");
		String d1 = scan.next();
		String d2 = scan.next();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date start = sf.parse(d1);
		Date end = sf.parse(d2);
		
		long datecnt = (end.getTime()-start.getTime())/(1000*60*60*24);
		System.out.printf("%s-%s 사이의 일자:%d\n",d1,d2,Math.abs(datecnt));
		
		
	}
}
