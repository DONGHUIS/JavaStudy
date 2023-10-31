package chap5;
/*
 * 2차원 배열의 예쩨 
 * 2차원 배열은 1차원 배열의 참조변수의 배열임.
 * => 자바에서는 다차원(2차원이상)배열은 n-1차원 배열의 참조변수의 배열임.
 *   => 다차원배열은 배열의 배열로 표현함.
 */
public class ArrayEx8 {
	public static void main(String[] args) {
		//배열의 선언과 생성
		int[][] arr = new int[3][2];
		//초기화
		//int[][] arr[0]
		//int[]   arr[0]
		//int     arr[0][0] : 요소값	
		arr[0][0]= 10; arr[0][1]=20;
		arr[1][0]= 30; arr[1][1]=40;
		arr[2][0]= 50; arr[2][1]=60;
		//내용 출력하기
		//arr.length : 3 
		for(int i=0;i<arr.length;i++) { //i=0
			//arr[i].length : 2
			for(int j=0;j<arr[i].length;j++) { //j=0
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+","); //i=0 j= 0 -> 10
			}
			System.out.println();
		}
		System.out.println("1차원 배열 객체 번경하기");
		int[] arr1 = {1,2,3,4,5};
		arr[1] = arr1;
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr[i].length;j++) { 
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+","); 
			}
			System.out.println();
		
		}
		
		arr1[3] = 5000;
		System.out.println("arr1[3] 번경이후");
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr[i].length;j++) { 
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+","); 
			}
			System.out.println();
		
		}
	}
}
