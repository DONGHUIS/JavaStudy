package chap13;

import java.util.HashSet;
import java.util.Set;

/*
 * Student 클래스 
 * 1,멤버 변수 : 학번(studno),이름(name),전공(major)
 * 2,멤버 메서드 : 학생정보를 출력하도록 toString메서드 오버라이딩
 * 3,학번과 이름이 같은경우 같은학생으로 인식되도록하기.
 * 4,생성자는 멤버변수를 받아서 객체 생성하기
 */
class Student{
	String studno;
	String name;
	String major;
	
	Student(String studno,String name,String major){
		super();
		this.studno=studno;
		this.name=name;
		this.major=major;
	}
	@Override
	public String toString() {
		return "학번:"+ studno +"/이름:"+ name +"/전공:"+ major;
	}
	
	@Override
	public int hashCode() {
		return studno.hashCode()+name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return studno.equals(s.studno) && name==s.name;
		}else return false;
	}
	
}

public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","홍길동","경영"));
		set.add(new Student("2345","홍길순","경영"));
		set.add(new Student("2345","홍길순","컴공"));
		set.add(new Student("1234","홍길동","통계"));
		set.add(new Student("4567","홍길동","경영"));
		System.out.println("등록 학생수 : "+set.size());
		System.out.println("등록학생===");
		for(Student s: set) {
			System.out.println(s);
		}
	}
}
