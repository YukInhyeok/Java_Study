/*
1. 스트림 클래스에서 사용되는 주요 메소드 
1-1 바이트 스트림
1-1-1 InputStream 클래스의 주요 메소드

리턴타입              메소드                        설명
=============================================================================
int				read() throws IOException	1개의 문자를 읽고 리턴
											ex) read();
int				read(char[] b)				읽은 문자들을 	매개밧으로 주어진 문자 배열에 저장하고
 											읽은 문자 수를 리턴합니다.
 											ex) read(b);
int				read(char[] b, int off, int len)  len 개의 문자를 읽고 매개값으로 주어진 문자 배열에서
     											  b[off]부터  len개까지 저장합니다.
     											  그리고 읽은 문자 수를 리턴합니다.
     											  ex) read(b, 2, 3);
void			close()						입력 스트림을 닫습니다.
int				available()					입력 스트림에서 읽을 수 있는 바이트 수 반환	

1-1-2 OutputStream 클래스의 주요 메소드
리턴타입              메소드                        설명
=============================================================================
void			write()						1 바이트(byte)를 출력
											ex) abstact void write(int one) throws IOException

void			write(byte[] b)				매개값으로 주어진 주어진 배열 b의 모든 바이트를 출력한다.
void			write(byte[] b, int off, int len)  매개값으로 주어진 배열 b[off]부터 len개 까지의
													바이트를 출력한다.
													ex)  write(b, 2, 3);

void			flush()						출력 버퍼에 잔류하는 모든 바이트를 출력합니다.
void			close()						출력 스트림 닫고 관련된 모든 자원을 해제합니다.													

1-2 문자 스트림
1-2-1 Reader 클래스의 주요 메소드
리턴타입              메소드                        설명
=============================================================================
int				read() throws IOException	1개의 문자를 읽고 리턴
											ex) read();
int				read(char[] b)				읽은 문자들을 	매개밧으로 주어진 문자 배열에 저장하고
 											읽은 문자 수를 리턴합니다.
 											ex) read(b);
int				read(char[] b, int off, int len)  len 개의 문자를 읽고 매개값으로 주어진 문자 배열에서
     											  b[off]부터  len개까지 저장합니다.
     											  그리고 읽은 문자 수를 리턴합니다.
     											  ex) read(b, 2, 3);		
void			mark(int readAheadLimit)	스트림의 현재 위치를 표시
int				reset()						입력 스트림을 표시되어 있는 부분에서 다시 시작하여 준비
boolean			markSupported()				mark()와 reset()의 지원여부를 반환
boolean			ready()						입력 스트림에서 문자를 읽을 준비가 되어있는지 반환
int				skip(long n)				문자 n개만큰 건너뜀
void			close()						입력 스트림을 닫습니다.

1-2-2 Writer 클래스의 주요 메소드
리턴타입              메소드                        설명
=============================================================================
void			write()						1 바이트(byte)를 출력
											ex) abstact void write(int one) throws IOException

void			write(char[] b)				매개값으로 주어진 주어진 배열 b의 모든 바이트를 출력한다.
void			write(char[] b, int off, int len)  매개값으로 주어진 배열 b[off]부터 len개 까지의
													바이트를 출력한다.
													ex)  write(b, 2, 3);

void			write(String str)			매개값으로 주어진 문자열을 보냅니다.
void			write(String str, int off, int len) 매개값으로 주어진 문자열에서 off 순번부터 len개까지의
 													문자를 출력한다.

void			flush()						출력 버퍼에 잔류하는 모든 바이트를 출력합니다.
void			close()						출력 스트림 닫고 관련된 모든 자원을 해제합니다.	 
 */
public class T1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
