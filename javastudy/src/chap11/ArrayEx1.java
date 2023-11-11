package chap11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays 클래스 : 배열의 복사 , 비교 , 정렬 기능을 가진 클래스
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"홍길동","이몽룡","김삿갓"};
		Integer[] arr11 = {1,2,3,4,5};
		for(String a: arr1) {
			System.out.print(a+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr11));
		//arr1의 배열의 값을 김길동으로 채우기
		Arrays.fill(arr1,"김길동");
		for(String a : arr1) {
			System.out.print(a+",");
		}
		System.out.println();
		
		//arr1의 배열의 값을 김길동으로 채우기
		Arrays.fill(arr1,1,3,"홍길동전");
		for(String a : arr1) {
			System.out.print(a+",");
		}
		System.out.println();
		
		//arr1 배열 정렬하기
		Arrays.fill(arr1,1,2,"김동휘");
		Arrays.sort(arr1);
		for(String a:arr1) {
			System.out.print(a+",");
		}
		System.out.println();
		
		//arr1 배열 내림찬순 정렬하기(Comparator.reverseOrder())
		Arrays.fill(arr1,2,3,"이동휘");
		Arrays.sort(arr1,Comparator.reverseOrder()); 
		for(String a:arr1) {
			System.out.print(a+",");
		}
		System.out.println();
		
		//arr1 배열을 복사하기
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		for(String a : arr2) {
			System.out.print(a+",");
		}
		System.out.println();
		
		//arr1 , arr2 배열을 출력하자.
		//Arrays.toString(arr1)을 이용하면 for문으로 안돌려도 배열을 조회할수 있다.
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
