package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream 보조스트림 => 출력기능 강화
 *  1, OutputSteam 클래스의 하위클래스
 *  2, write()기능을 확장 => print(), println(), printf()
 *     - 모든 자료형 출력 기능 확장.
 *     - 예외처리 생략 가능.
 *  3, 표준출력(System.out), 표준오류(System.err) 객체의 자료형
 *  4, 객체생성시 OutputStream을 매개변수로 받아야 함.
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println('A');
		ps.write(65);
		ps.write(1234);
		ps.flush();
		ps.close();
	}
}
