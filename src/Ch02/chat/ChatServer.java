package chat;
/*
 * 채팅을 위한 서버로 스레드인 MsgSender와 MsgReceiver를 사용
 - 클래스 ChatServer : 1:1 채팅을 위한 서버로 생성자에서 ServerSocket()을 생성
 - 메서드 communicate() : 클라이언트의 접속을 기다리다 접속이 이루어지면 소켓을 생성하고 정보를 출력하며
   						클라이언와의 메시지 송수신을 위한 스레드 MsgSender와 MsgRecevier 생성하고 실행한다.
 - 클라이언트에게 메세지를 보내려면문장을 쓴 후 [Enter] 키를 누른다.
 - 반대로 클라이언트로부터 메시지를 받으면 표준출력에 [클라이언트] "메세지 내용" 형식으로 표시
 */
// 1단계 : 클래스 import
import java.io.*;
import java.net.*;

public class ChatServer {
	
	//2단계 : 변수나 클래스를 선언
	int port = 7070;
	ServerSocket server;
	Socket socket;
	
	//3단계 : ChatServer의 생성자 생성
	public ChatServer(int port){
		this.port = port;
		System.out.println(">>> 서버를 시작합니다.");
		// 4단계: try-catch() 생성
		try {
			//5단계 : ServerSocket 객체 생성
			
			server = new ServerSocket(port);
			
		}catch(IOException e) {
			//System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	public void communicate() {
		// 6 단계 : 대기문장 출력
		System.out.println(">>> 클라이언트가 접속하기를 기다리고 있습니다.");
		
		// 7단계 : try-catch() 생성
		try {
			//8단계 : 클라이언트 접속 때까지 대기하면서 클라이언트가 접속을 요청하면 요청을 받아들인다.
			socket = server.accept();
			
			//9단계 : 주소와 포트를 나타내는 printInfo() 메소드 생성
			printInfo();
			
			//10단계 : 서버 소켓에 입력과 출력을 위한 sender와 receiver 연결
			MsgSender sender = new MsgSender("서버", socket);
			MsgReceiver receiver = new MsgReceiver("서버", socket);
			
			//11단계 : sender와  receiver 의 스레드를 실행
			receiver.start();
			sender.start();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	public void close() {
		// 12단계 : try-catch() 생성
		try {
			//13단계 : 서버 소켓 종료
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printInfo() {
		System.out.println(">>> 클라이언트가 접속에 성공했습니다.");
		//14단계 : 서버 포트 번호, 클라이언트 주소, 클라이언트 포트번호 출력
		System.out.println("	서버 포트번호:"+ socket.getLocalPort());
		System.out.println("	클라이언트 주소:"+socket.getInetAddress());
		System.out.println("	클라이언트 포트번호:"+socket.getPort()+ "\n");
		System.out.println(">>> 클라이언트에 전달할 메세지를 쓰고 Enter를 누르세요.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port = 7070;
		ChatServer myServer = new ChatServer(port);
		myServer.communicate();
				
	}
}
