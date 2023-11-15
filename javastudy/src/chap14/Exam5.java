package chap14;

import java.io.File;

/*
 * c:/windows 폴더의 하위 폴더 갯수와 파일의 갯수 , 파일의 총크기 출력하기
 */
public class Exam5 {
	public static void main(String[] args) {
		String filePath = "c:/img";
		int dircnt = 0 ,filecnt=0;
		long size = 0;
		File f1 = new File(filePath);
		String[] files = f1.list();
		
		for(String f : files) {
			File f2 = new File(f1,f);
			System.out.println(f);
			if(f2.isDirectory()) {
				dircnt++;
			}else if(f2.isFile()) {
				filecnt++;
				size+=f2.length();
			}
		}
	
		System.out.printf("%d: 하위폴더 갯수,%d :파일의 갯수",dircnt,filecnt);
		System.out.println("파일의크기합 : "+size);
	}
}
