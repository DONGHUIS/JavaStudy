package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date : 날짜 표시 클래스
 * SimpleDateFormat : 형식화 클래스. java.text패키지의 클래스
 *   패텬으로 사용되는 문자 
 *   	yyyy : 년도4자리
 *   	MM : 월2자리
 *   	dd : 일2자리
 *   	HH : 시간2자리 
 *   	mm : 분2자리
 *   	ss : 초2자리
 *  	E  : 요일
 *  	a  : 오전/오후
 *   
 *   중요한 메서드 
 *   String format(Date d) : 날짜d값을 받아서 설정된 패턴에 맞는 문자열을 리턴.	
 *   Date parse(String s)  : 패턴에 맞는 문장열 데이터를 Date형으로 리턴.	
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();  //현재 일시
		System.out.println(now); //toString()이 생략되있음.
		System.out.println(now.toString());
		
		SimpleDateFormat sf = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss E요일a");
		System.out.println(sf.format(now));
		
		SimpleDateFormat sf2 = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date day = null;
		try {
			day = sf2.parse("2023/12/25 10:00:00"); //parse는 예외처리가 필수다.
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		
		//day 값을 2023년 12월 25일 월요일 형식 출력하자.
		SimpleDateFormat sf3 = 
				new SimpleDateFormat("yyyy년MM월dd일 E요일");
		System.out.println(sf3.format(day));
		
	}
}
