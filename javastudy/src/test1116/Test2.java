package test1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 영어 타자 연습 프로그램 구현
 * 
 * 3초에 한번씩 List에 소문자 3~4자의 임의의 영어단어 추가하기.
 * 화면에 추가된이름을 출력하기.
 * 단어를 입력받아서 입력받은 단어를 리스트에서 제거.
 * List 의 모든 데이터 삭제되면 프로그램 종료
 * 
 [결과]
[abcdef]
>>abcdef
[cncm]
>>cncm
[rfaa]
>>rfaa  
 */

public class Test2 {
	List<String> words = new ArrayList<>();
	String[] data = {"a","b","c","d","e","f","g"};
	
	class DataAddThread extends Thread{
		@Override
		public void run() {
			while(true) {
				words.add(data[(int)(Math.random()*data.length)]);
				try {
					sleep(3*1000);
				} catch (InterruptedException e) {}
			}
		}
	}
	public static void main(String[] args) {
		Test2  c = new Test2();
		Scanner scan = new Scanner(System.in);
		c.words.add(c.data[0]);
		DataAddThread t1 = c.new DataAddThread();
		t1.setDaemon(true);
		t1.start();
		while(true) {
			System.out.println(c.words);
			System.out.println(">>");
			String in =scan.next().trim();
			c.words.remove(in);
			if(c.words.size()==0)break;
		}
		System.out.println("타자연습종료");
	}	
}