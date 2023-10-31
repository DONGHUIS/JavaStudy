package chap5;
//arr배열의 행의 합과 열의합을 출력하자.
public class Exam5 {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,2,3,4,5},{10,20},{100}};
		
		/*
		 * {1 ,2 }
		 * {1, 2, 3, 4, 5}
		 * {10 ,20}
		 * {100}
		 */
		
		//배열 표시
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//행과 열의 합계 츌력하기
		int[] cols = new int[arr[1].length];
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				cols[j] += arr[i][j];
			}
			//System.out.println(i+"행의 합:"+sum);

		}
		for(int i=0;i<cols.length; i++) {
			System.out.println(i+"열의 합:"+cols[i]);
		}
		
		/*
		System.out.println("////선생님 풀이////");
		
		int[][] arr1 = {{1,2},{1,2,3,4,5},{10,20},{100}};
		int maxcol = 0 ; //최대 컬럼수
		
		for(int i=0;i<arr1.length;i++) {
			if(maxcol<arr1[i].length) {
				maxcol = arr1[i].length;
			}
		}
		int[] cols1 = new int[maxcol];
		
		for(int i=0; i<arr1.length;i++) {
			int sum = 0;
			for(int j= 0;j<arr1[i].length;j++) {
				sum+=arr1[i][j];
				cols1[j] += arr1[i][j];
			}
			System.out.println(i+"열의 합"+sum);
		}
		for(int i=0;i<cols1.length;i++) {
			System.out.println("열의 합 : "+ cols1[i]);
		}*/
		
	}
}
