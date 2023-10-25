package chap4;
/*
 * 조건값 : 정수형값 또는 문자열값
 * switch(조건값){
 * 	  case 값1 : 문장1;
 * 	  case 값2 : 문장2;
 * 	  ....
 *    default : 그외 문장;
 *  }
 *  break : switch 구문종료
 */
public class SwitchEx1 {
	public static void main(String[] args) {
		int score = 100;
		switch(score/10) {
			case 10:
			case 9 : System.out.println("A학점");break;
			case 8 : System.out.println("B학점");break;
			case 7 : System.out.println("C학점");break;
			case 6 : System.out.println("D학점");break;
			default : System.out.println("F학점");
		}
		//60점이상이면 pass , 60점미만이면 Fail 출력
		switch(score/10) {
			case 10:
			case 9:
			case 8:
			case 7: 
			case 6:
				System.out.println("PASS");break;
			default:
				System.out.println("FAIL");break;
		}
	}
}
