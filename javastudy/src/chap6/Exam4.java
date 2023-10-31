package chap6;
/**
 * Rectangle3.java소스의 Rectangle3클래스를 이용하여 구동클래스를 구현하기
 * 가로,세로길이가 20-50사이인 임의의 길이를 가진 사각형 5개 생성하기
 * 생성된 5개 사각형의 정보 출력
 * 5개 사각형의 넓이의 합과, 둘레의 합을 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		Rectangle3[] arr = new Rectangle3[5];
		int sum =0; //넓이의 합 구하는 변수
		int sum2 =0;//둘레의 합 구하는 변수
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=new Rectangle3();
			arr[i].width=(int)(Math.random()*31)+20;
			arr[i].height=(int)(Math.random()*31)+20;
			arr[i].sno = ++Rectangle3.cnt;
			sum += arr[i].area();
			sum2 += arr[i].length();
			
			System.out.println(arr[i]);
			System.out.print("넓이:"+arr[i].area());
			System.out.println(" 둘레:"+arr[i].length());
			
			
		}
		System.out.println(" 넓이의합:" +sum);
		System.out.println(" 둘레의합:" +sum2);
		
	}
}
