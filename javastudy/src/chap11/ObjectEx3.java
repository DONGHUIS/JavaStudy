package chap11;
/*
 * Object 클래스 : hashCode메서드
 * 	hashcode : 원래의미는 JVM이 객체를 구별하기위한 고유의 값(참조값)
 * 		믈리적동등성 : 실제 같은 객체인 경우
 * 		논리적동등성 : 내용 기준으로 같은 객체로 판단하는 경우
 * 		논리적 동등성을 위해 오버라이딩이 필요함.
 * 
 * 두 객체가 논리적을 동등하다는 판단 기준
 * 1. equals 메서드의 결과가 true
 * 2. hashcode 메서드의 결과가 동일한 경우
 * 
 * equals 메서드 오버라이딩시 hashcode도 함께 오버라이딩을 권장함.
 * 
 */
public class ObjectEx3 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		if(s1==s2) {
			System.out.println("s1과 s2는 같은 객체임");
		}else {
			System.out.println("s1과 s2는 다른 객체임");
		}
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같은 내용의 객체임.");
		}else {
			System.out.println("s1과 s2는 다른내용의 객체임");
		}
		//String 클래스에서 오버라이딩됨.
		System.out.println("s1.hashcode():"+s1.hashCode());
		System.out.println("s2.hashcode():"+s2.hashCode());
		System.out.println("s1의 고유의 hashcode:"+
				System.identityHashCode(s1));
		System.out.println("s2의 고유의 hashcode:"+
				System.identityHashCode(s2));
		
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		System.out.println("e1.hashCode()"+e1.hashCode());
		System.out.println("e2.hashCode()"+e2.hashCode());
		System.out.println("e1의 고유의 hashcode:"+
				System.identityHashCode(e1));
		System.out.println("e2의 고유의 hashcode:"+
				System.identityHashCode(e2));
	}
}
