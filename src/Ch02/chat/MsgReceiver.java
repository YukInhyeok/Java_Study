package chat;

/*
 * 수신을 위한 클래스 MsgReceiver 
 - 클래스 MsgReceiver : 메세지 수신을 수행하는 스레드이다.
 - 생성자에서 만든 소켓의 입력 스트림으로부터 메시지 받아 이를 그대로 표준출력을 출력한다.
 - 출력되는 형식 : [메시지를 보내온 별명] "메시지 내용"
 */

// 1단계 : 클래스 import

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

// 2단계 :  Thread 상속
public class MsgReceiver extends Thread{

//3단계 : 변수 및 클래스 선언
	String nickname;
	Socket socket;
	BufferedReader in;
	
//4단계 : MesReceiver 생성자 생성
	public MsgReceiver(String nickname, Socket socket) {
		this.nickname = nickname;
		this.socket = socket;
		// 5단계 : try-catch() 구문 생성
		try {
			//6단계 : 소켓에 입력 스트림을 연결
			in = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
		}catch(IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void run() {
	
		//7단계 : while() 문을 통해 받을 메시지가 없을 동안 반복
		while(in != null) {
			//8단계 : 소켓으로부터 받은 메세지를 화면 출력	
			try {
				System.out.println(in.readLine());
			}catch(IOException e) {
				System.out.println(e.toString());
			}
		}
		
		
		
	}
	
	
}
