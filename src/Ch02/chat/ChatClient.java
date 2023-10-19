package Ch02.chat;

/*
 * 채팅 클라이언트 클래스 ChatClient
 - 클래스 ChatClient : 1:1 채팅을 위한 클라이언트로 생성자에서 Socket 객체를 생성하여 서버에 접속하고 정보를 출력한다.
 - 메소드 communicate()에서 서버와의 메시지 송수신을 위한 스레드 MsgSender와  MsgReceiver를 생성하고 실행한다.
 - 서버에게 메시지를 보내려면 문장을 쓴 후 [Eneter] 키를 누른다.
 - 반대로 서버로부터 메시지를 받으면 표준출력에 [서버] "메시지내용" 형식으로 표시
 */

// 1단계 : 클래스 import
import java.io.*;
import java.net.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	
	// 2단계 : 클래스 선언
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	
	// 3단계 : ChatClient 생성자 생성
	public ChatClient(String ip, int port) {
		// 4단계 : try-catch() 생성
		try {
			//5단계 : 서버 소켓 종료
			socket = new Socket(ip, port);
			//6단계 : 클라이언트 포트번호, 서버 주소, 서버 포트가 출력되는 메서드 호출
			printInfo();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printInfo() {
		System.out.println(">>> 서버가 접속에 성공했습니다.");
		//7단계 : 서버 포트 번호, 클라이언트 주소, 클라이언트 포트번호 출력
		System.out.println("	클라이언트 포트번호:"+ socket.getLocalPort());
		System.out.println("	서버 주소:"+socket.getInetAddress());
		System.out.println("	서버 포트번호:"+socket.getPort()+ "\n");
		System.out.println(">>> 서버에 전달할 메세지를 쓰고 Enter를 누르세요.");
	}
	
	public void communicate() {
		//8단계 : 클라이언트 소켓에 입력과 출력을 위한  sender와 receiver를 연결
		Ch02.chat.MsgSender sender = new Ch02.chat.MsgSender("클라이언트: ", socket);
		Ch02.chat.MsgReceiver receiver = new Ch02.chat.MsgReceiver("클라이언트: ", socket);
		//9단계 :sender와 receiver를 실행
		sender.start();
		receiver.start();
	}
	
	public void close() {
		// 10단계 : try-catch() 생성
		try {
			//11단계 : 클라이언트 소켓 종료
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12단계 : 서버 주소와 포트번호를 지정하여 서버에 접속
		ChatClient client = new ChatClient("127.0.0.1", 7070);
		//13단계 : 서버와 통신
		client.communicate();
		
	}

}
