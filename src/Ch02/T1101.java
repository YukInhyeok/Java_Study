/*
 
 	1. 소켓과 서버 클라이언트 통신
       	서버응용프로그램 + 클라이언트응용프로그램
 	2. 서버 소켓과 클라이언트 소켓
  		: 서버 소켓은 서버 응용프로그램이 사용자의 접속을 기다리는(listen) 목적으로만 사용
  		: 클라이언트 응용프로그램에서는 클라이언트 소켓을 이용하여 서버에 접속
  		: 서버 소켓은 클라이언트가 접속해오면 클라이언트 소켓은 추가로 만들어 상대 클라이언와 통신하게 됨
  	
	3. 동작과정
		=> 1. 서버 응용프로그램은 ServerSocket 클래스를 이용하여 서버 소켓 객체를 생성하고
      			(new ServerSocket(서버 port)) 클라이언틔 접속을 받기 위해 기다린다.
      			서버 소켓을 생성할 때 포트 번호를 주어 해당 포트로 접속해 오는 클라이언트 기다리게 한다.
		=> 2. 클라이언트 응용프로그램은 Socket 클래스를 잉요하여 클라이언트 소켓 객체를 생성하고,
      			(new Socket(서버 IP, 서버 port)) 서버에 접속을 시도한다. 
      			소켓 객체를 생성 할 때, 접속할 서버 소켓의  IP 주소와 포트 번호를 지정한다.
		=> 3. 서버는 클라이언트로부터 접속 요청을 받으면 accept() 메소드에서 접속된 클라이언트와
				통신하도록 전용 클라이언트 소켓을 따로 생성한다.
		=> 4. 서버와 클라이언트 모두 소켓으로부터 입출력 스트림을 얻어내고, 데이터를 주고 받을 준비한다.
		=> 5. 서버에 생성된 클라이언트 전용 소켓과 클라이언트 소켓이 상호 연결된 채 스트림을 이용하여 양방향으로
     			데이터를 주고 받는다.
		=> 6. 서버는 클라이언트가 접속해 올 때마다 accept() 메소드에서 따로 전용 클리언트 소켓을 생성하여
				클라이언트와 통신하도록 한다. 통신이 끝나면 소켓을 닫는다.
  	
  		TCP Client							TCP Server
  											ServerSocket()
  												|
  											accept()
  						Connect				    |
  		Socket()     ------------------>        |   									    	
  			|									|
  		I/O Stream 생성 						I/O Stream 생성
  			|			Request					|
  	-->	write()		------------------->    read()
  	|	    | 		    Response 				|  Request 처리
    --- read()		<-------------------	write()	
  		    |									|
  		close()    							close()
  		
* 소켓을 이용한 서버 클라이언트 통신 프로그램의 전형적인 구조  		
  		
  		 TCP Client								TCP Server
  												listener = new ServerSocket(서버 port);
  													|
  												Socket socket = listner.accept();
  											Connect |
clientSocket = new Socket(서버 IP, 서버 port); ----->  |   									    	
  			|										|
clientSocket.getOutputStream();					socket.getInputStream();
  			|			Request						|
  	-->	write()		------------------->   		 read()
  	|	    | 		    Response 					|  Request 처리
    --- read()		<-------------------		write()	
  		    |										|
  		    |									clientSocket.close()
  	clientSocket.close()    					socket.close()

	# Socket 클래스의 메소드
	Socket(String host, int port)  : host: 접속할 서버의  IP 번호, port: 접속할 포트번호
	Socket(InetAddress addr, int port) : addr : 접속할 서버의  InetAddress 객체
	void close() : 서버 소켓을 닫는다.
	InputStream() getInputStream, OutputStream getOutputStream() : InputStream, OutputStream 객체 반환
	int getPort()

	# ServerSocket 클래스와 메소드  		    
	ServerSocket(int port) : 클라이언트 요청을 받아들일 포트번호를 갖고  ServerSocket 객를 생성 
	Socket accept() : 클라이언트의 요청 받아들인 다음 Socket 객체를 생성해서 반환한다.
	void close() : 서버 소켓을 닫는다.
  		    
 */
public class T1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
