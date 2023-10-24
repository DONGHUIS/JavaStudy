package chap2;

public class Assignment {
	public static void main(String[] args) {
		//1. 잘못된 문장을 골라내고 그 이유를 설명하시오.        
	       	char       a='a';    //정상
	        //char       b="a";    //오류
	        String     c="a";   //정상
	        //String     d='a'; //오류
	        //char       e='ab';  //오류 char형은 문자한개만 가능
	        String     f="ab";  //정상
	        //char       g = '';  //오류 char형은 문자한개만 가능
	        String     h = ""; //정상 String형은 빈문자열 가능하다.

	        //byte   var1 = 128;  //-128 ~ -127까지만 저장이 가능하므로 저장이 가능하다. 
	        short  var2 = 128;    //정상
	        //int    var3 = 28L;  //오류 28L long형 리터널. <- long형 변환
	        long   var4 = 128L; //정상
	        //float  var5 = 1.2; //오류 실수형리터널은 double형임.  
	        float var5 = 1.2F;  
	        double var6 = 1.2; //정상
	        float var9 = '1';    //정상 float <- char 형변환. '1'아스키코드값 49 이므로 49.0이 출력된다.
	        
	    
	

	/*2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
	     변수 이름으로 사용할 수 있는 것을 고르시오.
	     변수이름으로 사용할 수 없는 이유를 작성하시오 
	     A. false  	//예약어로 안된다.
	     B. default //예약어로 안된다.
	     C. _var    //사용가능하다.
	     D. a-class //-이것은 사용할수 없다.
	     
	3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
	  변수 이름으로 사용할 수 있는 것을 고르시오.
	   A. s#arp  //특수문자 #은 사용하면 안된다.
	   B. static  //예약어이다.
	   C. _class //사용가능하다.
	   D. class  //예약어이다.
	   
	4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
	      -128 ~ 127이 허용범위이다.
	    */
	}
}
