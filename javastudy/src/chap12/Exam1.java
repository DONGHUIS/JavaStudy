package chap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ThreadEx3.java소스의 SumThread를 Runnable를 구현한 SumRunnable클래스로 번경하여 구현하기.
 */
class SumRunnable implements Runnable{
	int startnum,lastnum;
	int sum;
	
	SumRunnable(int startnum,int lastnum) {
		this.startnum=startnum;
		this.lastnum = lastnum;
	}
	@Override
	public void run() { 
		for(int i=startnum;i<=lastnum;i++) {
			sum+=i;
		}
	}
}
public class Exam1 {
	public static void main(String[] args) throws InterruptedException {
		
		List<SumRunnable> list = Arrays.asList(new SumRunnable(1,200),
				new SumRunnable(201, 400),new SumRunnable(401, 600),
				new SumRunnable(601, 800),new SumRunnable(801, 1000));
		
		//Runnable 객체인 경우 Thread가 아니기 때문에 Thread객체인 list를 만들어 처리를 해줘야된다.
		List<Thread> tlist = new ArrayList<Thread>();
		
		for(SumRunnable r :list) {
			tlist.add(new Thread(r));
		}
		
		for(Thread t : tlist) {
			t.start();
		}
		for(Thread t : tlist) {
			t.join();
		}
		
		int sum = 0;
		for(SumRunnable r : list) {
			sum+=r.sum;
		}
		System.out.println("1~1000까지의 합:"+sum);
	}
}
