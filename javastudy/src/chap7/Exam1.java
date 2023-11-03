package chap7;
/*
 * Product클래스
 *  멤버변수 : 가격(price) , 포인트(point)
 *    생성자 : 가격을 입력받아 가격의 10%를 포인트로 적립
 *    
 *  Tv클래스 Product클래스의 하위클래스
 *     가격 : 100 
 *     toString :  Tv리턴
 *     
 *   Computer클래스 Product클래스의 하위클래스
 *     가격 : 200
 *     toString :  Computer리턴
	Phone클래스 Product클래스의 하위클래스
 *     가격 : 150 
 *     toString :  Phone리턴
 */
class Product{
	int price;
	int point;
	
	Product(int p){
		this.price=p;
		point =price/10;
	}
	
}	


class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer"  ;
	}
}

class Iphone extends Product{
	Iphone(){
		super(150);
	}
	public String toString() {
		return "Iphone"  ;
	}
}



public class Exam1 {
	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		Iphone h = new Iphone();
		System.out.printf("Tv의 가격:%d,포인트:%d\n",t.price ,t.point);
		System.out.printf("Computer의 가격:%d,포인트:%d\n",c.price,c.point);
		System.out.printf("Iphone의 가격:%d,포인트:%d\n",h.price,h.point);
		//Product타입의 배열로 저장
		Product arr[] = new Product[3];
		arr[0]=t;
		arr[1]=c;
		arr[2]=h;
		int totalSum = 0;
		int pointSum =0;
		for(Product p : arr) {
			totalSum += p.price;
			pointSum += p.point;
		}
		
		System.out.println("제품가격의 합:"+totalSum);
		System.out.println("제품포인트의 합:"+pointSum);
		
		totalSum = 0;
		pointSum =0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= new Product(i);
			arr[i].price += totalSum;
			arr[i].point += pointSum; 
		}
		System.out.println("제품가격의 합:"+totalSum);
		System.out.println("제품포인트의 합:"+pointSum);
		
	}
}