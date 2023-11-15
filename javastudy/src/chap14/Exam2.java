package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 내용을 입력받아 data.txt파일에 저장하기
 * FileWriter 이용하기
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터를 입력해주세요.(종료:exit)");
		FileWriter fw = new FileWriter("data.txt");
		
		while(true) {
			String input = scan.next();
			if(input.equalsIgnoreCase("exit")) {
				System.err.println("시스템을 종료합니다.");
				break;
			}
			fw.write(input+"\n");
			fw.flush();
		}
	}
}
