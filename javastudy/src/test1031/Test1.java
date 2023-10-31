package test1031;
/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오

[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class Test1 {
	public static void main(String[] args) {
		Card c = new Card();
		c.kind ="Heart";
		c.number=1;
		c.width=100;
		c.height=250;
		System.out.println(c);
		
		Card c1 = new Card();
		c1.kind ="Spade";
		c1.number=1;
		c1.width=100;
		c1.height=250;
		System.out.println(c1);
		
		Card c2 = new Card();
		c2.kind ="Heart";
		c2.number=1;
		c2.width=50;
		c2.height=80;
		System.out.println(c2);
		
		Card c3 = new Card();
		c3.kind ="Spade";
		c3.number=1;
		c3.width=50;
		c3.height=80;
		System.out.println(c3);
	}
}
