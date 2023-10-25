package Assignment2;

import java.util.Scanner;

/*
시스템과 주사위 숫자 비교하기
시스템의 주사위 값을 저장하고,
사용자의 주사위 값도 임의의값으로  시스템의 값과 비교하여, 
시스템의 주사위 값이 크면 시스템 승리
사용자의 주사위 값이 크면 사용자 승리
시스템과 사용자의 주사위값이 같으면 동점입니다.
[결과]
시스템 주사위값 :3,사용자 주사위값:5=>사용자 승리.   
*/
public class Test3 {
	public static void main(String[] args) {
		System.out.println("주사위번호(1~6) 사이의 숫자중 하나만 입력.");
		Scanner scan = new Scanner(System.in);
		int userNumber = scan.nextInt();
		int systemNumber = (int)(Math.random()*6)+1;
		int system = systemNumber;
		
		if(system==userNumber) {
			System.out.println("본인은"+userNumber+"이고 시스템번호는 "+system+"이(가) 컴퓨터이므로 숫자가 같으므로 동점입니다.");
		}else if(system > userNumber) {
			System.out.println("본인은"+userNumber+"이고 시스템번호는 "+system+"이(가) 컴퓨터이므로 컴퓨터가 이겼습니다.");
		}else if(system<userNumber) {
			System.out.println("본인은"+userNumber+"이고 시스템번호는 "+system+"이(가) 컴퓨터이므로 당신이 이겼습니다.");
		}
		
		
	}
}
