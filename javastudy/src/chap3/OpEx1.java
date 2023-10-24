package chap3;
/*
 * 단항 연산자 : 연산자의 피연산자가 한개인 경우
 * 	1, 증감연산자 : ++ , --
 * 		++ : 변수에 저장된 값을 1을 증가 
 * 		-- : 변수에 저장된 값을 1을 감소 
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x=5 ,y=5;
		x++; //x의값을 1증가 : 6 
		y--; //y의값을 1감소 : 4
		System.out.printf("x=%d,y=%d\n",x,y);
		
		++x; //x의값을 1증가 : 7
		--y; //y의값을 1감소 : 3
		System.out.printf("x=%d,y=%d\n",x,y);
		
		x=y=5;
		y=++x; //x에 1을 더해준후(6)  y=x를한다(6).
		System.out.printf("x=%d,y=%d\n",x,y);
		
		y=x++; //y=x를 먼저한후(6) x에 1을 더해준다.(7)
		System.out.printf("x=%d,y=%d\n",x,y);
		
		System.out.println();
		
		x=y=5;
		System.out.println("x="+ x++); //5  x의값 먼저 출력한후 증가
		System.out.println("x="+ ++x); //7  x의값 증가한후 출력
		System.out.println("y="+ y--); //5  y의값 먼저 출력한후 감소
		System.out.println("y="+ --y); //3  y의값 감소한후 출력
	}

}
