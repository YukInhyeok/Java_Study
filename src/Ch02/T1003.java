/*
 리턴타입              메소드                      							  설명
================================================================================================================
void			write()									1 바이트(byte)를 출력
														ex) abstact void write(int one) throws IOException

void			write(byte[] b)							매개값으로 주어진 주어진 배열 b의 모든 바이트를 출력한다.
void			write(byte[] b, int off, int len)  		매개값으로 주어진 배열 b[off]부터 len개 까지의	바이트를 출력한다.
														ex)  write(b, 2, 3);

void			flush()									출력 버퍼에 잔류하는 모든 바이트를 출력합니다.
void			close()									출력 스트림 닫고 관련된 모든 자원을 해제합니다.	
 */

/*
 프로그램 작성 단계
 1 단계 : 관련 클래스를 import 한다.
 2 단계 : throws Exception 추가 
 3 단계 : 객체 생성
 4 단계 : 데이터 초기화
 5 단계 : test1.db에 출력
 6 단계 : 출력 버퍼에 있는 내용을 모두 출력
 7 단계 : 출력 스트림 종료 
 */

//1 단계 : 관련 클래스를 import 한다.
import java.io.*;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class T1003 {

	public static void main(String[] args) throws Exception {  // 2단계 : throws Exception 추가
		// TODO Auto-generated method stub

		// 3 단계 : 객체 생성
		OutputStream os = new FileOutputStream("D:/test1.db");
		
		// 4 단계 : 데이터 초기화
		byte a = 10;
		byte b = 20;
		byte c = 30;
		byte d = 40;
		
		// 5단계 : test1.db에 출력
		os.write(a);
		os.write(b);
		os.write(c);
		os.write(d);
		
		// 6 단계 : 출력 버퍼에 있는 내용을 모두 출력
		os.flush();
		
		//7 단계 : 출력 스트림 종료 
		os.close();
		
	}

}
