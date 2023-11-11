package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exam8 {
	private static final int DAY_OF_WEEK = 0;

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도와 월을 입력.");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		
		Calendar day = Calendar.getInstance();
		day.set(year, (mon -1),1); //월:0~11
		int firstWeek = day.get(Calendar.DAY_OF_WEEK); //첫주 시작일
		String w = " 일월화수목금토"; //요일 : 1(일) ~ 7(토)
		
		int last = day.getActualMaximum(Calendar.DATE);
		
		System.out.printf("날짜:%d-%d-%d %c요일\n",day.get(Calendar.YEAR),
				day.get(Calendar.MONTH)+1,day.get(Calendar.DATE),w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		
		day.set(year,(mon-1),last);
		
		System.out.printf("날짜:%d-%d-%d %c요일\n",day.get(Calendar.YEAR),
				day.get(Calendar.MONTH)+1,day.get(Calendar.DATE),
				w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		
		int tab = day.get(Calendar.DAY_OF_MONTH);
		String tmp = "";
		
		System.out.printf("%15s",year+"년"+mon +"월"+"\n");
		System.out.println("  일   월   화   수  목  금  토");
		
		for(int i=1; i<last+firstWeek; i++) {
			if(i<firstWeek){	
				System.out.printf("%4s",tmp);
				}
			else {
				System.out.printf("%4d",i-firstWeek+1);
				}
			if(i%7 ==0) {
				System.out.println(); 
			}
		}
		System.out.println();
	}
}
