package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStreamEx1.java 소스를 읽어서 , InputStreamEx1.bak 파일로 복사하기
 * FileInputSteam을 이용하고 , 한글 깨지지 않도록 한다.
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		FileOutputStream fos = new FileOutputStream("InputStreamEx1.backup");
		

		byte[] buf = new byte[fis.available()];
		int data = 0;
		while((data=fis.read(buf,0,buf.length))!=-1) {
			
		}	
		
		fos.write(buf);
		fos.flush();
		fos.close(); //데이터 통로를 막는다.
		
	}
}
