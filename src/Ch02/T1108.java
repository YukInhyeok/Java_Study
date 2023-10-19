package Ch02;/*
 * 문자 스트림을 사용한 서버 클라이언트 프로그램
 	1. InputStream 객체를 가지고 InputStreamReader 객체를 만들어 있다.
 		InputStreamReader reader = new InputStreamReader(in);
 
 	2. OutputStream 객체를 가지고 PrintWriter 객체를 만들 수 있다.
 		PrintWriter writer = new PrintWriter(out);
 
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class T1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 9002);
			
			// 입출력 스트림을 생성함
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			// 서버로 메세지 보냄
			
			writer.println("Hello, Server");
			writer.flush();
			
			// 서버에서 보낸 메시지 읽어와 화면에 출력
			String str = reader.readLine();
			System.out.println(str);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(Exception e) {
				
			}
		}
	}

}
