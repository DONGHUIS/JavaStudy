package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("조회하실 달을 입력=>");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		calendar.set(year, month-1,1); 
		System.out.printf("날짜:%d-%d-%d\n",calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DATE));
		int last = calendar.getActualMaximum(Calendar.DATE);
		calendar.set(year, month-1,last);
		System.out.printf("날짜:%d-%d-%d\n",calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DATE));
		
		int firstWeek = calendar.get(Calendar.WEEK_OF_MONTH);
		String tmp = " ";
		
		System.out.printf("%15s", year +"년"+month+"월");
		System.out.println();
		System.out.println("  일   월   화   수  목  금  토");
		
		for(int i =1; i<last+firstWeek; i++) {
			if(i<firstWeek) {
				System.out.printf("%4s",tmp);
			}else if(i>=firstWeek) {
				System.out.printf("%4s",i-firstWeek+1);
			}
			
			if(i% 7==0) {
				System.out.println();
			}
		}
		
	}
}
