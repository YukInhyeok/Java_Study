package Ch01;

import java.io.IOException;

public class Ex31 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
 	- 내용 : System.in 객체로 read() 메소드를 호출하여 키보드에서 데이터를 입력을 받을 수 있다.
 	* read() 메소드 	 
 	- 형식 : public abstract int read() throws IOException
 	- 특징 : 1.키보드에서 한 byte씩 버퍼에 저장되어 있는 정보를 읽는다.
 			2. 더 이상 읽을 값이 없을 경우 -1을 리턴한다.
 			3. 예외(Exception) 처리해야 한다.
 				* 예외처리와 관련된 클래스를 import 해야 한다.
 				* java.io.IOException
 				 
 	- 순서 : 1단계 : 맨 위줄에 import java.io.IOException; 입력
 			2단계 : main() 함수 다음에 throws IOException 추가
 			3단계 : 입력하기 위한 변수(data)를 정의.
 				   이 때, 변수의 자료타입은 반드시 int 형을 사용한다.
 				   int data=0;
 			4단계 : read() 메소드를 이용해서 한 바이트 씩 입력받는다.
 					data = System.in.read();
 			5단계 : 출력은 data를 출력한다.
 			6단계 : 출력 메소드 System.out.println()를 사용해서 (char)data를 출력한다.
 */
		
			System.out.println("read() 메소드에 대한 예제입니다.");
			System.out.println();
			int data=0;
			System.out.print("한 바이트의 문자를 입력해주세요. >> ");
			data = System.in.read();
			
			System.out.println(data);
			System.out.println((char)data);
	}

}
