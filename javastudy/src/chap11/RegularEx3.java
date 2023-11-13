package chap11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * (): 그룹,
 * 0\\d{1,2} : 0으로 시작하고 숫자가 1개또는 2개가 있는경우. 0[0-9]{1,2}
 * \\d{3,4} : 숫자가 3개 아니면 4개가 있는경우.
 * \\d{4} : 숫자가 4개가 있다.
 */
public class RegularEx3 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111,집:02-1234-5678,"
				+ "이메일:regular1234@gmail.com,계좌번호:301-01-123456";
		
		String telPattern = "(0[0-9]{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		
		int i = 0;
		System.out.println("전화번호");
		
		while(m.find()) {
			System.out.println(m.group()+"=>"+m.group(1)+","+m.group(2)+","+m.group(3));
		}
		
		System.out.println("이메일");
		i=0;
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		p = Pattern.compile(emailPattern);
		m = p.matcher(source);
		while(m.find()) {
			System.out.println(m.group()+"=>"+m.group(1)+","+m.group(2)+","+m.group(3));
		}
		
		System.out.println("계좌번호");
		String accountPattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		i=0;
		p=Pattern.compile(accountPattern);
		m=p.matcher(source);
		while(m.find()) {
			System.out.println(m.group()+"=>"+m.group(1)+","+m.group(2)+","+m.group(3));
		}
		
		
	}
}
