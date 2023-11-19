package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * Function,ToIntFunction을 이용하여 다음 결과가 나오도록 프로그램 작성하기.
 * [결과]
 * 이름목록 : 홍길동,김삿갓,이몽룡,김자바,박자바
 * 나이목록 , 10,30,15,25,20
 * 총나이합산 : 100
 * 나이 평균 : 20.0
 */
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return  name +","+age ;
	}
}

public class Exam1 {
	static List<Person> list = Arrays.asList(new Person("홍길동",10),
											 new Person("김삿갓",20),
											 new Person("이미자",30));
	public static void main(String[] args) {
			System.out.print("이름목록:");
			printString(t->t.name);
			System.out.print("나이목록:");
			printInt(t->t.age);
			System.out.print("총 나이합산:");
			printTot(t->t.age);
			System.out.print("나이 평균:");
			printAvg(t->t.age);
	}
	
	static void printString(Function<Person,String> f) {
		for(Person p : list)System.out.print(f.apply(p)+",");
		System.out.println();
	}
	
	static void printInt(ToIntFunction<Person>f) {
		for(Person p : list)System.out.print(f.applyAsInt(p)+",");
		System.out.println();
	}
	
	static void printTot(ToIntFunction<Person>f) {
		int sum=0;
		for(Person p : list)sum+=f.applyAsInt(p);
		System.out.println(sum);
	}
	static void printAvg(ToDoubleFunction<Person>f) {
		double sum = 0;
		for(Person p:list)sum+=f.applyAsDouble(p);
		System.out.println(sum/list.size());
	}
}
