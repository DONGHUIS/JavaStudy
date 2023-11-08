package test1108;
/*
[결과] 
 HTML=>홍길동
 CSS=>김삿갓
 JavaScript=>이몽룡
 JAVA=>성춘향
 JSP=>임꺽정
 스프링=>향단이
*/
public class Test3 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JavaScript-JAVA-JSP-스프링";
		String s2 = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    ";
		
		String[] arr2 = s1.split("-");
		String[] arr = s2.split(",");
		for(int i=1; i<arr2.length; i++) {
			System.out.println(arr2[i]+"=>"+arr[i].trim());
		}
	}
}
