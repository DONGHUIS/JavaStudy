package chap14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileInputStream예제 
 *   : 파일의 내용을 읽어서 콘솔에 출력하기
 *   
 *   주요메서드
 *     - int read() : 1byte씩 읽어서 buf에 저장, 실제 읽은 바이트수 리턴
 *     - int read(byte[] buf,int,start,int,len) : 
 *     		len 크기만큼 읽어서 buf의 start 인덱스부터 buf에 저장, 실제 읽은 바이트수 리턴
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = 
				new FileInputStream("src/chap14/InputStreamEx1.java");
		int data=0;
		System.out.println("====read()메서드를 이용하여 읽기");
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
		System.out.println("====int read(byte[] buf)메서드를 이용하여 읽기");
		fis=new FileInputStream("src/chap14/InputStreamEx1.java");
		byte[] buf = new byte[fis.available()];
		while((data=fis.read(buf))!= -1) {
			System.out.print(new String(buf,0,data));
		} 
		System.out.println("==== int read(byte[] buf ,int start , int len) 메서드를 이용하여 읽기");
		fis=new FileInputStream("src/chap14/InputStreamEx1.java");
		while((data=fis.read(buf,0,buf.length))!= -1) {
			System.out.print(new String(buf,0,data));
		}
		
		FileOutputStream fos = new FileOutputStream("InputStreamEx1.backup");
		fos.write(buf);
		fos.flush();
	}
}
