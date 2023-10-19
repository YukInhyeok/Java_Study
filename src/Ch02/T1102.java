/*
 	java.net 패키지의 클래스 요약
 
 		클래스 이름                                        설명
 =======================================================================================================
 	Authenticator				네트워크 연결로부터 인증을 얻는 방법을 알고 있는 객체
 	ContentHandler				추상 클래스로서 URL Connection으로부터 객체를 읽는 모든 클래스의 수퍼클래스
 	DatagramPacket				데이터그램 패킷을 나타낸다.
 	DatagramSocket				데이터그램 패킷을 송수신하는 소캣을 나타낸다.
 	DatagramSocketImpl			추상 클래스로서 데이터그램과 방송 소캣 구현의 기반 클래스
 	HttpURLConnection			HTTP 특징들을 위한  URLConnection을 나타낸다
 	InetAddress					IP 주소를 나타낸다.
 	JarURLConnection			자바 아카이브 파일(JAR)을 나타낸다.
 	MulticastSocket				IP 방송 패킷을 송수신하는데 유용하다.
 	NetPermission				다양한 네트워크 권한을 위한 클래스
 	PasswordAuthentication		Authenticator에 의하여 쓰이는 데이터 홀더
 	ServerSocket				서버 소켓을 나타낸다.
 	Socket						클라이얹트 소켓을 구현한다.
 	SocketImpl					소켓을 구현하는 모든 클래스의 공통 수퍼클래스
 	SocketPermiision			소켓을 통한 네트워크 접근을 나타낸다.
 	URL							월드 와이드 웹에 존재하는 자원에 대한 포인터인  URL 을 나타낸다.
 	URLClassloader				JAR 파일과 디렉토리를 참조하는  URL  탐색 경로로부터 클래스와 자원을 로딩하는데 쓰인다.
 	URLConnection				애플리케이션과 URL 사이의 통신 선로를 나타내는 모든 클래스의 수퍼 클래스
 	URLDecoder					MIME 형식을 문자열로 바꿔주는 메소드를 포함한다.
 	URLEncoder					String을  MIME형식으로 변환하는 메소드를 포함한다.
 	URLStreamHandler			스트림 프로토콜 처리를 위한 모든 클래스의 수퍼큺래스	
 
  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class T1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br;
		String url = null;
		InetAddress[] addresses;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("웹사이트 주소를 입력하세요-> ");
		
		try {
			url = br.readLine();
			addresses = InetAddress.getAllByName(url);
			for(int i=0; i<addresses.length; i++) {
				System.out.println(addresses[i]);
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
