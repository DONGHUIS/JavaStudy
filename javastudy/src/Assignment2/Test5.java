package Assignment2;

import java.util.Scanner;

/*
점수를 입력받아 
    95점 이상인 경우 A+ 90 ~ 94 : A0  
    89 ~ 85점 이상인 경우 B+ 80 ~ 84 : B0 
    79 ~ 75점 이상인 경우 C+ 70 ~ 74 : C0 
    69 ~ 65점 이상인 경우 D+ 60 ~ 64 : D0 
       그외는 F 로 출력하기.
    중첩 조건문을 이용하여 구현하기 
*/
public class Test5 {
	public static void main(String[] args) {
		System.out.println("점수입력:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score>=90) {
			if(95<= score) {
				System.out.println("A+");
			}else {
			System.out.println("A");
			}
		}else if(score>=80) {
			if(85<=score && score<=89){
				System.out.println("B+");
			}else{
				System.out.println("B");
			}
		}else if(score>=70) {
			if(75<=score && score<=79) {
				System.out.println("C+");
			}else{
				System.out.println("C");
			}
		}else if(score>=70) {
			if(65<=score && score<=69) {
				System.out.println("D+");
			}else {
				System.out.println("D");
			}
		}else {
			System.out.println("F");
		}
	}
}
