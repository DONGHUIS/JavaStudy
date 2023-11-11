package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아 년월의 마지막일자와 요일 출력하자.
 */
public class Exam5 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도와 월을 입력.");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		
		String dstr = year +"-"+String.format("%02d",(mon+1))+"-01";
		//System.out.println(dstr);
		Date day = new SimpleDateFormat("yyyy-MM-dd").parse(dstr);
		//System.out.println(day);
		day.setTime(day.getTime()-(1000*60*60*24));
		
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
		
		
	}
}
