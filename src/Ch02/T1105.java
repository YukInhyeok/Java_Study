/*
 * 바이트 스트림을 사용한 서버 클라이언트 프로그램
 	1. 서버소켓 생성과 사용방법
 		- ServerSocket 객체를 생성한다.
 		ServerSocket serverSocket = new ServerSocket(9000);
 	
 	- ServerSocket 객체에 대해  accept() 메소드를 호출한
 		Socketsocket = serverSockeet.accept();
 
 	- 서버 소켓을 사용하고 난 후에는 닫아야 한다.
 		serverSocket.close()
 
 	2. 클라이언트 소켓 생성과 사용방법
 		- Socket 객체를 생성한다.
 			Socket socket = new Socket("127.0.0.1", 9000);
 
 	- 데이터 송수신에 사용할 입력 스트림 객체와 출력 스트림 객체를 얻는다.
 		InputStrem in = socket.getInputStream();
 		OutputStream out = socket.getOutputStream();
 
 	- write 메소드와 read 메소드를 호출하여 데이터 송신 또는 수신한다.
 
 		out.write(data);
 		int data = in.read();
 
 	- 클라이언트 소켓 닫는다.
 		socket.close();
 
 */

import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;

public class T1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// 서버 소켓을 생성함
			serverSocket = new ServerSocket(9001);
			// 클라이언트 연결을 기다림
			socket = serverSocket.accept();
			// 입출력 스트림 얻음
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//클라이언트가 보낸 메시지를 읽어옴
			byte arr[] = new byte[100];
			in.read(arr);
			// 화면에 출력
			System.out.println(new String(arr));
			// 서버로 "Hello, Client" 출력
			String str = "Hello, Client";
			out.write(str.getBytes());
			
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
