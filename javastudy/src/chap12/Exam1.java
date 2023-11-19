package chap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ThreadEx3.java소스의 SumThread를 Runnable를 구현한 SumRunnable클래스로 번경하여 구현하기.
 */
class SumRunnable implements Runnable{
	int startnum ,lastnum,sum;
	
	SumRunnable(int startnum,int lastnum) {
		this.startnum=startnum;
		this.lastnum=lastnum;
	}
	@Override
	public void run() {
		for(int i=startnum; i<=lastnum; i++) {
			sum+=i;
		}
	}
}

public class Exam1 {
	public static void main(String[] args) throws InterruptedException {
		List<SumRunnable> list = Arrays.asList(new SumRunnable(1, 200),new SumRunnable(201, 400),new SumRunnable(401, 600),new SumRunnable(601, 800),new SumRunnable(801, 1000));
		
		List<Thread> tlist = new ArrayList<Thread>();
		
		for(SumRunnable s : list) {
			tlist.add(new Thread(s));
		}
		
		for(Thread t: tlist) {
			t.start();
			t.join();
		}
		int sum=0;
		for(SumRunnable s: list) {
			sum+=s.sum;
		}
		System.out.println("총합:"+sum);
	}
}
