package chap5;
/*
 * 문자열 내에 각 소문자의 갯수 출력하기
 *  1,소문자만 갯수 출력하기
 *  2,cnt배열의 요소가 1이상인 데이터만 출력하자.
 *  3, cnt배열의 값만큼 별표로 출력하기
 */
public class Exam3 {
	public static void main(String[] args) {
		String str = "aaabb2131231231231bsssddddrrrrr";
		char[] alpha = str.toCharArray();
		int[] cnt = new int[26]; //소문자 총갯수 26개
		
		for(int i=0;i<alpha.length;i++) {
		  if(alpha[i] >='a' && alpha[i] <= 'z') {
			cnt[alpha[i]-'a']++;
		  }
		}
		
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]>0) {
				System.out.print((char)(i+'a')+":"+cnt[i]+"개=>");
				for(int j=0;j<cnt[i];j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
