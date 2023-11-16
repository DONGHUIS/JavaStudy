package test1116;

import java.util.ArrayList;
import java.util.List;

/*
 * ThreadEx8번의 DataAddThread 를 Runnable 인터페이스를 구현한
 *   방식으로 변경하기 
 */
class DataAddThread implements Runnable{
	List<String> words = new ArrayList<>();
	String[] data = {"태연","유리","윤아","효연","수영","서현","써니"};
		
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
public class Test1 {
	public static void main(String[] args) {
		
	}
}