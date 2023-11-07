package chap8;
/*
 * 추상메서드에 매개변수가 존재. 리턴타입이 없는 경우
 * (매개변수) -> {......}
 * 
 * 매개변수가 한개인 경우 () 생락가능.
 * 실행문장이 한개인 경우 {} 생락 가능.
 */
interface LambdaInterface2{
	void method(int a);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		LambdaInterface2 fi = (i)->{
			System.out.println(i*5);
		};
		fi.method(10);
		fi.method(2);
		fi=i->System.out.println(i*5);
		fi.method(10);
		fi.method(2);
		
		//제곱을 출력하는 람다식 구현하기
		fi= i-> System.out.println(i*i);
		fi.method(20);
		fi.method(10);
		
		//매개변수까지의 합 출력하는 람다식 구현하기
		fi=(a)->{
			int sum=0;
			for(int i=1; i<=a; i++) {
				sum+=i;
			}
			System.out.println("1~"+a+"까지의 합:"+sum);
			
		};
		fi.method(4);
			
		/////////////////////////////////////////////
		
		calc(fi,10); //1~10까지의 합 출력.
		calc(a->{
			int sum=0;
			for(int i=1; i<=a; i+=2) {
				sum+=i;
			}
			System.out.println("1~"+a+"까지의 합:"+sum);
		},10); //1~10까지의 짝수의 합 출력.
	}
	private static void calc(LambdaInterface2 fi,int a) {
		fi.method(a);
	}
	
}
