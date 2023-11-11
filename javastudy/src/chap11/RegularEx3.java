package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */
public class RegularEx3 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111,집:02-1234-5678,"
				+ "이메일:regular1234@gmail.com,계좌번호:301-01-123456";
		/**
		 * (): 그룹,
		 * 0\\d{1,2} : 0으로 시작하고 숫자가 1개또는 2개가 있는경우. 0[0-9]{1,2}
		 * \\d{3,4} : 숫자가 3개 아니면 4개가 있는경우.
		 * \\d{4} : 숫자가 4개가 있다.
		 */
		String telPattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		int i=0;
		System.out.println("전화번호");
		//m.find() : 해당 문자열에서 패턴에 맞는 문자열을 찾기.
		while(m.find()) {
			System.out.println(++i+":"+m.group()+"=>"
					+m.group(1)+","+m.group(2)+","+m.group(3));
		}
		
		//   \w : [0-9A-Za-z]
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		p = Pattern.compile(emailPattern);
		m = p.matcher(source);
		System.out.println("이메일");
		i=0;
		//m.find() : 해당 문자열에서 패턴에 맞는 문자열을 찾기.
		while(m.find()) {
			System.out.println(++i+":"+m.group()+"=>"
					+m.group(1)+","+m.group(2)+","+m.group(3));
		}
		
		String account = "(\\d{3})-(\\d{2})-(\\d{6})";
		p = Pattern.compile(account);
		m = p.matcher(source);
		System.out.println("계좌번호");
		i=0;
		//m.find() : 해당 문자열에서 패턴에 맞는 문자열을 찾기.
		while(m.find()) {
			System.out.println(++i+":"+m.group()+"=>"
					+m.group(1)+","+m.group(2)+","+m.group(3));
		}
	}
}
