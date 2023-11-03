package test1101;
/*
 * Test2.java 소스의 Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.
 * [결과]
 * myCoin	youCoin
 * 앞면	앞면
 * 뒷면	앞면
 * 앞면	뒷면
 * 뒷면	앞면
 * 뒷면	앞면
 * 앞면	앞면
 * youCoin 승리  
 */
class Coin{
	static int side ; //동전의 면(0:앞면 , 1: 뒷면 )  => 멤버변수, 필드(field)
	int serialNo;
	static int sno;
	int cnt;
	
	void flip() {
		side = (int)(Math.random()*2); //동전의 앞면,뒷면 설정
	}
		
	public String toString() {
		return cnt+"번 동전 :"+(Coin2.side==0?"앞면":"뒷면");
	}
	
}

public class Test05 {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		
		int my = 0; int you=0;
		
		System.out.println("myCoin  youCoin");
		
		while(true) {
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side ==0) {
				System.out.print("앞면\t");
				my++;
			}else {
				System.out.print("뒷면\t");
				my=0;
			}
			if(youCoin.side==0) {
				System.out.print("앞면\n");
				you++;
			}else {
				System.out.print("뒷면\n");
				you=0;
			}
			if(my == 3 || you ==3) {
				break;
			}
			
		}
		System.out.println((my>you)?"당신이 이김":(my<you)?"당신이 짐":"비겼음");
	}
}
