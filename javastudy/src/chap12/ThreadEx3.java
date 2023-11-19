package chap12;

import java.util.Arrays;
import java.util.List;

class SumThread extends Thread{
	int startnum , lastnum , sum;
	SumThread(int startnum,int lastnum){
		this.startnum = startnum;
		this.lastnum=lastnum;
	}
	@Override
	public void run() {
		for(int i= startnum; i<=lastnum; i++) {
			sum+=i;
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) throws InterruptedException {
		List<SumThread> list = Arrays.asList(new SumThread(1,200),new SumThread(201,400),new SumThread(401,600),new SumThread(601,800),new SumThread(801,1000));
		
		for(SumThread s :list) {
			s.start();
			s.join();
		}
		int sum = 0;
		for(SumThread s:list) {
			sum+=s.sum;
		}
		System.out.println("1~1000까지의 합:"+sum);
	}
}
