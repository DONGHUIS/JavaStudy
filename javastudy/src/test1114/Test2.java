package test1114;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 * 
 * [결과]
 * 화면에 파일명을 입력하세요(종료:exit)
	src/chap14/InputStreaEx1.java
	해당 파일 없음
	화면에 파일명을 입력하세요(종료:exit)
	src/chap14/InputStreamEx1.java
	해당 파일 없음
	화면에 파일명을 입력하세요(종료:exit)
	src/test1114/Test1.java
	package test1114;
 * 
 */
public class Test2 {
	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.err.println("화면에 파일명을 입력하세요(종료:exit)");
				String input = scan.next();
				if(input.equalsIgnoreCase("exit")) {
					System.err.println("종료");
					break;
				}
				//읽어올 파일이 없는 경우 : FileNotFoundException 예외 발생.
				FileInputStream fis = new FileInputStream(input);
			
				//읽어올 파일이 있는 경우 실행.
				byte[] buf = new byte[fis.available()];
				int data = 0;
				while((data=fis.read(buf))!= -1) {
					System.out.print(new String(buf,0,data));
				}	
			} catch (FileNotFoundException e) {  // FileNotFoundException  => IOException의 하위클래스
				System.err.println("해당파일이 없습니다.");
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}
}
