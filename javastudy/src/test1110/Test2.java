package test1110;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
화면에서 여러개의 자연수를 입력받아(0을 입력시 입력종료) 이들 중 
홀수 인 자연수들만 이루어진 List 객체에 저장
List  객체의 요소의 합을 구하고,
홀수 중 최대값, 최소값, 중간값 을 찾는 프로그램을 작성하기
단 자연수가 아닌 경우가 입력되면 무시한다.
홀수 들로만 이루어진 List 객체를 생성하여 출력하기

최대값과 최소값 :
Collections.max(list)와 Collections.min(list) 함수를 이용한다
중간값 :
 요소의 갯수가 홀수인 경우 : 가운데 값
 요소의 갯수가 짝수인 경우 : 가운데 값 2개의 평균
 
 [결과]
자연수를 입력하세요 종료(0)
12 77 38 41 53 92 85 aaa 0
[77, 41, 53, 85]의 합:256
홀수의 최대값:85
홀수의 최소값:41
홀수의 최대값 위치:3
홀수의 최소값 위치:1
입력된 홀수 목록:[77, 41, 53, 85]
중간값 :65.0
*/
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("자연수를 입력하세요 종료(0)");
		int sum=0;

		while(true) {
			try {
				int input = scan.nextInt();
				
				if(input == 0) {
					break;
				}
				
				if(input%2!=0) {
					list.add(input);
					sum+=input;
				}
			} catch (InputMismatchException e) {
				scan.next();
				continue;
			}	
			
				
		}
		//최댓값 인덱스 구하기
//		int maxIndex = 0;
//		for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > list.get(maxIndex)) {
//                maxIndex = i;
//            }
//        }
        
		//최소값 인덱스 구하기
//        int minIndex = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < list.get(minIndex)) {
//            	minIndex = i;
//            }
//        }
		
		System.out.println(list+"의 합 :"+sum);
		System.out.println("홀수의 최댓값:"+Collections.max(list));
		System.out.println("홀수의 최소값:"+Collections.min(list));
		System.out.println("홀수의 최대값 위치:"+list.indexOf(Collections.max(list)));
		System.out.println("홀수의 최소값 위치:"+list.indexOf(Collections.min(list)));
		System.out.println("입력된 홀수 목록:"+list);
		Collections.sort(list);
		System.out.println(list);
		System.out.print("중간값:");
		if(list.size()%2==1) {
			System.out.print(list.get(list.size()/2));
		}else {
			double m = (list.get(list.size()/2-1)+list.get(list.size()/2))/2.0;
			System.out.print(m);
		}
		
	}
}
