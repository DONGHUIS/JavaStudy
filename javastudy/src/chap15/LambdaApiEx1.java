package chap15;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Java API의 Functional Interface
 * Consumer 인터페이스 
 *  accept() 추상메서드 : 매개변수가 있고,리턴값은 없는 메서드
 */
public class LambdaApiEx1 {
	public static void main(String[] args) {
		
		Consumer<String> c1 = t -> System.out.println(t+8);
		c1.accept("java");
		
		BiConsumer<String,String> c2 = (t,u) ->System.out.println(t+u);
		c2.accept("java","8.0이후");
		
		DoubleConsumer c3 = d -> System.out.println("java"+d);
		c3.accept(8.0);
		
		ObjIntConsumer<String> c4 = (t,i) -> System.out.println(t+i);
		c4.accept("java", 8);
		
		IntConsumer c5 = x -> {
			int sum =0 ;
			for(int i=1;i<=x;i++) sum+=i;
				System.out.println("1부터"+x+"까지의 합:"+sum);
		};
		c5.accept(10);
		
		BiConsumer<String,String> c6 =(t,u)->System.out.println((t.compareTo(u)>0)?t:u);
		c6.accept("abc", "def");
		
//		BiConsumer<Integer, Integer> c7 = (t,u) -> System.out.println((t.compareTo(u)<0)?t:u);
		BiConsumer<Integer, Integer> c7 = (t,u) -> System.out.println((t<u)?t:u);
		c7.accept(100, 200);
		
	}
}
