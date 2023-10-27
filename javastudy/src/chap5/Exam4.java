package chap5;
/*
 * command라인에서 숫자를 입력받아 숫자의 자리수합을 출력하기 
 * java Exam4 1234
 * 
 * 1+2+3+4 = 10
 */
public class Exam4 {
	 public static void main(String[] args) {
		
		 if(args.length==0) {
			 System.out.println("command라인에 파라미터를 입력.");
				return;//현재 main 메서드 종료 => 프로그램 종료
		 }
		 
		 int sum = 0;
		 char[] nums = args[0].toCharArray();
		 
		 for(int i=0; i<nums.length; i++) {
			//System.out.println("nums["+i+"]="+nums[i]);
			 //'0' : 48
			 //'1' : 49
			 sum += nums[i]-'0'; //순수 숫자합합계
			 System.out.print(nums[i] +(i==nums.length-1?"=":"+"));
		 }
		 System.out.println(sum);
		 
	}
}
