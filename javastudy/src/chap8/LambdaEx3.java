package chap8;
/*
 * 매개변수 , 리턴값이 모두 있는 경우
 * (x,y) -> {..........}
 * 문장에 return문장만 있는 경우 {},retunr 생락가능
 */
interface LambdaInterface3{
	int method(int x, int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		//매개변수 , 리턴값이 모두 있는 경우
		LambdaInterface3 fi = (x,y)->{
			return x*y;
		};
		System.out.println("두수의 곱:"+fi.method(2, 3));
		
		//문장에 return문장만 있는 경우 {},retunr 생락가능
		fi=(x,y)->x*y;
		System.out.println("두수의 곱:"+fi.method(2, 3));
		
		//두수의 합을 구하는경우
		fi=(x,y)->x+y;
		System.out.println("두수의 합:"+fi.method(2, 3));
		
		//두수중 큰값 
		fi=(x,y)->(x>y)?x:y;
		System.out.println("두수의 큰값:"+fi.method(12, 993));
		
		//두수중 작은값 
		fi=(x,y)->(x<y)?x:y;
		System.out.println("두수의 작은 값:"+fi.method(13, 201));
		
	}
}
