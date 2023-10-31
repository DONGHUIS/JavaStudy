package test1031;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal() {
		return kor+math+eng;
	}
	
	float getAverage() {
		return kor+math+eng/3;
	}
	
	public String toString() {
		return no+"번"+ban+"반의 학생:"+name+"의 국어,영어,수학점수는 "+ kor + eng + math ;
		
	}
}
