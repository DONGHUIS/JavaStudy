package chap11;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //빈 공간의 버퍼
		//sb.append("abc") : sb객체에 abc 문자열 추가
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);//abc123Afalse
		sb.delete(2, 4); //2번인덱스부터 4번인덱스앞 3번인덱스  (n,m) -> n ~ m-1
		System.out.println(sb);//ab23Afalse
		sb.deleteCharAt(4);
		System.out.println(sb); //ab23false
		sb.insert(5, "==");
		System.out.println(sb); //ab23f==alse
		sb.insert(6, 1.23);
		System.out.println(sb); //ab23f=1.23=alse
		sb= new StringBuffer("ABCDEFG");//ABCDEFG 문자열 저장
		sb.replace(0, 3, "abc"); // (0,3) -> (0 , 3-1)  (0,2) ABCDEFG - > ABC 해당되므로 abc로 바꾼다.
		System.out.println(sb); //abcDEFG
		sb.reverse();
		System.out.println(sb);//GFEDcba
	}
}
