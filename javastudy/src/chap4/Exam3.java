package chap4;
/*
 * 임의로 1,2,3을 선택하여 가위바위보 중 한개를 출력하기
 * 
 * 1: 가위
 * 2: 바위
 * 3: 보
 */
public class Exam3 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*3)+1;
		System.out.println("num:"+num);
		switch(num) {
			case 1:System.out.println("가위");break;
			case 2:System.out.println("바위");break;
			case 3:System.out.println("보");break;
		}
	}
}
