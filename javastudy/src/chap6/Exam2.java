package chap6;
/*
 * Rectangle 클래스 생성하기
 *  멤버변수 : 가로(width),세로(height),사각형번호(sno),생성된 사각형 갯수(cnt)
 *  멤버메서드 : 넓이(area) , 둘레(length) 출력
 *  		  toString : 1번사각형  : 가로 10 세로 20 생성된 사각형 갯수 1 ...
 */
class Rectangle2{
	int width;
	int height;
	int sno;
	static int cnt;
	void length() {
		System.out.println("둘레:"+((width+height)*2));
	}
	void area() {
		System.out.println("넓이:"+(width*height));
	}
	public String toString(){
		return sno+"번 사각형:" + "가로("+ width +") 세로("+ height + ")생성된 사각형 갯수("+cnt+")";
	}
	
}

public class Exam2 {
	public static void main(String[] args) {
		Rectangle2 rec1 = new Rectangle2();
		rec1.width = 10;
		rec1.height = 20;
		rec1.sno = ++Rectangle2.cnt;
		rec1.area();
		rec1.length();
		System.out.println(rec1);
		
		Rectangle2 rec2 = new Rectangle2();
		rec2.width = 20;
		rec2.height = 30;
		rec2.sno = ++Rectangle2.cnt;
		rec2.area();
		rec2.length();
		System.out.println(rec2);
		System.out.println(rec1);
	}
}
