package chap14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *  File 클래스의 주요 메서드
 *  	getAbsoluteFile() 		=> 절대경로
 *  	boolean mkdir()  		=> 폴더 생성, 성공:true, 실패:false
 *  	boolean mkdirs() 		=> 여러 단계의 폴더 생성, 성공:true, 실패:false
 *  	boolean createNewFile() => 파일생성 , 성공:true , 실패 : false
 *  	getName()				=> 파일이름 리턴
 *  	length()				=> 파일의 크기(바이트)
 *  	boolean exists() 		=> 존재하는 파일(폴더) : true,없는파일(폴더):false
 *  	boolean renameTo(File f)=> 파일을 f파일로 이름 변경. 
 *  	long lastModified()		=> 1970이후부터 파일수정시간까지를 밀리초 리턴
 *  	boolean delete()		=> 파일 삭제
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성:%b\n",f1.getAbsoluteFile(),f1.mkdir());
		
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일생성:%b\n",f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일이름:%s,파일크기:%d\n",f2.getName(),f2.length());
		
		File f3 = new File("c:/temp1/test2.txt");
		if(f3.exists()) {
			System.out.println(f3.getName()+"파일은 존재합니다.");
		}else {
			System.out.println(f3.getName()+"파일은 없습니다.");
		}
		
		System.out.printf("%s->%s 이름번경:%b\n",f2.getName(),f3.getName(),f2.renameTo(f3));
		
		System.out.printf("%s 파일 최종 수정시간 : %s\n",
					f3.getName(),new Date(f3.lastModified()));
		
		System.out.printf("%s 파일 삭제:%b\n",f3.getName(),f3.delete());
		
	}
}
