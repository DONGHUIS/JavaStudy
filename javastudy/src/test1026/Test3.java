package test1026;
/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
*/
public class Test3 {
	public static void main(String[] args) {
		int sum = 0 ;
		
		for(int i=1; i<=10; i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	}
}
