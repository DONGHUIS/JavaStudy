package chap3;
/*
 * 단항연산자 : 논리부정연산자
 *   ! : !true == false , !false == true
 * 단항연산자 : 부호연산자 
 * 	 + : 현재부호를 유지 , 음수인 경우 음수를 유지 
 * 	 - : 현재부호를 번경 , 음수인 경우 양수로 번경
 */
public class OpEx2 {
	public static void main(String[] args) {
		//비교연산자
		System.out.println("true=" + !false);
		System.out.println("false=" + !true);
		System.out.println("5!=4 :" + (5!=4)); //비교연산자  != : 같지않다.
		System.out.println("5==4 :" + (5==4)); //비교연산자  == : 같다.
		
		//부호연산자
		int x = -10;
		System.out.println("+x=" + +x);//-10
		System.out.println("-x=" + -x);//10
		
		x=10;
		System.out.println("+x=" + +x); //10
		System.out.println("-x=" + -x); //-10
		
	}

}
