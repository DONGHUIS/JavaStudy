package chap13;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * 	TreeSet을 이용해서 로또번호 생성기
 */
public class Exam3 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		
		Random ball = new Random();
		ball.setSeed(System.currentTimeMillis());
		while(lotto.size()<6) {
			lotto.add(ball.nextInt(45)+1); //1~45
		}
		System.out.println(lotto);
		
		Set<Integer> lotto2 = new TreeSet<>();
		while(lotto2.size()<6) {
			lotto2.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto2);
		
	}
}
