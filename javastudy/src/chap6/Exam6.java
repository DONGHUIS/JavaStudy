package chap6;
/**
 * Student2클래스 구현하기
 * 멤버변수 : 학번(stuno),국어(kor),수학(math),영어(eng)
 * 			이름(name)
 * 구동클래스에 맞도록 메서드와 생성자 구현하기
 */
class Student2{
	String name;
	int stuno;
	int kor;
	int math;
	int eng;
	
	int total() {
		return kor+math+eng ;
	}
	
	float avg() {
		return total()/3f;
	}
	
	Student2(String n,int s, int k, int m, int e){
		this.name = n;
		this.stuno = s;
		this.kor = k;
		this.math = m;
		this.eng = e;
	}
	Student2(String n,int s){
		this(n, s,0,0,0);
	}
	
	public String toString() {
		return "이름:"+name +"\n 학번:" +stuno +"\n 국어:" +kor
				+"\n 수학:" +math+"\n 영어:" +eng
				+"\n 총점:" +total() +"\n 평균:" +avg(); 
	}
}

public class Exam6 {
//	int num = 100;
	public static void main(String[] args) {
		Student2 s1 = new Student2("홍길동",1);
		Student2 s2 = new Student2("김삿갓",2,82,98,77);
		System.out.println(s1);
		System.out.println("===================");
		System.out.println(s2);
		System.out.println("===================");
//		System.out.println(this.num); //this참조변수는 인스턴스메서드에서만 가능하다.
	}
}
