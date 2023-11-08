package chap11;
/*
 * 문자열1,20,30,40,50에 숫자의 합을 출력하여라.
 */
public class Exam3 {
	public static void main(String[] args) {
		String num = "1,20,30,40,50";
		String arr[] = num.split(",");
		int sum = 0;
		for(String a : arr) {
			sum += Integer.parseInt(a);
		}
		System.out.printf("%s => 문자열의 합:%d",num,sum);
	}
}
