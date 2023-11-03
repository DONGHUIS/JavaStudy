package chap7;
/**
 *  오버라이딩 예제
 *    오버라이딩 : 메서드의 재정의,상속관계에서 가능함.
 *      -부모클래스의 메서드를 자손클래스에서 다시 구현함. => 재정의 
 *      -부모클래스 메서드의 선언부와 자손클래스 메서드의 선언부가 같아야함.
 *      -단, 접근제어자는 넓은 범위로 가능.
 *      -단, 예외처리는 좁은 범위로 가능.
 *    
 */
class Bike{
	int wheel;
	
	Bike(int wheel){
		this.wheel=wheel;
	}
	String drive() {
		return "폐달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
}
class AutoBike extends Bike{
	boolean power;
	
	AutoBike(int wheel){
		super(wheel);
	}
	void power() {
		power = !power;
	}
	@Override //어노테이션. 오버라이딩 검증을 위한 어노테이션
	String drive() { //메서드의 재정의(오버라이딩) - 부모의 메서드를 쓰면 폐달을 밟는다이기떄문에 autobike의 기능이랑 다르기떄문에 재정의해서 사용해준다.
		if(power) {
			System.out.println(super.drive()); //부모객체에있는 메서드를 쓰고 싶으면 super.drive()를 쓰면 같이 쓸수있다.
			return "출발버튼을 누른다";
		}else {
			return "전원을 켜라";
		}
	}
	/* => 오버라이딩은 부모클래스의 메서드와 선언부가 같아야 한다. 리턴타입이 달라서 오류발생
	 void drive(){
	 	system.out.println("출발버튼을 누른다");
	 }
	 */
}

public class OverridingEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		ab.power();
		System.out.println(ab.drive());
	}
}
