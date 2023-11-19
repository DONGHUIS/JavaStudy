package chap12;

import java.util.Arrays;
import java.util.List;

class PrintThread extends Thread{
	char ch;
	PrintThread(char ch){
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			for(int j=0;j<80;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		List<PrintThread> list = Arrays.asList(new PrintThread('A'),new PrintThread('B'), new PrintThread('C'));
		
		for(PrintThread p :list) {
			p.start();
			
		}
	}	
}