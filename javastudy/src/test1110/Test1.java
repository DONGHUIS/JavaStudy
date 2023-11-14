package test1110;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * phoneNumArr 에서
 * 전화번호 일부를 입력받아 입력받은 번호를 포함하고 있는 번호를 찾기
   q를 입력받을때 까지 계속 반복하기
   
[결과]   

02
02-3456-7890
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
1234
051-1234-5678
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
q
 */
public class Test1 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"02-3456-7890","053-2456-7980", 
				"088-2346-9870","013-3456-7890",
				"051-1234-5678","02-1234-7890"};
		
		Scanner scan = new Scanner(System.in);
				
		while(true) {
			System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
			String input = scan.nextLine().trim();
			if(input.equals("")) {
				continue;
			}else if(input.equalsIgnoreCase("q")) {
				break;
			}
			String pattern =input;
			Pattern p = Pattern.compile(pattern);
			int cnt=0;
			
			for(int i=0;i<phoneNumArr.length;i++) {
				String phoneNum = phoneNumArr[i];
				//- 사이에 찾는 번호가 있는경우
				String num =phoneNum.replace("-","");
				Matcher m = p.matcher(num);
				if(m.find()) {
					cnt++;
					System.out.println(phoneNum);
				}
			}
			if(cnt==0) {
				System.out.println(input+":찾는번호가 없습니다.");
			}
			
		}
	}
}
