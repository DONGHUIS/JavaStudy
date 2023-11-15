package chap14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutPutStream 예제 : 파일에 데이터를 저장.
 * 
 * 주요메서드
 * void write(int data) : 1byte출력
 * void write(byte[] buf) : buf의 내용을 출력
 * void write(byte[] buf,int start,int len) : buf의 내용 start 인덱스 부터 len 길이 만큼 출력
 * 
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt파일에 내용 저장하기");
		//FileNotFoundException => 예외처리 필수
		//FileOutputStream : 파일에 내용을 쓸수 있는 스트림.
		//out.txt : 파일이름의 파일이 없는 경우 자동 생성. 사용자가 파일 생성 권한을 가지고 있는 경우.
		//		    권한이 없는 경우 FileNotFoundExceptiond 예외 발생함.
		//new FileOutputStream("out.txt") : out.txt 파일에 데이터를 쓸 준비 완료.
		//									기존 내용은 사라짐.
		//new FileOutputStream("out.txt",true) : out.txt 파일에 데이터를 쓸 준비 완료.
		//								   ,true를 붙이면 기존내용에 새로운 내용이 추가됨.
		FileOutputStream fos = new FileOutputStream("out.txt",true);
		//1byte로 출력을하면 한글이 꺠져서 출력된다.
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		//getBytes() : 문자열의 내용을 byte[] 배열로 번경.
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf,5,6);
		fos.flush();
	}
}
