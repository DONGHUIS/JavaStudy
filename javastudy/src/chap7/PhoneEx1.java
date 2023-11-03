package chap7;
/*
 * 상속예제 : extends 예약어를 이용하여 구현 
 * -자손클래스의 객체 생성시 부모 객체를 먼저 생성한다.
 * -단일 상속만 가능하다. (자손클래스에서 단일 상속)
 * -모든 클래스는 Object 클래스를 상속 받는다.
 * -모든 클래스의 객체는 Object 클래스의 객체를 상속 받는다.
 *   => 모든 클래스의 객체는 Object클래스의 멤버를 호출 할 수 있다.
 */
class Phone{
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)System.out.println("전화걸기");
	}
	void receive() {
		if(power)System.out.println("전화받기");
	}
}

//SmartPhone클래스는 Phone클래스의 하위(자손,자식,child)클래스임.
//Phone클래스는 SmartPhone클래스의 상위(부모,super,parent,base)클래스임.
class SmartPhone extends Phone{
	void setApp(String name) {
		System.out.println(name+"앱을 설치함");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power=true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");
	}
}
