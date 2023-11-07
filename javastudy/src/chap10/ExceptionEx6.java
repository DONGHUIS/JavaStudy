package chap10;

public class ExceptionEx6 {
	public static void main(String[] args) {
		//throw : 예외 강제 발생
		
		//throw new RuntimeException("예외 강제 발생");//예외처리 생략가능
		try {	
			throw new Exception("예외 강제 발생"); //예외처리 필수
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); //예외 강제 발생
		}
	}
}
