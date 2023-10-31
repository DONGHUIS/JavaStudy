package chap6;
/**
 * Exam2.java소소의 Rectangle 클래스 이용하여 구동클래스 구현하기 
 * 가로,세로길이가 20~50사이인 임의의 길이를 가진 사각형 5개를 생성하고
 * 각각의 넓이,둘레,정보 출력하기
 */
public class Exam3 {
	public static void main(String[] args) {
		//arr : Rectangle2 객체를 참조할 참조변수 5개를 배열로 저장함.
		Rectangle2[] arr = new Rectangle2[5]; 
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = new Rectangle2(); //객체화
			arr[i].width=(int)(Math.random()*31)+20;
			arr[i].height=(int)(Math.random()*31)+20;
			arr[i].sno = ++Rectangle2.cnt; //사각형 번호
			arr[i].area(); //넓이 출력
			arr[i].length();//둘레 출력
			System.out.println(arr[i]);//사각형 정보 출력
		}
		for(Rectangle2 r :arr)
			System.out.println(r);
	}
}
