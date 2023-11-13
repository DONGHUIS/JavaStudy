package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 점수의 총점과 평균
 */
public class Exam9 {
	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:72,수학:85,과학:95";
		
		String scorePattern = "(\\d{2,3})";
		
		Pattern p = Pattern.compile(scorePattern);
		Matcher m = p.matcher(data);
		int cnt =0;
		int sum=0;
		while(m.find()) {
			System.out.print(m.group()+",");
			cnt++;
			sum+=Integer.parseInt(m.group());
		}
		System.out.println("총점:"+sum);
		System.out.println("평균:"+sum/cnt);
	}
}
