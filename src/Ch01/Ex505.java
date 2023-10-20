package Ch01;

import java.io.IOException;

public class Ex505 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 대문자를 소문자로 변경하는 프로그램
		
		int ch=0;
		
		System.out.println("소문자를 대문자로 변경하는 프로그램");
		System.out.print("문자 한 개를 입력하세요. >> ");
		
		ch = System.in.read();
		
		if(ch >= 'a' && ch <= 'z') {
			ch = ch - 32;
		//65(A) = 97 - 32
		}
		
		System.out.println((char)ch);	
		
	}

}
