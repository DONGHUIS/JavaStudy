package chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO(Last In First Out)
 * 		Stack 클래스 : Vector클래스의 하위클래스
 * 			주요메서드 
 * 				push(Object) : 객체를 stack에 추가
 * 				Object pop() : stack에서 객체를 꺼내 리턴,stack에서 객체 제거 
 * 				Object peek() : stack에서 조회 대상 객체를 리턴.
 * Queue : FIFO(First In First Out) 
 * 		Queue 인터페이스 : LinkedList가 구현 클래스임.
 * 			주요메서드 
 * 				offer(Object) : 객체를 Queue에 추가
 * 				Object poll() : 객체를 Queue에서 꺼내 리턴,Queue에서 객체 제거
 * 				Object peek() : Queue에서 조회대상 객체 리턴.
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"KONA","RAY","SANTAFE","G90"};
		Stack<String> stack = new Stack<>();
		Queue<String>queue = new LinkedList<>();
		for(String s:cars) {
			stack.push(s); //push() -> 스택에 데이터추가 
			queue.offer(s);//offer() -> 큐에 데이터 추가
		}
		System.out.println("스택에 저장된 객체의 갯수:"+stack.size());
		System.out.println(stack);
		System.out.println("큐에 저장된 객체의 갯수:"+queue.size());
		System.out.println(queue);
		System.out.println("stack의 조회대상객체"+stack.peek());
		System.out.println("queue의 조회대상객체"+queue.peek());
		System.out.println("stack의 조회대상객체"+stack.peek());
		System.out.println("queue의 조회대상객체"+queue.peek()+"\n");
		
		System.out.println("stack의 객체 꺼내기"+stack.pop());
		System.out.println("queue의 객체 꺼내기"+queue.poll());
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("stack의 조회대상객체"+stack.peek());
		System.out.println("queue의 조회대상객체"+queue.peek());
		
	}
}
