package chap5;

public class ArrayEx1 {
	public static void main(String[] args) {
		
		//1,배열의 선언
		int[] arr;		//참조변수 : 객체를 참조할 수 있는 변수
		
		//2, 배열객체 생성
		arr = new int[5]; //new 예약어 - 1,객체생성(int값 5개 저장할수있는 변수를 할당,length상수값 설정.)
						  //	       2,기본값 초기화 - 숫자형:0 , boolean : false , 그외 :null
		//배열값저장
		arr[0]=10;
		arr[1]=20;
		
		//배열의 값 조회
		//arr.length : 5 저장 
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		//배열선언,생성
		int[] arr2 = new int[3];
		
		//배열의 값저장
		arr2[0] =100;
		arr2[1] =200;
		
		//배열의 값조회
		//arr2.length : 3 
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		arr2 =arr;
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		arr[3] = 1000;
		System.out.println("arr[3]=1000 실행후=============");
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		
		//개선된 for문
		//인덱스(첨자 사용 안됨) : 요소의 값만 사용가능함.
		//인덱스 사용이 필요한 경우 기존의 for 구문으로 사용해야함.
		for(int a:arr) {
			System.out.println(a);
		}
	}
}
