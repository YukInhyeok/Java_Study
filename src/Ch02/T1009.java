package Ch02;/* Writer 클래스의 주요 메소드
리턴타입              메소드                      							  설명
======================================================================================================================
void			write()									1 바이트(byte)를 출력
														ex) abstact void write(int one) throws IOException

void			write(char[] b)							매개값으로 주어진 주어진 배열 b의 모든 바이트를 출력한다.
void			write(char[] b, int off, int len)  		매개값으로 주어진 배열 b[off]부터 len개 까지의 바이트를 출력한다.
														ex)  write(b, 2, 3);

void			write(String str)						매개값으로 주어진 문자열을 보냅니다.
void			write(String str, int off, int len) 	매개값으로 주어진 문자열에서 off 순번부터 len개까지의 문자를 출력한다.

void			flush()									출력 버퍼에 잔류하는 모든 바이트를 출력합니다.
void			close()									출력 스트림 닫고 관련된 모든 자원을 해제합니다.	 
 */

/*
 프로그램 작성 단계
 1 단계 : 관련 클래스를 import 한다.
 2 단계 : throws Exception 추가 
 3 단계 : 객체 생성
 4 단계 : 데이터 초기화
 5 단계 : test4.txt에 출력
 6 단계 : 출력 버퍼에 있는 내용을 모두 출력
 7 단계 : 출력 스트림 종료 
 */

import java.io.Writer;
import java.io.FileWriter;

public class T1009 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Writer writer = new FileWriter("D:/test4.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char d = 'D';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		writer.write(d);
		
		writer.flush();
		writer.close();
		
	}

}
