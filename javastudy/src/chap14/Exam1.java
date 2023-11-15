package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 내용을 입력받아 data.txt파일에 저장하기
 * FileOutPutStream 이용하기
 */
public class Exam1 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하실내용을 입력(종료:exit)");
		while(true) {
			String input = scan.next();
			if(input.equalsIgnoreCase("exit")) {
				System.err.println("시스템을 종료합니다.");
				break;
			}
			FileOutputStream fos = new FileOutputStream("data.txt",true);
			byte[] buf = (input+"\n").getBytes();//한글깨짐 방지
			fos.write(buf);
			fos.flush();
		}
	}
}
