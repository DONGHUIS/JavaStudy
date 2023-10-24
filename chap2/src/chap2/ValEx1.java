package chap2;

public class ValEx1 {

	public static void main(String[] args) {
		int num; 	//변수의 선언
		num = 100;	//변수의 초기화
		
		//num변수를 console로 출력
		System.out.println(num);
		num = 200; //값 번경
		System.out.println(num);
		
		//int num = 100;  -> 앞서 num을 선언하였기떄문에 두번 선언하면 안되기 때문에 오류발생.
		int num2 = 100; //변수의 선언과 초기화를 동시에 함.
		System.out.println(num2);
		
		//double형 변수 d를 선언하고 10.5값으로 초기화하기. 화면 출력하기
		double d = 10.5;
		System.out.println(d);
		
		//문자형변수 c를 선언하고 A값으로 초기화하기. 화면 출력하기.
		char c = 'A';
		System.out.println(c);
		
		//논리형 변수 b를 선언하고 true값으로 초기화하고 출력하기. 
		boolean b = true;
		System.out.println(b);
		
		num =  c; //형변환 
		System.out.println(num); // A 아스키 코드값은 65이므로로 65으로 출력
		
		//2진 리터널값 저장하기 
		num = 0b1011;
		System.out.println(num); //11
		
		//8진 리터널값 저장하기
		num = 011; //8*1 + 1*1 =>  9
		System.out.println(num); //9
		
		//10진 리터널값 저장하기 
		num = 11 ; // 10*1 + 1*1 => 11
		System.out.println(num); //11
		
		//16진 리터널값 저장하기 
		num = 0x11; //16*1 + 1*1 => 17
		System.out.println(num);//17
	}

}
