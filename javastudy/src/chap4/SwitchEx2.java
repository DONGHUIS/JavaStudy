package chap4;
/*
 * 컴퓨터에서 난수(임의의 수)를 선택하여 상품 출력하기
 */
public class SwitchEx2 {
	public static void main(String[] args) {
		//num : 1~10사이의 임의의 정수값 저장
		int num = (int)(Math.random()*10)+1;
		//Math.random()	   : 0<= x <1.0 임의의 수를 리턴해준다.
		//Math.random()*10 : 0 <= x <10.0
		//(int)(Math.random()*10) : 0 <= x <= 9 임의의 정수
		// num					  : 1 <= x <=10 임의의 정수
		switch(num) {
		case 1: System.out.println("축하합니다. 자전거당첨입니다.");
		 		break;
		case 2 : System.out.println("축하합니다. usb당첨입니다.");
				break; 
		case 3 : System.out.println("축하합니다. 키보드 당첨입니다.");
		  		break;
		default : 
			System.out.println("광 다음기회에....");
		}
		System.out.print("num:"+num);
	}
}
