package chap11;
/*
 * 정적인 문자열의 특징
 */
public class StringEx3 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main:"+str);
		str = change(str);
		System.out.println("change후 main:"+str);
	}
//	private static void change(String str) {
//		str+="456";
//		System.out.println("Change:"+str);
//	}
	
	private static String change(String str) {
		str+=456;
		System.out.println("Change:"+str);
		return str;
	}
}
