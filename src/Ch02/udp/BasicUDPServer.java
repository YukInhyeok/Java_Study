package udp;

/*
 * UDP 통신을 위한 서버 구현
 - 수신된 DatagramPacket에서 메소드 getAddress()와  getPort()을 이용하면 이 패킷을 저송한 주소와 포트번로를 알수 있다.
 - 자료를 수시한 클라이언트에게 자료를 전송하려면, 주소와 포트번호를 사용하여 다시  DatagraPacket을 생성하여 DatagraPacket의 메소드 send()로 송신한다. 
   
 */

import java.net.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPServer {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport= 7777, cport;
	
	public BasicUDPServer(int sport) {
		try {
			// DatagramPacket을 sport로 지정하여 생성
			this.sport = sport;
			System.out.println(">>> 서버를 시작합니다.");
			System.out.println(">>> 클라이언트가 접속하길 기다리고 있습니다.");
			this.dsock = new DatagramSocket(sport);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void communicate(){
		try {
			// 키보드로부터 전송할 문자열을 입력받기 위해 BufferedReader 형태 변환
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			while(true) {
				byte[] buffer = new byte[1024];
				
				// 클라이언트에서 전송되는 DatagramPacket을 받기 위해 rPacket 생성한 후 대기
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);
				
				// 전송받은 결과를 문자열 변환
				// String(byte[] bytes, int offset, int length);
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				
				// 클라이언트의 주소와 포트번호를 반환
				client = rPack.getAddress();
				cport = rPack.getPort();
				
				// 전송받은 결과를 출력하고 quit이면 종료
				
				System.out.println("[클라이언트" + client + ":" + cport + "]" + ":" + strIn);
				if(strIn.trim().equals("quit")) {
					break;
				}
				
				// 표준입력으로 입력된 정보를 DatagramPacket으로 만들어 클라이언트로 전송
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
			  	dsock.send(sPack);
			}
			System.out.println("UDP 서버를 종료합니다.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}

}

