package test1114;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/*
 * SutdaCard, SutdaDeck, Player를 이용하여 다음 구동 클래스를 완성하시오
 [결과]
[1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[6, 7, 5, 4, 5, 8, 9, 10, 2, 3, 10, 4, 1K, 6, 1, 7, 2, 3K, 9, 8K]

게임할 인원수를 입력하세요(최대:10)
5
1등:2번(5,4):9
1등:4번(9,10):9
3등:5번(2,3):5
4등:1번(6,7):3
4등:3번(5,8):3
 */
class SutdaCard{
	final int num;
	final boolean isKwang;
	SutdaCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwang=isKwang;
	}
	public String toString() {
		return num +((isKwang)?"K":"");
	}
}

class SutdaDeck{
	List<SutdaCard> cards ;
	static Map<String,Integer>jokbo;
	static { //static 초기화 블럭
		jokbo = new HashMap<String, Integer>();
		jokbo.put("KK", 4000);
		for(int i=1;i<=10;i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}
	
	SutdaDeck() {
		cards = new ArrayList<SutdaCard>();
		for(int i=0; i<20;i++) {
			cards.add(new SutdaCard(i%10+1, ((i==0||i==2||i==7)?true:false)));
			}
		System.out.println(cards);
		}
	
		SutdaCard pick(int idx) {
			return cards.remove(idx);
		}
		SutdaCard pick() {
			return cards.remove((int)(Math.random()*cards.size()));
		}
		void shuffle() {
			Collections.shuffle(cards);
			System.out.println(cards);
		}
}
class Player{
	String input;
	SutdaCard card1;
	SutdaCard card2;
	
	public Player(String input , SutdaCard card1, SutdaCard card2) {
		super();
		this.input = input;
		this.card1=card1;
		this.card2=card2;
	}
	
	public int getScore() {
		Integer score = 0;
		if(card1.isKwang && card2.isKwang) {
			score = SutdaDeck.jokbo.get("KK");
		}else {
			score = SutdaDeck.jokbo.get(""+card1.num+card2.num);
			if(score == null) {
				score = (card1.num+card2.num)%10;
			}
		}
		return score;
	}
	public String toString() {
		return input + "(" +card1+","+card2+") :"+ getScore();
	}

}
public class Test1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
	
		
		System.out.println("게임할 인원수를 입력하세요(최대:10)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			int input = scan.nextInt();
			List<Player> list = new ArrayList<>();
			list.add(new Player(input+"번",deck.pick(0),deck.pick(0)));
			input--;
			if(input>10) {
				System.err.println("게임 참가 최대인원수는 10명입니다.다시입력해주세요.");
			}
			if(input == 0) {
				break;
			}
			
			
			
			
			Collections.sort(list,(s1,s2)->s2.getScore()-s1.getScore());
			for(Player s : list) {
				System.out.println(s);
			}
			if(list.get(0).getScore()==list.get(1).getScore()) {
				System.out.println(list.get(0).input+","+list.get(1).input+" =>비김");
			}else {
				System.out.println(list.get(0).input +" => 승리");
			}
		
				
			

		}
		
		
	}
}
