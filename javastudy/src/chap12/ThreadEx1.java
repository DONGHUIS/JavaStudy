package chap12;
class Thread1 extends Thread{
	Thread1(String name){
		super(name);
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"="+getName());
			try {
				sleep(3000);
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx1{
	public static void main(String[] args) {
		System.out.println("main스레드 시작");
		Thread t1 = new Thread1("First");
		Thread t2 = new Thread1("Second");
		t1.start();
		t2.start();
		System.out.println("main스레드 종료");
	}
}
