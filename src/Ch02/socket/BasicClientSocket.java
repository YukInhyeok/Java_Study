package socket;

// 1단계 : 클래스 import

import java.io.*;
import java.net.*;

public class BasicClientSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단계 : try-catch 구문을 생성
		try {
			//3단계 : 서버 주소와 포트번호를 지정하여 서버에 접속
			Socket mySocket = new Socket("127.0.0.1", 7070);
			System.out.println(">>> 서버 접속에 성공했습니다.");
			
			//4단계 : 서버 소켓에 스트림을 연결
			BufferedReader in = new BufferedReader(
					new InputStreamReader(mySocket.getInputStream()));  
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(mySocket.getOutputStream()));
			
			//5단계 : 서버 소켓에 메시지 전송
			
			String msg="안녕하세요? 클라이언트입니다.";
			
			//6단계 : 클라이언트로 생성한 문자열 전달
			out.println(msg);
			
			//7단계 : 문자열 전달하 내용을 바로 처리해주세요.
			out.flush();
			
			//8단계 : 클라이언트가 보내는 메시지를 출력
			System.out.println("[클라이언트] : "+msg);
			
			//9단계 : 서버 소켓으로 부터 받은 메세지를 화면에 출력
			System.out.println("[서버] : "+in.readLine());
			
			//10단계 : 서버 소켓 종료
			mySocket.close();
			
			
			
			
			
			
			
			
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}

}
