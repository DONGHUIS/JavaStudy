package chap3;
/*
 *  대입연산자 : = , += , -= , *= , ...
 *  
 *  lvalue(좌측변수) = rvalue(우측값,변수 ,수식)
 *  우측의 값의 좌측변수에 대입하여 저장하기 
 */
public class OpEx7 {
	public static void main(String[] args) {
		int num = 100;  //lvalue num 변수에 100을 대입 저장.
		System.out.println(num); // 100 
		num += 10; // num = num + 10
		System.out.println(num); //110
		num -= 10; //num = num - 10 
		System.out.println(num); //100
		num *= 5; //num = num * 5 
		System.out.println(num); //500
		num /= 10; //num = num /10
		System.out.println(num); //50
		num %= 3; //num = num % 3 
		System.out.println(num); //2 
		num += 2+3; // num= num = (2 +3)
		System.out.println(num); //7
		num *= 2+3; // num= num * (2 +3)
		System.out.println(num); //35
		
		byte b =1 ;
		b*=2;
		//b= b*2;
		System.out.println(b);//2
		b*=2;
		System.out.println(b);//4
		b*=2;
		System.out.println(b);//8
	}

}
