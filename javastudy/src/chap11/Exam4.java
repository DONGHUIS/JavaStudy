package chap11;
/*
 * delChar 메서드 구현하기 
 * StringBuffer delChar(원본문자열,삭제문자열)
 * => 원본문자열에서 삭제 문자열을 제외한 문자열 리턴
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println(delChar("(1!2@3^4~5)","12345"));
	}
	
	static StringBuffer delChar(String s1,String s2) {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<s1.length();i++) {
			char c = s1.charAt(i);
//			if(s2.indexOf(c)<0) {
//				sb.append(c);
//			}
//			s2.contains(c) =>c문자열이 s2문자열에 포함되는지 비교
			if(!s2.contains(c+"")) {
				sb.append(c);
			}
		}
		
		return sb;
	}
}


