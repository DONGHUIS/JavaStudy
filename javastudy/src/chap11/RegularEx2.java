package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *	 정규 표현식 문자 
	    . : 문자 한개
	    ? : 0 또는 1개
	    * : 0개 이상
	    + : 1개 이상
	  ^[] : 지정된 문자로 시작되는 문자
	  [^] : 지정된 문자 제외 
	   |  : 또는 ,or
	   &  : and
	   () : 그룹
	   \s : 공백
	   \S : 공백이 아닌 문자  
	   \d : 숫자,[0-9]
	   \D : 숫자가 아닌 문자 
	   \w : 문자[0-9A-Za-z]
	   \W : 특수문자
	   {n}: n개
	  {n,}: n개 이상
	 {n,m}: n개 ~ m개
 */
public class RegularEx2 {
	public static void main(String[] args) {
		String patterns[]= {
				".","[a-z]?","[0-9]+","^[0-9]","[a-z]*",
				"[a-z]+","02|010","\\s","\\S","\\d","\\w","\\W"};
		String datas[] = {"","a","1","12","012","abc","02"," ","A","5","a","*"};
		
		
		
	}
}