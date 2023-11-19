package chap15;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 *  Supplier 인터페이스
 *   매개변수는 없고 , 리턴값은 존재함.
 *   T get XXX() 추상 메서드를 가짐.
 */
public class LambdaApiEx2 {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> "java";
		System.out.println(s1.get());
		//IntSupplier : 정수값을 리턴
		//IntSupplier를 이용하여 임의의 주사위값을 리턴.
		IntSupplier j1 =() ->(int)(Math.random()*6)+1;
		System.out.println(j1.getAsInt());
		
		IntSupplier s2 = () -> {
			int sum=0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			return  sum;
		};
		System.out.println(s2.getAsInt());
			
	}
}
