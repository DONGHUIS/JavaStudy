package chap12;
/*
 * Thread 생성
 * 2, Runnable 인터페이스 구현 => 구현클래스가 Thread 클래스는 아님.
 *   new Thread(Runnable 객체) 
 *   run() 메서드 구현
 */
class Runnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) { // 스레드
		System.out.println(Thread.currentThread().getName()+"스레드 시작");
		Runnable r = new Runnable1();
		Thread t1 = new Thread(r,"First");
		Thread t2 = new Thread(r,"Second");
		t1.start();t2.start();
		System.out.println(Thread.currentThread().getName()+"스레드 종료");
	}
}
