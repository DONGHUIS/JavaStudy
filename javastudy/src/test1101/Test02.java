package test1101;
/*
2. Coin 클래스와 구동 클래스 구현하기
  Coin 클래스
   멤버변수 : int side (앞면:0, 뒷면:1), serialNo(동전번호), 
            sno(동전번호 생성을위한 클래스변수)
   멤버메서드 : void flip()
                Math.random() 메서드를 사용하여 side를 결정.

  구동클래스
    Coin 클래스의 객체를 10개 생성하기.
    객체생성시, 동전번호를 입력하고, flip() 메서드를 이용하여 각각의 동전이 앞면인지 뒷면인지
    여부를 출력하기

  [결과]
1번 동전 : 앞면
2번 동전 : 앞면
3번 동전 : 뒷면
4번 동전 : 앞면
5번 동전 : 뒷면
6번 동전 : 뒷면
7번 동전 : 뒷면
8번 동전 : 뒷면
9번 동전 : 뒷면
10번 동전 : 뒷면
전체 앞면 동전의 갯수 :3
전체 뒷면 동전의 갯수 :7
 */
class Coin2{
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

public class Test02 {
	public static void main(String[] args) {
		Coin2[] arr = new Coin2[10]; //코인 참조변수 10개를 저장한 배열 객체 
		int front = 0; int behind =0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Coin2(); //코인 객체 생성
			arr[i].cnt = ++Coin2.sno; //동전번호 
			arr[i].flip(); //앞뒷면 임의 선택하여 side값을 번경시킴.
			System.out.println(arr[i]); //toString() 메서드 호출			
			if(Coin2.side==0) { //동전갯수 
				front++;
			}else {
				behind++;
			}
		}
		
		
		System.out.println("전체 앞면 동전의 갯수:" + front);
		System.out.println("전체 뒷면 동전의 갯수:" + behind);
	}
}
