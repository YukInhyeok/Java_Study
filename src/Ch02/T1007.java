package Ch02;/*
 리턴타입              메소드                     						   설명
================================================================================================================================
int				read() throws IOException				1개의 문자를 읽고 리턴
														ex) read();
														
int				read(char[] b)							읽은 문자들을 	매개밧으로 주어진 문자 배열에 저장하고 읽은 문자 수를 리턴합니다.
 														ex) read(b);
 														
int				read(char[] b, int off, int len)  		len 개의 문자를 읽고 매개값으로 주어진 문자 배열에서 b[off]부터  len개까지 저장합니다.
     											  		그리고 읽은 문자 수를 리턴합니다.
     											  		ex) read(b, 2, 3);
     											  		
void			close()									입력 스트림을 닫습니다.
int				available()								입력 스트림에서 읽을 수 있는 바이트 수 반환	
 */

/*
 프로그램 작성 단계
 1 단계 : 관련 클래스를 import 한다.
 2 단계 : throws Exception 추가 
 3 단계 : 객체 생성
 4 단계 : 바이트 배열 생성
 5 단계 : while() 반복문 사용
 6 단계 : test1.db에 입력
 7 단계 : 입력 스트림 종료 
 */

import java.io.InputStream;
import java.io.FileInputStream;

public class T1007 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream is = new FileInputStream("D:/test2.db");
		
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read(buffer);
			
			if(readByteNum == -1)
				break;
			for(int i=0; i<readByteNum; i++) {
			//for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
		
	}

}
