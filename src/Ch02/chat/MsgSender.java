package Ch02.chat;
/*
 * 송신을 위한 클래스 MsgSender
 -클래스 MsgSender : 메시지 송신을 수행하는 스레드
 -표준입력으로 메시지를 받아 별명(서버,클라이언트)을 앞에 붙여 상대방에게 송신한다.
 -송신되는 형식 : [메시지를 보내는 별명] "메시지 내용"
 -반복 while() 내부에서 표준입력 발생할 때마다 문장 s.nextLine();에 의해서 계속 메시지를 송신하도록 한다.
 */

// 1 단계
import java.io.*;
import java.net.*;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MsgSender extends Thread{
	//2단계 : 사용되는 클래스를 먼전 선언
	String nickname;
	Socket socket;
	PrintWriter out;
	
	//3단계 : MsgSender 생성자를 생성
	public MsgSender(String nickname, Socket socket) {
		this.nickname = nickname;
		this.socket = socket;
		//4단계 : try-catch() 구문 생성
		try {
			//5단계: 소켓에 출력 스트림을 연결
			out = new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream()));
		}catch(IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void run() {
		//6단계: 표준입력
		Scanner s = new Scanner(System.in);
		//7단계: while()문을 통해 반복
		while(out != null) {
			//8단계: 송신하려고 하는 문자열을 저장
			String msg = s.nextLine();
			//9단계 : 보내는 사람의 별명까지 앞에 붙여 전송
			out.println(nickname+msg);
			//10단계 : flush() 메소드를 통해 바로 처리하게 끔 만들어준다.
			out.flush();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
