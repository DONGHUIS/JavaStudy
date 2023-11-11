package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식 : 문자의 형식 지정하는 기능
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String data[] = {"bat","baby","bonus" ,"cA" ,"ca","co","c.","car","combat","count","cTT","data","disk","c"};
		
		/**
		 * c[a-zA-Z]+ : c로 시작하고 대문자 또는 소문자 여러개로 이루어진 문자
		 *  c: c문자로 시작 
		 *  [a-zA-Z] : c이후에 대소문자로시작해야됨.
		 *  + : 한개이상
		 *  * : 0개이상
		 *  ? : 0개 또는 한개
		 */
		Pattern p = Pattern.compile("c[a-zA-Z]?"); //정규표현식 객체
		
		for(String s : data) {
			Matcher m = p.matcher(s);     // Matcher : 정규표현식과 일치하는지 검증객체.
			//m.matcher() :  
			//Pattern 객체에 설정된 표현식과 일치하면 true,일치하지않으면 false
			if(m.matches()) {
				System.out.print(s+",");
			}
		}
		System.out.println();
		
		String names= "홍길동,      김삿갓,    이몽룡,성춘향,    임꺽정    ";
		String[] arr = names.split("\\s*,\\s*");   // , 앞뒤의 공백들까지 분리문자로 이용.
													//   \s* => 공백0개이상 
												   //   \s => 공백의미 
												   //   *  => 0개이상
		for(String s: arr) {
			System.out.println("==="+s+"===");
			if(s==arr[5]) {
				System.out.println("==="+s+"===");				
			}
		}
	}
}
