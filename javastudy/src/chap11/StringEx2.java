package chap11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new  String("ABCDEFGH");
		
		//charAt(4) : 5번째 문자 리턴. 4번인덱스 문자(char) 리턴
		System.out.println("s.charAt(4):"+s.charAt(4)); //E 
		
		/*s.compareTo("abc") : 결과가 양수 s 문자열이 "abc"문자열보다 앞쪽 
							   결과가 음수 s 문자열이 "abc"문자열보다 뒤쪽 
		    => 정렬에서 사용되는 메서드 */
		System.out.println("s.compareTo('abc'):"+s.compareTo("abc")); //-32
		System.out.println("s.compareTo('AAA'):"+s.compareTo("AAA")); //1
		
		//s.compareToIgnoreCase : 대소문자 상관없이 
		System.out.println("s.compareToIgnoreCase('abc'):"+s.compareToIgnoreCase("abc")); //5
		
		//s.endsWith("GH") : s 문자열이 GH로 끝나는지 여부.
		System.out.println("s.endsWith('GH'):"+s.endsWith("GH"));//true		
		//s.startsWith("AB") : s문자열이 AB로 시작하는지 여부.
		System.out.println("s.startWith('AB'):"+s.startsWith("AB")); //true
		
		//s.equals('ABCDEFGH') : 내용비교
		System.out.println("s.equals('ABCDEFGH'):"+s.equals("ABCDEFGH"));//true
		//s.equalsIgnoreCase("abcdefgh") : 대소문자 상관없이 내용비교
		System.out.println("s.equalsIgnoreCase('abcdefgh'):"+s.equalsIgnoreCase("abcdefgh")+"\n");//true
		
		System.out.println("//// s 번경 이후 ////");
		
		s= "This is a String";
		//s문자열에서 i문자의 인덱스 리턴
		System.out.println("s.indexOf('i'):"+s.indexOf('i')); //2
		//s문자열에서 3번 인덱스 부터 'i'문자의 인덱스 리턴
		System.out.println("s.indexOf('i',3):"+s.indexOf('i',3)); //5
		//s문자열에서 'Q'문자의 인덱스 리턴.없는 문자인 경우 -1 리턴.
		System.out.println("s.indexOf('Q'):"+s.indexOf('Q',3));
		//s문자열에서 뒤 우선으로 i 문자의 앞쪽부터 시작되는 인덱스 리턴.
		System.out.println("s.lastIndexOf('i'):"+s.lastIndexOf('i'));
		//문자열의 길이 출력
		System.out.println("s.length():"+s.length());
		//replace : 문자열의 치환
		System.out.println("s.replace('is','QR'):"+s.replace("is","QR"));
		//s.substring :부분문자열
		System.out.println("s.substring(5):"+s.substring(5)); //5번인덱스부터 끝까지 부분문자열로 가져옴.
		//s.substring(5,13)
		System.out.println("s.substring(5,13):"+s.substring(5,13)); //5번인덱스부터 12번 인덱스까지
		//대소문자번경 : toUpperCase(),toLowerCase()
		System.out.println("s.toUpperCase():"+s.toUpperCase()); System.out.println("s.toLowerCase():"+s.toLowerCase()+"\n");
		
		//trim() : 양쪽공백제거. 문자사이의 중간공백은 제거안됨.
		s = "           문자열 trim 메서드         ";
		System.out.println("s="+s+"===");
		System.out.println("s.trim()="+s.trim()+"==="+"\n");
		
		//split : 문자열 분리하여 배열로 리턴.
		s="홍길동,이몽룡,김삿갓";
		String[] arr = s.split(",");
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
