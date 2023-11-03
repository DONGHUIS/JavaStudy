package chap7;
/*
 * final 변수 : 번경불가 변수 => 상수. goto,const예약어 사용안함.
 * 			   상수명명권장 : 대문자로 표시
 */
class FinalValue{
	final int NUM;
	FinalValue(int num){
		this.NUM=num; //명시적초기화가 안된경우, 생성자에서 한번은 초기화 가능.
					  //객체별로 다른 상수값 가능.
	}
}
public class FinalValueEx {
	public static void main(String[] args) {
		final int NUM = 100; //상수
//		NUM = 200; //번경불가
		System.out.println(NUM);
		System.out.println(Math.PI);
		
		final int MAX; //상수 설정시 초기화 하지않은경우 한번은 번경은 가능하다.
//		MAX=100; //정상
//		MAX=100; //오류
//		System.out.println(MAX);//초기화 필수
		FinalValue fv1 = new FinalValue(10);
//		fv1.NUM=200; //상수값 번경불가
		FinalValue fv2 = new FinalValue(20);
		System.out.println("fv1.NUM:"+fv1.NUM);
		System.out.println("fv2.NUM:"+fv2.NUM);
		//final변수를 가진 배열을 만들어보자
		final int[] arr = {10,20,30,40,50};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		arr[0]=100;
		arr[1]=200;
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		arr = new int[] {100,200,300}; //arr에 새로운 배열 객체로 번경 불가
	}
}
