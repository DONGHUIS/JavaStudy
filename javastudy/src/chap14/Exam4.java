package chap14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  화면에서 파일명을 입력받고 , 출력을 시작한 라인번호와 출력라인수를 입력받기
 *  파일에서 시작라인부터 출력라인수까지만 화면 출력하기
 *  
 *  src/chap14/FileReaderEx1.java
 */
public class Exam4 {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요.");
		String input = stdin.readLine();//화면에서 한줄을 입력.String으로 입력됨.
		
		System.out.println("시작라인수:");
		String start =stdin.readLine();
		
		System.out.println("마지막라인수:");
		String slen = stdin.readLine();
		
		//출력할 시작 라인수 : 정수형으로 변경.
		int st = Integer.parseInt(start);
		//화면에 출력할 라인수 : 정수형으로 변경.
		int len = Integer.parseInt(slen);
		
		//입력받은 파일을 읽기
		BufferedReader br = new BufferedReader(new FileReader(input));
		
		String data = null;
		int line = 0; //화면에 표시할 라인. 파일의 라인수
		int cnt =0;   //현재 시점에 출력할 라인갯수.
		while((data=br.readLine())!= null) {
			++line;
			if(line<st) {
				continue; //라인번호가 될때까지 계속 읽기
			}
			if(cnt>=len) {
				break;   //len까지 출력한 경우 출력안함. 반복문에서 빠짐.
			}
			++cnt; //출력한 라인의 갯수 증가
			System.out.println(line+":"+data);
		}
		
		br.close();
		stdin.close();
	}
}
