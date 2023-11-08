package test1107;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
-1 부터 100까지의 숫자가 아닌 경우 : 1 과 100사이의 숫자만 입력하세요 메세지출력 
- 숫자가 입력이 안된 경우 :  숫자만 입력하세요  메세지 출력
계속 입력을 받는다.
몇번의 입력만에 숫자를 맞추었는지 출력하기.
단 입력 오류된 입력도 입력 건수에 포함된다.

1. 임의의 수를 저장
2. 반복문으로 데이터 입력 받기.
   정답과 비교
3. 입력횟수 증가         
*/
public class Test1 {
	public static void main(String[] args) {
		int system = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		//System.out.println(system);
		System.out.println("생각한 숫자를 입력하세요.(1~100):");
		int count =1; //입력한 횟수 저장.
		while(true) {
			try {
				int num = scan.nextInt();
				//1~100사이의 정수가 입력된 경우만 실행.
				if(0<num && num<101) {
					if(system>num) {
						System.out.println("정답보다 작네요.숫자를 올리세요.");
						count++;
					}else if(system<num) {
						System.out.println("정답보다 큽니다.숫자를 내리세요.");
						count++;
					}else if(system == num) {
						System.out.println("축하합니다."+count+"번 만에맞췄습니다.");
						break;
					}
				}else {
					throw new Exception("입력가능한 범위가 아니네요.다시입력하세요.");//예외 발생
				}
			}catch (InputMismatchException e) {
				scan.next();
				System.out.println("정수만 입력하세요.");
				count++;
				continue; //반복문 처음으로 제어 이동
				//e.printStackTrace();
			}catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
				//e.printStackTrace();
			} 
		}
	}
}
