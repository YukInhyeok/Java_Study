package socket;

// 1단계 : 클래스 import
import java.io.*;
import java.net.*;

public class BasicServerSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2단계 : try-catch 구문 생성
		try {
			//3단계 : 서버 시작 문구 출력, 서버 소켓 선언
			System.out.println(">>> 서버를 시작합니다.");
			ServerSocket myServerSocket = new ServerSocket(7070);
			
			//4단계 : 클라이언트가 접속하기를 기다린다.
			System.out.println(">>> 클라이언트가 접속하길 기다리고 있습니다.");
			Socket mySocket = myServerSocket.accept();
			
			//5단계 : 클라이언트가 접속하면 스트림 연결하기 위한 코드
			System.out.println(">>> 클라이언트가 접속에 성공했습니다.");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(mySocket.getInputStream()));  
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(mySocket.getOutputStream()));
			
			//6단계 : 클라이언트 소켓으로부터 받은 메세지를 화면에 출력
			System.out.println("[클라이언트] : " + in.readLine());
			
			//7단계 : 클라이언트에게 전달할 문자열을 생성
			String msg="서버에 접속하신 것을 환경합니다.";
			
			//8단계 : 클라이언트로 생성한 문자열 전달
			out.println(msg);
			
			//9단계 : 문자열 전달하 내용을 바로 처리해주세요.
			out.flush();
			
			//10단계 : 클라이언트로 전달하는 내용을 서버 콘솔에 출력
			System.out.println("[서버] : " + msg);
			
			//11단계 : 소켓을 종료한다.
			mySocket.close();
			
			
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}

}
