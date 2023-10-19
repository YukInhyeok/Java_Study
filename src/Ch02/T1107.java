/*
 * 문자 스트림을 사용한 서버 클라이언트 프로그램
 	1. InputStream 객체를 가지고 InputStreamReader 객체를 만들어 있다.
 		InputStreamReader reader = new InputStreamReader(in);
 
 	2. OutputStream 객체를 가지고 PrintWriter 객체를 만들 수 있다.
 		PrintWriter writer = new PrintWriter(out);
 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class T1107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9002);
			socket = serverSocket.accept();
			
			// 입출력 스트림 생성
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			// 클라이언트가 보낸 메시지를 일거와 화면에 출력함
			String str = reader.readLine();
			System.out.println(str);
			
			// 클라이언트로 메세지를 보냄
			writer.println("Hello, Client");
			writer.flush();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
				serverSocket.close();
			}catch(Exception ignored) {
				
			}
		}
	}

}
