package chap9;
/*
 * 열거형
 */
public class EnumEx1 {
	public enum Car{ //열거형 객체
		AVANTE,SONATA,GRANDEUR,K3,G90 //미리 객체를 생성하여 설정
	}
	
	public static void main(String[] args) {
		Car car = Car.GRANDEUR;
		System.out.println(car);
		Car[] cars = Car.values();
		for(Car c : cars) {
			//c.ordinal() : 열거형 객체의 순서를 나타내주는 함수. 0부터 시작
			System.out.println(c+":"+c.ordinal());
		}
		if(car instanceof Object) {
			System.out.println("car객체는 Object 객체다");
		}
	}
}
