package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 점수의 총점과 평균
 */
public class Exam9 {
	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:7,수학:85,과학:95";
		
//		Pattern p = Pattern.compile("\\d{1,3}");
		Pattern p = Pattern.compile("[0-9]{1,3}");
		Matcher m = p.matcher(data);
		int sum =0 ,cnt= 0; 
		
		//m.find() : 해당 문자열에서 패턴에 맞는 문자열을 찾기.
		while(m.find()) {
			System.out.print(m.group()+",");
			cnt++;
			sum += Integer.parseInt(m.group());
		}
		
		System.out.println("총점:"+sum+",평균:"+((double)sum/cnt));
		
	}
}
