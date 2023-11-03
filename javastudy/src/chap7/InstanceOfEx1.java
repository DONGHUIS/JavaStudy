package chap7;
/*
 * instanceof연산자 : 단항연산자
 *    객체와 참조변수의 관계를 리턴.
 *    
 *    모든 클래스의 객체는 Object객체를 포함한다. => 모든 클래스의 객체는 Object타입의 참조변수로 참조가능하다.
 */
public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		if(p instanceof Child2) {
			System.out.println("p참조변수의 객체는 Child2 참조변수로 참조가능");
			Child2 c = (Child2)p;
			System.out.println(c.x); //20
		}
		if(p instanceof Parent2) {
			System.out.println("p참조변수의 객체는 Parent2 참조변수로 참조가능");
		
		}
		if(p instanceof Object) {
			System.out.println("p참조변수의 객체는 Object 참조변수로 참조가능");
			Object o = p;
		}
		
	}
}
