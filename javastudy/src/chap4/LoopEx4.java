package chap4;
/*
 * break : switch,반복문에서 구문을 벗어남.
 * continue : 반복문의 처음으로 이동.
 */
public class LoopEx4 {
	public static void main(String[] args) {
		for(int i=2; i<=9;i++) { 
			System.out.println("\n"+i+"단");
			for(int j=2; j<= 9; j++) {
				//if(j==5) break; //break가 속한 반복문을 빠짐.
				if(j==5) continue; //continue 이시점에서 바로 반복문의 처음으올 이동. 바로 올라가므로 아래문장은 실행안함.
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
