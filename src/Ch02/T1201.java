package Ch02;

public class T1201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	1. TCP 소켓 프로그래밍
 	1-1 서버 소켓과 소켓
 	- 서버 소켓(서버 담당) : 실행되어 클라이언트의 연결 요청을 기다리다가 요청이 들어오면 클라이어늩와 통신을 위하여 소켓을 생성하는 역할을 수행
 	- 소켓(서버/클라이언트) : 서버/클라이언트 소켓, 서버와의 통신을 하기 위해서 연결 요청을 수행
 
 	1-2 소켓 프로그래밍 절차 = 통신하기 위한 절차
 
 					서버								클라이언트
	1단계: ServerSocket  myServerSocket = new ServerSocket(7070);

	2단계 :				Socket mySocket = new Socket("127.0.0.1", 7070);
									<---------->
	3단계 : Socket mySocket = myServerSocket.accept()

	4단계 : mySocket.getOutputStream()   ------->  mySocket.getInputStream();
			mySocket.getInputStream()	<-------  mySocket.getOutputStream();	
 				  
* 단계 설명
	1단계 : [서버] 포트번호를 이용해서 ServerSocket을 열어 클라이언트의 요청을 기다린다. 				  

	2단계 : [클라이언트] 서버의 주소(127.0.0.1)와 포트번호(7070)를 이용해서 Socket을 열어 서버와 연결한다.  

	3단계 : [서버] 클라이언트의 요청을 받아 들여 서버의 Socket을 생성한다.

	4단계 : [서버][클라이언트] 서버와 클라이언트에서 연결된 Socket 에서 자료를 교환할 수 있도록 입력스트림과 출력스트림을 생성하여 서로 통신한다.


	1-3 서버와 클라이언트의 소켓 프로그래밍 방법
******클래스 ServerSockete, Socket

 					서버								클라이언트
 				
	>> 서버를 시작합니다.
	ServerSocket myServerSocket  = new ServerSocket(7070);
	>> 클라이언트가 접속하길 기다리고 있습니다.

									>> 서버로 접속하기 위해서 소켓을 생성한다
									Socket mySocket  =  new  Socket("127.0.0.1", 7070);
									>> 서버 접속이 성공했습니다. 
						<------------
	Socket mySocket = myServerSocket.accept();
	>> 클라이언트가 접속에 성공했습니다.

							*서버와 클라이언트간 연결*
			*서버와 클라이언트간에 정보를 송수신하기 위한 클라이언트 소켓에 스트림을 연결*
			BufferedReader in = new BufferedReader(
						new InputStreamReader(mySocket.getInputStream()));			   	
			PrintWriter out = new PrintWriter(
						new OutputStreamWriter(mySocket.getOutputStream()));

							*송수신하기 위한 메시지를 생성*	
								String msg = "안녕하세요? 클라이언트입니다.";
								out.println(msg);
					<----------------------
System.out.println("[클라이언트]" + in.readLine());		
[클라이언트] 안녕하세요? 클라이언트입니다.		

String msg = "서버에 접속하신것을 환영합니다.";
out.println(msg);
[서버] 서버에 접속하신것을 환영합니다.
					----------------------->
								System.out.println("[서버]" + in.readLine());
								[서버] 서버에 접속하신것을 환영합니다.
									
















 */
	}

}
