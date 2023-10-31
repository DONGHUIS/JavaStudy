package chap6;
/*
 * 선언 위치에 따른 변수의 종류
 * 							 선언위치       선언방법 					메모리 할당시점				메모리 할당위치
 *   클래스 변수				클래스 내부  	 static 자료형 변수명	    클래스 정보가 로드 될떄 		클래스 영역
 *   		     - 객체화 필요 없음. 모든 객체의 공통변수로 사용됨.
 *   			 - 클래스명,변수명.
 *   			 - 기본값으로 초기화
 *   인스턴스 변수 (객체변수)		클래스 내부		 자료형 변수명			    객체화시					힙 영역
 *   			 - 반드시 객체화 되어야함. 객체별로 다른 메모리 할당.
 *   			 - 참조 변수명. 변수명 호출
 *    			 - 기본값으로 초기화
 *   지역 변수 				메서드 내부		 자료형 변수명				선언문 실행시			    스택 영역
 *   			 - 메서드 ,블럭내에서만 사용가능함.
 *   			 - 기본값으로 초기화 안됨. 반드시 초기화 해야함.
 *   			 - 매개변수는 지역변수다.
 */
class Car{
	String color;//인스턴스 변수
	int number; //인스턴스 변수
	static int width =200;  //클래스 변수
	static int height=120; //클래스 변수
	
	public  String toString() {
		return color +":"+number+"("+width+","+height+")";
	}
}

public class CarEx1 {
	public static void main(String[] args) {
		System.out.println("자동차의 크기:"+Car.width+","+Car.height);
		//System.out.println("자동차의 색상:"+Car.color); //오류발생
		Car car1 = new Car();//지역변수
		car1.color="white";
		car1.number=1234;
		System.out.println("car1"+car1.toString()); //toString은 생략가능
		Car car2 = new Car();//지역변수
		car2.color="Black";
		car2.number=5678;
		System.out.println("car2"+car2.toString());
		Car car3 = new Car(); //지역변수
		car3.color="Red";
		car3.number=3456;
		System.out.println("car3"+car3.toString());
		car3.width=300; //static변수로 선언되있기떄문에 참조하지 않는게 좋다.
		Car.width =400; //staitc변수는 왼쪽과 같이 써야된다.
		car3.height=200;
		System.out.println("car1:"+car1.toString());
		System.out.println("car2:"+car2.toString());
		System.out.println("car3:"+car3.toString());
		
		int num=0; //지역변수
		System.out.println(num);
		int i =0 ;
		boolean b = true;
		if(b) {
			i=100;
		}else if(!b) {
			i=0;
		}
		System.out.println(i);
	}
}
