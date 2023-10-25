package chap4;
/*
 * 중첩 if 구문 : if문 내부에 if문 존재가능
 */
public class IfEx3 {
	public static void main(String[] args) {
		int score = 85;
		if(score >=60) {
			System.out.println("합격입니다.");
			if(score>=80) {
				System.out.println("좋은 성적입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
	}
}
