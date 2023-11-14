package chap14;

import java.io.IOException;
import java.io.OutputStream;

/*
 * OutpusStream : 바이트형 출력스트림 -> 1바이트단위 출력
 */
public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('가'); //한글출력 깨짐
		out.write('나');
		out.write('다');
		out.flush(); //flush : 버퍼의 내용을 목적지로 강제 전송
	}
}
