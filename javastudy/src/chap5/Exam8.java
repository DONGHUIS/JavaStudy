package chap5;
/*
   11*11크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기
	
 */
public class Exam8 {
	public static void main(String[] args) {
		/*
		for(int i=0; i<11; i++) {
			for(int j=0; j<11;j++) {
				if(i==j) {
					System.out.print("X");
				}else if(i+j ==10) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}*/
		
		
		//배열을 사용
		char[][] ex = new char[11][11];
		for(int i=0; i<ex.length; i++) {
			for(int j=0; j<ex[i].length;j++) {
				if(i==j) {
					ex[i][j]='X';
				}else if(i+j ==10) {
					ex[i][j] ='X';
				}else {
					ex[i][j]=' ';
				}
				System.out.print(ex[i][j]);
			}
			System.out.println();
		}

	}
}
