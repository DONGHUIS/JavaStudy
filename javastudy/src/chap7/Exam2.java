package chap7;
/*
 * Buyer 클래스 
 * 멤버변수 : money =500 , point 
 * 		   Product[] items = new Product[5] =>장바구니
 *         int cnt => 구매갯수
 *  멤버메서드
 *  	void buy(Product p)
 *  		1,p상품의 가격을 money에서 차감
 *   		2,p상품의 포인트를 point 증가
 *          3,items에 p제품 추가, cnt증가
 *          4,p제품의 이름 출력
 *       void summary()
 *       1,구매제품전체의 금액 합계,포인트 합계출력
 *       2,전액 출력
 *       3,전체 구매 물품 이름 출력
 */
class Buyer {
	int money=500 ,point;
	int cnt ;
	Product[] items = new Product[3];
	
	void buy(Product p) {
		money -= p.price ;
		point += p.point;
		items[cnt++]=p;
		System.out.println(p+" 구입");
	}
	
	void summary() {
		//1,구매제품전체의 금액 합계,포인트 합계출력
		int totPrice=0,totPoint=0;
		for(int i=0;i<cnt;i++) {
			totPrice += items[i].price;
			totPoint += items[i].point;
		}
		System.out.println("구매금액합계:"+totPrice);
		System.out.println("구매포인트합계:"+totPoint);
		//2,잔액출력
		System.out.println("구매 잔액:"+money);
		//3,전체 구매 물품 이름 출력
		System.out.println("전체 구매 물품 목록");
		for(Product p:items) {
			System.out.print(p+",");
		}
		System.out.println();
	}
	
}

public class Exam2 {
	public static void main(String[] args) {
		Tv t = new Tv();  
		Computer c = new Computer();
		Iphone h = new Iphone();
		Buyer b = new Buyer();
		b.buy(t);		
		b.buy(c);		
		b.buy(h);	
		b.summary();
		System.out.println("main Buyer 잔액:"+b.money);
		System.out.println("main Buyer 포인트:"+b.point);		
	}
}
