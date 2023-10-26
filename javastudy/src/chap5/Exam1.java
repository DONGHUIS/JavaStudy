package chap5;

import java.util.Scanner;

/*
 * int값을 5개 저장할 수 있는 배열을 생성하고 ,
 * 화면에서 정수값 5개를 입력받아, 
 * 입력받은 수의 합계 , 평균 ,최대값,최소값,최대값의 인덱스,최소값의 인덱스 출력하기.
 */
public class  Exam1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		System.out.println("정수 5개를 입력.");
		Scanner scan = new Scanner(System.in);
		
		double avg = 0; 		//평균
		int max = -2147483648;	//최대
		int min =2147483647;	//최소
		int maxIndex= 0;	 	//최대값인덱스
		int minIndex= 0;		//최솟값인덱스
		int total = 0;  		//합
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			total += arr[i];
			//최대 최소 인덱스 
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
			if(min>arr[i]) {
				min=arr[i];
				minIndex=i;
			}
			
			/*if(arr[maxIndex]<arr[i]) maxIndex=i;
			  if(arr[minIndex]>arr[i]) minIndex=i;
			  System.out.println("최대:"+arr[maxIndex]);		
			  System.out.println("최소:"+arr[minIndex])*/
			
		}
		
		avg = (double)total/arr.length;
		
		System.out.println("합계:"+total);		
		System.out.println("평균:"+avg);		
		System.out.println("최대:"+max);		
		System.out.println("최소:"+min);		
		System.out.println("maxIndex:"+maxIndex);		
		System.out.println("minIndex:"+minIndex);		
	}
}
