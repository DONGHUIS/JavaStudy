package chap11;
/*
 *  [결과]
 *  다른 카드임
 *  같은 종류 카드임
 */

class Card{
	String kind;
	int number;
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	//equals 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card e = (Card)obj;
			return kind.equals(e.kind) && number ==e.number;
		}else return false;
	}
	//toString 오버라이딩
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade",1);
		Card c2 = new Card("Spade",1);
		if(c1 == c2) {
			System.out.println("같은 카드임");
		}else {
			System.out.println("다른 카드임");
		}
		if(c1.equals(c2)) {
			System.out.println("같은 종류 카드임");
		}else {
			System.out.println("다른 종류의 카드임");
		}
	}
}
