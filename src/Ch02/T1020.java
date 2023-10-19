package Ch02;

import java.io.*;
import java.util.Date;

public class T1020 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// 읽을 파일 이름 지정
		String fname = "D:/test5.txt";
		
		//File 객체 생성
		
		File f = new File(fname);
		
		System.out.println("파일 : " + f.getName() + " 정보 :");
		System.out.println();
		System.out.println("\t패스 : " + f.getPath());
		System.out.println("\t절대패스 : " + f.getAbsolutePath());
		System.out.println("\t부모 : " + f.getParent());
		System.out.println("\t쓰기여부 :" + f.canWrite());
		System.out.println("\t읽기여부 :" + f.canRead());
		System.out.println("\t실행여부 : " + f.canExecute());
		System.out.println("\t폴더여부 : " + f.isDirectory());
		System.out.println("\t수정일 : " + new Date(f.lastModified()));
		System.out.println("\t파일크기 : " + f.length());
	}

}
