package chap2;
/*
 * 다른 자료형 사이의 연산의 결과 자료형 
 *  큰자료형 <=  큰자료형 + 작은자료형
 */
public class VarEx5 {
	public static void main(String[] args) {
		int i1 = 100;
		int i2 = 200;
		int i3 = i1 + i2;  //int <= int + int
		float f1 = 10.0f;
		float f2 = i3 + f1; // float <= int + float 
		double d1 = f1 + 10.5;
		System.out.println("i3=" + i3);
		System.out.println("f2=" + f2);
		System.out.println("d1=" + d1);
		
		/*byte b1 = 10 ;
		short b2 = 20 ;
		short b3 = b1 + b2 ; 		//int <= byte + byte , int <= byte + short  */
		
		byte b3 = 10 ;
		short b4 = 20 ;
		short b5 = (short) (b3 + b4) ;
		char c1 = 'a';
		int c2 = c1 + 1 ; 
		
	}
}
