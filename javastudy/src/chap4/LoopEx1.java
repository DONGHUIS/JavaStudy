package chap4;
/*
 * 반복문 : 조건문의 결과가 참인동안 문장들을 반복수행
 * 
 * 1, for(초기값 ; 조건문 ; 증감식){
 * 		문장들;
 * 		}				            <--------------------				
 *   for구문 실행 순서 : 1) 초기값 -> 2) 조건문  참(문장들)      -> 증감식 
 *   							        거짓(반복문종료) 
   
    2, while(조건문){
    	문장들
    }
    
    while 구문 실행 순서 
             <---------
    	 조건문   참 -> 문장들     
    	 		거짓 -> 반복문 종료
    
    3, do{
     	 문장들
     	 }while(조건문)
     
     do while 구문 실행 순서 
      문장들 -> 조건문     참 ->  문장들로 가서 다시 돌면 됨.
                     거짓  ->  반복문 종료
 */
public class LoopEx1 {
	public static void main(String[] args) {
		//1-5까지 숫자를 출력하기 
		//i 변수는 for 구문 내부에서만 사용이 가능한 지역변수
		System.out.println("for문 이용한 1-5출력");
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("while문 이용한 1-5출력");
		int i = 1 ;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("i=" +i);
		System.out.println("do~while문 이용한 1-5출력");
		i = 1;
		do {
			System.out.print(i);
			i++;
		}while(i<=5);
		System.out.println();
		System.out.println("i="+i);
	}
}
