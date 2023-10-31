package chap6;
/**
 * 1,직사각형 클래스(Rectangle)구현하기 
 * 멤버변수 : 가로(width) 세로(height)
 * 멤버메서드 : void area() -> 널이 출력가능 
 * 멤버메서드 : void length() -> 둘레 출력가능 
 * 
 * 2,구동클래스(Exam.java) : main메서드가 존재하는 클래스 
 * -Rectangle클래스의 객체생성하여 r1참조변수로 참조하기
 *  가로,세로 길이를 10,5로 저장하기
 *  r1사각형의 넓이,둘레 출력하기
 */
class Rectangle{
	int width;
	int height;
	
	void area() {
		System.out.println(width * height);
	}
	void length() {
		System.out.println(2*(width + height));
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Rectangle3 re = new Rectangle3();
		re.width=10;
		re.height=5;
		
		System.out.print("넓이:");
		re.area();
		System.out.print("둘레:");
		re.length();
	}
	
	
	
}
