package chap11;
/*
 * Math 클래스 : 수치계산관련 메서드,상수(원주율(PI),자연로그(E))를 멤버로 가진다.
 * 			   final클래스
 * 			   객체생성못함 : 생성자의 접근제어자가 private임.
 * 			   => 모든 멤버가 staitc임.
 */
public class MathEx1 {
	public static void main(String[] args) {
		//abs() : 절대값
		System.out.println("Math.abs(5):"+Math.abs(5));
		System.out.println("Math.abs(-5):"+Math.abs(-5));
		System.out.println("Math.abs(3.14):"+Math.abs(3.14));
		System.out.println("Math.abs(-3.14):"+Math.abs(-3.14)+"\n");
		
		//ceil(),floor(),rint() :  근사정수(가까운 정수)
		System.out.println("///ceil() : 현재 숫자보다 큰 근사정수///");
		System.out.println("Math.ceil(5,4):"+Math.ceil(5.4)); //6
		System.out.println("Math.ceil(-5.4):"+Math.ceil(-5.4)+"\n"); //-5
		
		System.out.println("//floor() : 현재 숫자보다 작은 근사정수 //");
		System.out.println("Math.floor(5.4):"+Math.floor(5.4)); //5
		System.out.println("Math.floor(-5.4):"+Math.floor(-5.4)+"\n");//6
		
		
		System.out.println("////rint() :가장 가까운 근사정수//");
		System.out.println("Math.rint(5.4):"+Math.rint(5.4));//5
		System.out.println("Math.rint(-5.4):"+Math.rint(-5.4)+"\n");//-5
		
		
		System.out.println("////max(),min() : 최대 최소//");
		System.out.println("Math.max(5,4):"+Math.max(5, 4));
		System.out.println("Math.max(5.3,5.4):"+Math.max(5.3, 5.4));
		System.out.println("Math.min(5,4):"+Math.min(5, 4));
		System.out.println("Math.min(5.3,5.4):"+Math.min(5.3, 5.4)+"\n");
		
		
		System.out.println("//round() : 반올림//");
		System.out.println("Math.round(5.4):"+Math.round(5.4));
		System.out.println("Math.round(5.5):"+Math.round(5.5));
		
		
		System.out.println("//random() :  난수 , 임의의수 , 0<= x < 1.0//");
		System.out.println("Math.random():"+Math.random());
		
		//sin(),cos(),tan() : 삼각함수. 라디안 단위
		//Math.PI/2라디안 : 90도
		System.out.println("Math.sin(Math.PI/2):"+Math.sin(Math.PI/2));
		System.out.println("Math.cos(Math.PI/2):"+Math.cos(Math.PI/2));
		System.out.println("Math.tan(Math.PI/4):"+Math.tan(Math.PI/4));
		//cos60도 
		System.out.println("Math.cos(Math.toRadians(60)):"+Math.cos(Math.toRadians(60)));
		
		//도 <= 라디안
		System.out.println("Math.toDegrees(Math.PI):"+Math.toDegrees(Math.PI));
		
		//log함수 
		System.out.println("Math.log(Math.E):"+Math.log(Math.E));
		
		//sqrt() : 제곱근
		System.out.println("Math.sqrt(25):"+Math.sqrt(25));
		
		//pow() : 제곱 
		System.out.println("Math.pow(5,3):"+Math.pow(5, 3));
	}
}
