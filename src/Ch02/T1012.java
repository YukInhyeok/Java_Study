/*
 Reader 클래스의 주요 메소드
리턴타입              메소드                       								 설명
============================================================================================================================
int				read() throws IOException					1개의 문자를 읽고 리턴
															ex) read();
															
int				read(char[] b)								읽은 문자들을 	매개밧으로 주어진 문자 배열에 저장하고
 															읽은 문자 수를 리턴합니다.
 															ex) read(b);
 															
int				read(char[] b, int off, int len)  			len 개의 문자를 읽고 매개값으로 주어진 문자 배열에서 b[off]부터 len개까지 저장합니다. 
															그리고 읽은 문자 수를 리턴합니다.
     											  			ex) read(b, 2, 3);		
     											  			
void			mark(int readAheadLimit)					스트림의 현재 위치를 표시
int				reset()										입력 스트림을 표시되어 있는 부분에서 다시 시작하여 준비
boolean			markSupported()								mark()와 reset()의 지원여부를 반환
boolean			ready()										입력 스트림에서 문자를 읽을 준비가 되어있는지 반환
int				skip(long n)								문자 n개만큰 건너뜀
void			close()										입력 스트림을 닫습니다. 
 */
/*
 프로그램 작성 단계
 1 단계 : 관련 클래스를 import 한다.
 2 단계 : throws Exception 추가 
 3 단계 : 객체 생성
 4 단계 : while() 반복문 사용
 5 단계 : test4.txt에 입력
 6 단계 : 입력 스트림 종료 
 */

import java.io.Reader;
import java.io.FileReader;

public class T1012 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Reader reader = new FileReader("D:/test4.txt");
		
		System.out.println("아스키 코드값 \t 실제 문자값");
		
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.print(data+"\t\t\t");  // 아스키 코드값
			System.out.println((char)data);  // 문자의 실제 값
		}
		
		reader.close();
	}

}
