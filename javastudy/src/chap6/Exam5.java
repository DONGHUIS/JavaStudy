package chap6;
/*
 * SutdaCard 클래스 구현하기
 * 생성자 2개 필요
 * 멤버변수 : int num , boolean isKwang
 * 멤버메서드 : toString()
 * [결과]
 * 3
 * 1K
 */
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(int n ,boolean i){
		num=n;
		isKwang=i;
	}
	
	SutdaCard(){
		num=1;
		isKwang=true;
	}
	public String toString() {
		return num +((isKwang)?"K":"");
	}
}

public class Exam5 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,false);
		SutdaCard c2 = new SutdaCard();
		System.out.println(c1);
		System.out.println(c2);
	}
}
