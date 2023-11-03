package test1101;
/*
구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal 클래스를 구현하기
[결과]
원숭이:26살
사자:1살
사람:100살
*/
class Animal{
	String name;
	int age;
	
	Animal(String n,int a){
		this.name=n;
		this.age=a;
	}
	Animal(String n){
		this(n,1);
	}
	
	Animal(int a){
		this("사람",a);
	}
	
	void info() {
		System.out.println(name+":"+age+"살");
	}
}

public class Test03 {
	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		a1.info(); //info()메서드의 리턴타입 : void
		a2.info();
		a3.info();
	}
}
