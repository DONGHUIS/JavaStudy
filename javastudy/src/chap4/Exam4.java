package chap4;
/*
 * 1-100까지의 짝수의 합을 구해라 
 */
public class Exam4 {
	public static void main(String[] args) {
		int sum=0,i=0;
		for(i=1 ; i<=100 ; i++) {
			if(i%2==0) {
				sum += i;
			}
			System.out.println("짝수의 합:"+sum);
			
			sum=0;
			i=0;
			for(i=2; i<=100; i+=2) {
				sum += i;
			}
			System.out.println("짝수의 합:"+sum);
			
			
			sum = 0;
			i=0;
			while(i<=100) {
				if(i%2==0) {
					sum+=i;
					i++;
				}
			}
			System.out.println("짝수의 합:"+sum);
		}
		
		sum = 0;
		i=2;
		while(i<=100) {
			sum+=i;
			i+=2;
		}
		System.out.println("짝수의 합:"+sum);
		
		
		sum=0;
		i=1;
		do {
			if(i%2==0) sum+=i;
			i++;
		}while(i<=100);
		System.out.println("짝수의 합:"+sum);
	}		
}	